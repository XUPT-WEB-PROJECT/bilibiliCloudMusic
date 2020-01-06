package mapper;

import bean.Singer;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SingerMapper {

    Singer searchSingerBySingerId(Integer singerId);

    List<Singer> searchSingerBySingerName(String singerName);

    Singer searchSingerByAlbumId(Integer albumId);

    int cntMusicBySingerId(Integer singerId);

    int cntAlbumBySingerId(Integer singerId);

}
