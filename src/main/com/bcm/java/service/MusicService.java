package service;

import bean.Music;

import java.util.List;

public interface MusicService {

    List<Music> searchMusicByAlbumId(int albumId);

    List<Music> searchMusicByMusicName(String musicName);

    List<Music> searchMusicBySingerId(int singerId);

    int favorMusic(int userId, int musicId);

    int unFavorMusic(int userId, int musicId);

}
