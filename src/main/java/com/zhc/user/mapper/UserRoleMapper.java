package com.zhc.user.mapper;


import com.zhc.user.entity.UserRole;
import com.zhc.util.MyMapper;

import java.util.List;

public interface UserRoleMapper extends MyMapper<UserRole> {
    public List<Integer> findUserIdByRoleId(Integer roleId);
}