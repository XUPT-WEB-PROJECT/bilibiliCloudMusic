package controller;

import bean.Singer;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.github.pagehelper.util.StringUtil;
import org.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import service.SingerService;
import util.ParamJudge;

import java.util.List;

@Controller
public class SingerController {

    private SingerService singerService;

    public SingerController(SingerService singerService) {
        this.singerService = singerService;
    }

    @ResponseBody
    @RequestMapping(value = "/searchSingerBySingerId", produces = {"application/json;charset=UTF-8"})
    public Object searchSingerBySingerId(Integer singerId){
        if(ParamJudge.isNOTPositive(singerId)) return "{\"errCode\":4,\"errMsg\":\"参数错误！\"}";
        Singer singer = singerService.searchSingerBySingerId(singerId);
        if (singer != null) return new JSONObject(singer).put("errCode",0).toString();
        return "{\"errCode\":3,\"errMsg\":\"查无此人！\"}";
    }

    @ResponseBody
    @RequestMapping(value = "/searchSingerBySingerName", produces = {"application/json;charset=UTF-8"})
    public Object searchSingerBySingerName(String singerName, Integer pn, Integer pSize){
        if(StringUtil.isEmpty(singerName)) return "{\"errCode\":4,\"errMsg\":\"参数错误！\"}";
        if(pn == null || pn < 0) pn = 1;
        if(pSize == null || pSize < 0) pSize = 10;
        PageHelper.startPage(pn, pSize);
        List<Singer> singers = singerService.searchSingerBySingerName(singerName);
        return new PageInfo<Singer>(singers);
    }

    @ResponseBody
    @RequestMapping(value = "/searchSingerByAlbumId", produces = {"application/json;charset=UTF-8"})
    public Object searchSingerByAlbumId(Integer albumId){
        if(ParamJudge.isNOTPositive(albumId)) return "{\"errCode\":4,\"errMsg\":\"参数错误！\"}";
        Singer singer = singerService.searchSingerByAlbumId(albumId);
        if (singer != null) return new JSONObject(singer).put("errCode",0).toString();
        return "{\"errCode\":8,\"errMsg\":\"albumId无效！\"}";
    }

    @ResponseBody
    @RequestMapping(value = "/searchSingerPageInfo", produces = {"application/json;charset=UTF-8"})
    public Object searchSingerPageInfo(String singerName){
        if(StringUtil.isEmpty(singerName)) return "{\"errCode\":4,\"errMsg\":\"参数错误！\"}";
        JSONObject re = singerService.searchSingerInfoByName(singerName);
        if(re == null) return "{\"errCode\":3,\"errMsg\":\"查无此人！\"}";
        return re.toString();
    }

}
