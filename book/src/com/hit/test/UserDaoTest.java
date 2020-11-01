package com.hit.test;

import com.hit.dao.UserDao;
import com.hit.dao.impl.UserDaoImpl;
import com.hit.pojo.User;
import org.junit.Test;

public class UserDaoTest {


    }

    @Test
    public void queryUserByUsername3() {
        UserDao userDao = new UserDaoImpl();
        if(userDao.queryUserByUsername("adn")==null) {
            System.out.println("用户名不存在，可用");
        }else{
            System.out.println("用户名已存在");
        }

    }
    @Test
    public void queryUserByUsernameAndPassword() {
        UserDao userDao = new UserDaoImpl();
        System.out.println(userDao.queryUserByUsernameAndPassword("admin","admin"));
    }
    @Test
    public void queryUserByUsernameAndPassword2() {
        UserDao userDao = new UserDaoImpl();
        if(userDao.queryUserByUsernameAndPassword("admin","admin")==null) {
            System.out.println("用户名或密码错误 登陆失败");
        }else{
            System.out.println("用户名密码正确 登陆成功");
        }
    }



    @Test
    public void saveUser() {
        UserDao userDao = new UserDaoImpl();
        System.out.println(userDao.saveUser(new User(0,"new people","123456","wzaafwafwa@156.com")));
    }
}