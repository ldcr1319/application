package com.zhc.test.service;

import com.zhc.test.dao.UserDao;
import com.zhc.test.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by zhc on 2018/4/18.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;


    @Override
    public User getUser(int id) {
        return userDao.findUserById(id);
    }
}
