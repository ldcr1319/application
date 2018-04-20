package com.zhc.util;

import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 2018-04-20 下午 3:44.
 *通用接口
 * @author zhc
 */
@Service
public interface IService<T> {
    T selectByKey(Object key);

    int save(T entity);

    int delete(Object key);

    int updateAll(T entity);

    int updateNotNull(T entity);

    List<T> selectByExample(Object example);
}
