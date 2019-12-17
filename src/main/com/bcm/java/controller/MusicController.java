package controller;

import bean.Music;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.json.JSONObject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import service.MusicService;
import util.ParamJudge;

import java.util.List;

public class MusicController {

    private MusicService musicService;

    public MusicController(MusicService musicService) {
        this.musicService = musicService;
    }

    @ResponseBody
    @RequestMapping(value = "/searchMusicByAlbumId",produces = {"application/json;charset=UTF-8"})
    public Object searchMusicByAlbumId(Integer albumId){
        if(albumId == null || albumId < 0) return "{\"errCode\":4,\"errMsg\":\"参数错误！\"}";
        List<Music> musicList = musicService.searchMusicByAlbumId(albumId);
        if(musicList.size()==0) return "{\"errCode\":8,\"errMsg\":\"albumId无效！\"}";
        return new JSONObject(musicList).put("errCode", 0).toString();
    }

    @ResponseBody
    @RequestMapping(value = "/searchMusicByMusicName",produces = {"application/json;charset=UTF-8"})
    public Object searchMusicByMusicName(String musicName, Integer pn, Integer pSize){
        if(musicName == null) return "{\"errCode\":4,\"errMsg\":\"参数错误！\"}";
        if(pn == null || pn < 0) pn = 1;
        if(pSize == null || pSize < 0) pSize = 10;
        PageHelper.startPage(pn, pSize);
        List<Music> albums = musicService.searchMusicByMusicName(musicName);
        return new PageInfo<>(albums);
    }

    @ResponseBody
    @RequestMapping(value = "/searchMusicBySingerId",produces = {"application/json;charset=UTF-8"})
    public Object searchMusicBySingerId(Integer musicId, Integer pn, Integer pSize){
        if(ParamJudge.isPositive(musicId)) return "{\"errCode\":4,\"errMsg\":\"参数错误！\"}";
        if(pn == null || pn < 0) pn = 1;
        if(pSize == null || pSize < 0) pSize = 10;
        PageHelper.startPage(pn, pSize);
        List<Music> albums = musicService.searchMusicBySingerId(musicId);
        return new PageInfo<>(albums);
    }

    @ResponseBody
    @RequestMapping(value = "/favorMusic",produces = {"application/json;charset=UTF-8"})
    public Object favorMusic(Integer userId, Integer musicId){
        if(ParamJudge.isPositive(userId, musicId)) return "{\"errCode\":4,\"errMsg\":\"参数错误！\"}";
        int re =  musicService.favorMusic(userId, musicId);
        if(re == 1) return "{\"errCode\":0,\"errMsg\":\"添加喜欢成功！\"}";
        return "{\"errCode\":9,\"errMsg\":\"已经添加或者参数musicId无效！\"}";
    }

    @ResponseBody
    @RequestMapping(value = "/unFavorMusic",produces = {"application/json;charset=UTF-8"})
    public Object unFavorMusic(Integer userId, Integer musicId){
        if(ParamJudge.isPositive(userId, musicId)) return "{\"errCode\":4,\"errMsg\":\"参数错误！\"}";
        int re =  musicService.favorMusic(userId, musicId);
        if(re == 1) return "{\"errCode\":0,\"errMsg\":\"取消喜欢成功！\"}";
        return "{\"errCode\":10,\"errMsg\":\"已取消喜欢或musicId无效！\"}";
    }

}
