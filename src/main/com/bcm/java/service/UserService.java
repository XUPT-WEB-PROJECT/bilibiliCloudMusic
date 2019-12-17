package service;

import bean.User;

import java.util.List;

public interface UserService {

    User login(String username, String password);

    int register(String userName, String pwd);

    User searchUserByUserName(String userName);

    List<User> getFollowingByUserId(Integer userId);

    List<User> getFollowerByUserId(Integer userId);

    int following(Integer userId, Integer followerId);

    int unFollow(Integer userId, Integer followerId);

}
