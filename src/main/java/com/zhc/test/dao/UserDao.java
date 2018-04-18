package com.zhc.test.dao;

import com.zhc.test.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created by zhc on 2018/4/18.
 */
@Mapper
public interface UserDao {

    User findUserById(int id);

}
