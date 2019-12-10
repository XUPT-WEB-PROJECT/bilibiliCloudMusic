package mapper;

import bean.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;


public interface UserMapper {

    //login
    User login(@Param("userName") String userName, @Param("userKey") String pwd);

    //register
    boolean register(String username, String password);

    //根据用户名找用户
    User findUserByUserName(String username);
}
