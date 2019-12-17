package service;

import bean.*;

import java.util.List;

public interface FavorService {

    List<Album> getFavorAlbum(Integer userId);

    List<Music> getFavorMusic(Integer userId);

    List<Singer> getFavorSinger(Integer userId);

    List<List<User>> getUserRelation(Integer userId);

    List<Blog> getBlog(Integer userId);

}
