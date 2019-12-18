package controller;

import bean.*;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import service.FavorService;
import service.UserService;
import util.ParamJudge;

import java.util.List;

@Controller
public class FavorController {

    private FavorService favorService;
    private UserService userService;

    public FavorController(FavorService favorService, UserService userService) {
        this.favorService = favorService;
        this.userService = userService;
    }

    @ResponseBody
    @RequestMapping(value = "/getFavorAlbumAndMusic", produces = {"application/json;charset=UTF-8"})
    public Object getFavorAlbumAndMusic(Integer userId){
        if(ParamJudge.isNOTPositive(userId)) return "{\"errCode\":4,\"errMsg\":\"参数错误！\"}";
        User user = userService.searchUserByUserId(userId);
        if(user == null) return  "{\"errCode\":11,\"errMsg\":\"无效的userId！\"}";
        List<Album> albumList = favorService.getFavorAlbum(userId);
        List<Music> musicList = favorService.getFavorMusic(userId);
        JSONArray array = new JSONArray();
        array.put(albumList);
        array.put(musicList);
        JSONObject object = new JSONObject();
        object.put("album", albumList);
        object.put("music", musicList);
        return object.toString();
    }

    @ResponseBody
    @RequestMapping(value = "/getUserRelation", produces = {"application/json;charset=UTF-8"})
    public Object getUserRelation(Integer userId){
        if(ParamJudge.isNOTPositive(userId)) return "{\"errCode\":4,\"errMsg\":\"参数错误！\"}";
        User user = userService.searchUserByUserId(userId);
        if(user == null) return  "{\"errCode\":11,\"errMsg\":\"无效的userId！\"}";
        List<List<User>> users = favorService.getUserRelation(userId);
        List<Singer> singers = favorService.getFavorSinger(userId);
        JSONArray array = new JSONArray();
        array.put(users);
        array.put(singers);
        JSONObject object = new JSONObject();
        object.put("user", users);
        object.put("singer", singers);
        return object.toString();
    }

    @ResponseBody
    @RequestMapping(value = "/getBlog", produces = {"application/json;charset=UTF-8"})
    public Object getBlog(Integer userId, Integer pn , Integer pSize){
        if(ParamJudge.isNOTPositive(userId)) return "{\"errCode\":4,\"errMsg\":\"参数错误！\"}";
        User user = userService.searchUserByUserId(userId);
        if(user == null) return  "{\"errCode\":11,\"errMsg\":\"无效的userId！\"}";
        if(pn == null || pn < 0) pn = 1;
        if(pSize == null || pSize < 0) pSize = 10;
        PageHelper.startPage(pn, pSize);
        List<Blog> blog = favorService.getBlog(userId);
        return new PageInfo<>(blog);
    }

}
