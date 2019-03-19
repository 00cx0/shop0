package com.linlin.shop;

import com.linlin.shop.dao.UserDao;
import com.linlin.shop.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=ShopApplication.class)
public class ShopApplicationTests {
    @Autowired
    private UserDao userDao;
    @Test
    public void contextLoads() {
        User user = new User();
        user.setUsername("lin");
        user.setPassword("123456");
        userDao.insert(user);
    }
    @Test
    public void testSelect(){
        List<User> list = userDao.select();
        if(list!=null&&list.size()>0)
            list.forEach((user)->{
                System.out.println(user.getUsername());
            });
    }

}

