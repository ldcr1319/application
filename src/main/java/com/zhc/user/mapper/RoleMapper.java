package com.zhc.user.mapper;


import com.zhc.user.entity.Role;
import com.zhc.util.MyMapper;

import java.util.List;

public interface RoleMapper extends MyMapper<Role> {
    public List<Role> queryRoleListWithSelected(Integer id);
}