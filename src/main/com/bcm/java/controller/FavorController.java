package controller;

import bean.Album;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import service.FavorService;

import java.util.List;

@Controller
public class FavorController {

    private FavorService favorService;

    public FavorController(FavorService favorService) {
        this.favorService = favorService;
    }

    @ResponseBody
    @RequestMapping(value = "/getFavorAlbumAndMusic", produces = {"application/json;charset=UTF-8"})
    public Object getFavorAlbumAndMusic(Integer userId){
        
        return null;
    }

    @ResponseBody
    @RequestMapping(value = "/getUserRelation", produces = {"application/json;charset=UTF-8"})
    public Object getUserRelation(Integer userId){

        return null;
    }

    @ResponseBody
    @RequestMapping(value = "/getBlog", produces = {"application/json;charset=UTF-8"})
    public Object getBlog(Integer userId){
        return null;
    }

}
