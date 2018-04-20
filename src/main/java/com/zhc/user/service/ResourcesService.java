package com.zhc.user.service;

import com.github.pagehelper.PageInfo;
import com.zhc.user.entity.Resources;
import com.zhc.util.IService;

import java.util.List;
import java.util.Map;

/**
 * 2018-04-20 下午 3:22.
 *
 * @author zhc
 */
public interface ResourcesService extends IService<Resources> {
    PageInfo<Resources> selectByPage(Resources resources, int start, int length);

    public List<Resources> queryAll();

    public List<Resources> loadUserResources(Map<String, Object> map);

    public List<Resources> queryResourcesListWithSelected(Integer rid);
}
