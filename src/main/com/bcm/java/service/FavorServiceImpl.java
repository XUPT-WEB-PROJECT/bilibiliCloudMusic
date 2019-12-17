package service;

import bean.*;
import mapper.FavorMapper;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

@Service
public class FavorServiceImpl implements FavorService {

    private FavorMapper favorMapper;

    public FavorServiceImpl(FavorMapper favorMapper){
        this.favorMapper = favorMapper;
    }

    @Override
    public List<Album> getFavorAlbum(Integer userId) {
        return favorMapper.getFavorAlbum(userId);
    }

    @Override
    public List<Music> getFavorMusic(Integer userId) {
        return favorMapper.getFavorMusic(userId);
    }

    @Override
    public List<Singer> getFavorSinger(Integer userId) {
        return favorMapper.getFavorSinger(userId);
    }

    @Override
    public List<List<User>> getUserRelation(Integer userId) {
        List<User> following = favorMapper.getUserFollowing(userId);
        List<User> follower = favorMapper.getUserFollowing(userId);
        List<List<User>> re = new LinkedList<>();
        re.add(following);
        re.add(follower);
        return re;
    }

    @Override
    public List<Blog> getBlog(Integer userId) {
        return favorMapper.getBlog(userId);
    }
}
