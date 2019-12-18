package service;

import bean.Singer;

import java.util.List;

public interface SingerService {

    Singer searchSingerBySingerId(Integer singerId);

    List<Singer> searchSingerBySingerName(String singerName);

    Singer searchSingerByAlbumId(Integer albumId);

}
