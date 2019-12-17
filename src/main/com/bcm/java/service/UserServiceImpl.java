package service;

import bean.User;
import mapper.UserMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserMapper userMapper;

    public UserServiceImpl(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public User login(String userName, String pwd) { return userMapper.login(userName, pwd); }

    @Override
    public int register(String userName, String pwd) { return userMapper.register(userName, pwd); }

    @Override
    public User searchUserByUserName(String userName) {
        return userMapper.searchUserByUserName(userName);
    }

    @Override
    public List<User> getFollowingByUserId(Integer userId) {
        return userMapper.getFollowingByUserId(userId);
    }

    @Override
    public List<User> getFollowerByUserId(Integer userId) {
        return userMapper.getFollowerByUserId(userId);
    }

    @Override
    public int following(Integer userId, Integer followerId) {
        return userMapper.following(userId, followerId);
    }

    @Override
    public int unFollow(Integer userId, Integer followerId) {
        return userMapper.unFollow(userId, followerId);
    }


}
