package com.linlin.shop.dao;

import com.linlin.shop.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import java.util.List;

@Mapper
@Repository
public interface UserDao {
     int insert(User user);
     List<User> select();
     User login(User user);
     int register(User user);//这里有的方法在mapper.xml里面要有一个id跟这个方法名一样的
     User findByUser(String username);//这个返回值跟mapping里面那个resultType匹配
}
