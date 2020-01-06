package service;

import bean.Album;
import org.json.JSONObject;

import java.util.List;

public interface AlbumService {

    List<Album> searchAlbumByAlbumName(String albumName);

    List<Album> searchAlbumBySingerId(int singerId);

    Album searchAlbumByMusicId(int musicId);

    int favorAlbum(int userId, int albumId);

    int unFavorAlbum(int userId, int albumId);

    JSONObject getAlbumPageInfo(String albumName);
}
