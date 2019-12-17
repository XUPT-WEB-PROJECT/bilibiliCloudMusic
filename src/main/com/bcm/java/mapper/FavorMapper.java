package mapper;

import bean.*;

import java.util.List;

public interface FavorMapper {

    List<Album> getFavorAlbum(Integer userId);

    List<Music> getFavorMusic(Integer userId);

    List<Singer> getFavorSinger(Integer userId);

    List<User> getUserFollowing(Integer userId);

    List<User> getUserFollower(Integer userId);

    List<Blog> getBlog(Integer userId);

}
