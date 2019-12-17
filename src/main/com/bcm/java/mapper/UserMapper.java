package mapper;

import bean.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface UserMapper {

    //login
    User login(@Param("userName") String userName, @Param("userKey") String pwd);

    //register
    int register(@Param("userName") String userName, @Param("userKey") String pwd);

    User searchUserByUserName(@Param("userName") String userName);

    List<User> getFollowingByUserId(@Param("userId") Integer userId);

    List<User> getFollowerByUserId(@Param("userId") Integer userId);

    int following(@Param("userId") Integer userId, @Param("followerId") Integer followerId);

    int unFollow(@Param("userId") Integer userId, @Param("followerId") Integer followerId);
}
