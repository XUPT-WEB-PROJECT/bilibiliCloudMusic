package mapper;

import bean.Music;

import java.util.List;

public interface MusicMapper {

    List<Music> searchMusicByAlbumId(int albumId);

    List<Music> searchMusicByMusicName(String musicName);

    List<Music> searchMusicBySingerId(int musicId);

    int favorMusic(int userId, int musicId);

    int unFavorMusic(int userId, int musicId);

}
