package service;

import bean.Singer;
import org.json.JSONObject;

import java.util.List;

public interface SingerService {

    Singer searchSingerBySingerId(Integer singerId);

    List<Singer> searchSingerBySingerName(String singerName);

    Singer searchSingerByAlbumId(Integer albumId);

    JSONObject searchSingerInfoByName(String singerName);

}
