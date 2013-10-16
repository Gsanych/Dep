package com.aimprosoft.service.impl;


import com.aimprosoft.database.dao.impl.DepartmentDaoImpl;
import com.aimprosoft.database.model.Department;
import com.aimprosoft.service.ActionStrategy;
/**
 * Date: 10/16/13
 * Time: 12:07 PM
 */
public class CreateDep implements ActionStrategy<Department> {
      private DepartmentDaoImpl departmentDao=new DepartmentDaoImpl();

        //  actions.put("create", (ActionStrategy) departmentDao.create((Department) strategy));


    @Override
    public Department executeAction(String text, Department entity) {
        departmentDao.create(entity);
        return entity;
    }


}
