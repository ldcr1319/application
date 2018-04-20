package com.zhc.user.service;

import com.github.pagehelper.PageInfo;
import com.zhc.user.entity.User;
import com.zhc.util.IService;

/**
 * 2018-04-20 下午 3:22.
 *
 * @author zhc
 */
public interface UserService extends IService<User>{
    PageInfo<User> selectByPage(User user, int start, int length);

    User selectByUsername(String username);

    void delUser(Integer userid);

}
