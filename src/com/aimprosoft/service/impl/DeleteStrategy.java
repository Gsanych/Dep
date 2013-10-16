package com.aimprosoft.service.impl;

import com.aimprosoft.database.dao.impl.DepartmentDaoImpl;
import com.aimprosoft.database.model.Department;
import com.aimprosoft.service.ActionStrategy;

/**
 * Date: 10/16/13
 * Time: 12:08 PM
 */
public class DeleteStrategy implements ActionStrategy<Department> {
       private DepartmentDaoImpl departmentDao=new DepartmentDaoImpl();

    @Override
    public Department executeAction(String text, Department entity) {
        return null;
    }


    //actions.put("delete", departmentDao.delete((Department) strategy));


}
