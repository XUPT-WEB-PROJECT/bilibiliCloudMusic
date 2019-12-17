package controller;


import bean.User;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.github.pagehelper.util.StringUtil;
import org.json.JSONObject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.UserService;
import util.MD5Util;
import util.ParamJudge;

import java.util.List;

@RestController
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(value = "/login", produces = {"application/json;charset=UTF-8"})
    public Object login(String userName, String pwd) {
        if(StringUtil.isEmpty(userName) || StringUtil.isEmpty(pwd)) return "{\"errCode\":4,\"errMsg\":\"参数错误！\"}";
        User user = userService.login(userName, MD5Util.getMD5(pwd));
        if (user != null) return new JSONObject(user).put("errCode",0).toString();
        return "{\"errCode\":1,\"errMsg\":\"用户名或密码错误！\"}";
    }

    @RequestMapping(value = "/register",produces = {"application/json;charset=UTF-8"})
    public Object register(String userName, String pwd){
        if(StringUtil.isEmpty(userName) || StringUtil.isEmpty(pwd)) return "{\"errCode\":4,\"errMsg\":\"参数错误！\"}";
        User user = userService.searchUserByUserName(userName);
        if(user!=null) return "{\"errCode\":9,\"errMsg\":\"用户名已存在！\"}";
        int change = userService.register(userName, MD5Util.getMD5(pwd));
        if(change == 0){
            System.out.println("change == 0");
            return "{\"errCode\":2,\"errMsg\":\"用户添加失败！\"}";
        }
        User newUser = userService.searchUserByUserName(userName);
        return new JSONObject(newUser).put("errCode",0).toString();
    }

    @RequestMapping(value = "/searchUserByUserName",produces = {"application/json;charset=UTF-8"})
    public Object searchUserByUserName(String userName){
        if(StringUtil.isEmpty(userName)) return "{\"errCode\":4,\"errMsg\":\"参数错误！\"}";
        User user = userService.searchUserByUserName(userName);
        if (user != null) return new JSONObject(user).put("errCode",0).toString();
        return "{\"errCode\":3,\"errMsg\":\"查无此人！\"}";
    }

    @RequestMapping(value = "/getFollowingByUserId",produces = {"application/json;charset=UTF-8"})
    public Object getFollowingByUserId(Integer userId, Integer pn, Integer pSize){
        if(ParamJudge.isNOTPositive(userId)) return "{\"errCode\":4,\"errMsg\":\"参数错误！\"}";
        if(pn == null || pn < 0) pn = 1;
        if(pSize == null || pSize < 0) pSize = 10;
        PageHelper.startPage(pn, pSize);
        List<User> followings = userService.getFollowingByUserId(userId);
        return new PageInfo<User>(followings);
    }

    @RequestMapping(value = "/getFollowerByUserId",produces = {"application/json;charset=UTF-8"})
    public Object getFollowerByUserId(Integer userId, Integer pn, Integer pSize){
        if(ParamJudge.isNOTPositive(userId)) return "{\"errCode\":4,\"errMsg\":\"参数错误！\"}";
        if(pn == null || pn < 0) pn = 1;
        if(pSize == null || pSize < 0) pSize = 10;
        PageHelper.startPage(pn, pSize);
        List<User> followings = userService.getFollowerByUserId(userId);
        return new PageInfo<User>(followings);
    }

    @RequestMapping(value = "/following",produces = {"application/json;charset=UTF-8"})
    public Object following(Integer userId, Integer followerId){
        if(ParamJudge.isNOTPositive(userId, followerId)) return "{\"errCode\":4,\"errMsg\":\"参数错误！\"}";
        int re =  userService.following(userId, followerId);
        if(re == 1) return "{\"errCode\":0,\"errMsg\":\"关注成功！\"}";
        return "{\"errCode\":5,\"errMsg\":\"关注关系已存在！\"}";
    }

    @RequestMapping(value = "/unFollow",produces = {"application/json;charset=UTF-8"})
    public Object unFollow(Integer userId, Integer followerId){
        if(ParamJudge.isNOTPositive(userId, followerId)) return "{\"errCode\":4,\"errMsg\":\"参数错误！\"}";
        int re = userService.unFollow(userId, followerId);
        if(re == 1) return "{\"errCode\":0,\"errMsg\":\"取关成功！\"}";
        return "{\"errCode\":6,\"errMsg\":\"取消关注关系不存在！\"}";
    }

}
