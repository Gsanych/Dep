package com.aimprosoft.service;

import com.aimprosoft.database.dao.impl.DepartmentDaoImpl;

import java.util.List;

/**
 * Date: 10/16/13
 * Time: 6:05 PM
 */
public class Reader {
    DepartmentDaoImpl departmentDao=new DepartmentDaoImpl();
    public List read() {
        return departmentDao.getList();
    }
}
