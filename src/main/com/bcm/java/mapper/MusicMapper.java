package mapper;

import bean.Music;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MusicMapper {

    List<Music> searchMusicByAlbumId(int albumId);

    List<Music> searchMusicByMusicName(String musicName);

    List<Music> searchMusicBySingerId(int musicId);

    int favorMusic(int userId, int musicId);

    int unFavorMusic(int userId, int musicId);

    List<Music> searchPageMusicBySingerId(Integer singerId);

    List<Music> getMusicInfo(String musicName);

}
