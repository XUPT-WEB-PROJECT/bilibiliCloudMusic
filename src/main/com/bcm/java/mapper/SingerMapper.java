package mapper;

import bean.Singer;

import java.util.List;

public interface SingerMapper {

    Singer searchSingerBySingerId(Integer singerId);

    List<Singer> searchSingerBySingerName(String singerName);

    Singer searchSingerByAlbumId(Integer albumId);

}
