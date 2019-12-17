package controller;

import bean.Album;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.github.pagehelper.util.StringUtil;
import org.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import service.AlbumService;
import util.ParamJudge;

import java.util.List;

@Controller
public class AlbumController {

    private AlbumService albumService;

    public AlbumController(AlbumService albumService) {
        this.albumService = albumService;
    }

    @ResponseBody
    @RequestMapping(value = "/searchAlbumByAlbumName",produces = {"application/json;charset=UTF-8"})
    public Object searchAlbumByAlbumName(String albumName, Integer pn, Integer pSize){
        if(StringUtil.isEmpty(albumName)) return "{\"errCode\":4,\"errMsg\":\"参数错误！\"}";
        if(pn == null || pn < 0) pn = 1;
        if(pSize == null || pSize < 0) pSize = 10;
        PageHelper.startPage(pn, pSize);
        List<Album> albums = albumService.searchAlbumByAlbumName(albumName);
        return new PageInfo<>(albums);
    }

    @ResponseBody
    @RequestMapping(value = "/searchAlbumBySingerId",produces = {"application/json;charset=UTF-8"})
    public Object searchAlbumBySingerId(Integer singerId, Integer pn, Integer pSize){
        if(ParamJudge.isPositive(singerId)) return "{\"errCode\":4,\"errMsg\":\"参数错误！\"}";
        if(pn == null || pn < 0) pn = 1;
        if(pSize == null || pSize < 0) pSize = 10;
        PageHelper.startPage(pn, pSize);
        List<Album> albums = albumService.searchAlbumBySingerId(singerId);
        return new PageInfo<>(albums);
    }

    @ResponseBody
    @RequestMapping(value = "/searchAlbumByMusicId",produces = {"application/json;charset=UTF-8"})
    public Object searchAlbumByMusicId(Integer musicId){
        if(ParamJudge.isPositive(musicId)) return "{\"errCode\":4,\"errMsg\":\"参数错误！\"}";
        Album album = albumService.searchAlbumByMusicId(musicId);
        if(album == null) return "{\"errCode\":7,\"errMsg\":\"albumId不存在！\"}";
        return new JSONObject(album).put("errCode",0).toString();
    }

    @ResponseBody
    @RequestMapping(value = "/favorAlbum",produces = {"application/json;charset=UTF-8"})
    public Object favorAlbum(Integer userId, Integer albumId){
        if(ParamJudge.isPositive(userId, albumId)) return "{\"errCode\":4,\"errMsg\":\"参数错误！\"}";
        int re =  albumService.favorAlbum(userId, albumId);
        if(re == 1) return "{\"errCode\":0,\"errMsg\":\"收藏成功！\"}";
        return "{\"errCode\":5,\"errMsg\":\"已经收藏或者参数albumId无效！\"}";
    }

    @ResponseBody
    @RequestMapping(value = "/unFavorAlbum",produces = {"application/json;charset=UTF-8"})
    public Object unFavorAlbum(Integer userId, Integer albumId){
        if(ParamJudge.isPositive(userId, albumId)) return "{\"errCode\":4,\"errMsg\":\"参数错误！\"}";
        int re =  albumService.unFavorAlbum(userId, albumId);
        if(re == 1) return "{\"errCode\":0,\"errMsg\":\"取消收藏成功！\"}";
        return "{\"errCode\":5,\"errMsg\":\"收藏关系不存在！\"}";
    }

}
