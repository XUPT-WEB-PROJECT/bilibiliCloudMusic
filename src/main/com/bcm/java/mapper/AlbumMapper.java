package mapper;

import bean.Album;

import java.util.List;

public interface AlbumMapper {

    List<Album> searchAlbumByAlbumName(String albumName);

    List<Album> searchAlbumBySingerId(int singerId);

    Album searchAlbumByMusicId(int musicId);

    int favorAlbum(int userId, int albumId);

    int unFavorAlbum(int userId, int albumId);
}
