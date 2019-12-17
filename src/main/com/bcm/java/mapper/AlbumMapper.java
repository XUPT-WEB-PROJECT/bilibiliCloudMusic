package mapper;

import bean.Album;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AlbumMapper {

    List<Album> searchAlbumByAlbumName(@Param("albumName") String albumName);

    List<Album> searchAlbumBySingerId(@Param("singerId") int singerId);

    Album searchAlbumByMusicId(@Param("musicId")int musicId);

    int favorAlbum(@Param("userId")int userId, @Param("albumId")int albumId);

    int unFavorAlbum(@Param("userId")int userId, @Param("albumId")int albumId);
}
