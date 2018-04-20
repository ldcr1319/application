package com.zhc.user.service;

import com.zhc.user.entity.UserRole;
import com.zhc.util.IService;

/**
 * 2018-04-20 下午 3:22.
 *
 * @author zhc
 */
public interface UserRoleService extends IService<UserRole> {

    public void addUserRole(UserRole userRole);
}
