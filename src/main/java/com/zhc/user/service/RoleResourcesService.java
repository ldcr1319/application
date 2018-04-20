package com.zhc.user.service;

import com.zhc.user.entity.RoleResources;
import com.zhc.util.IService;

/**
 * 2018-04-20 下午 3:22.
 *
 * @author zhc
 */
public interface RoleResourcesService extends IService<RoleResources>  {
    public void addRoleResources(RoleResources roleResources);
}
