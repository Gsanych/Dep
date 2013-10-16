package com.aimprosoft.database.dao;

import java.util.List;

/**
 * Date: 10/16/13
 * Time: 2:09 PM
 */
public interface Dao <T>{

    List<T> getList();

    T create(T entity);

    void update(T entity);

    void delete(T id);

}
