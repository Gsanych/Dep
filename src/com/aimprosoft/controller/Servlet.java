package com.aimprosoft.controller;

import com.aimprosoft.database.model.Department;
import com.aimprosoft.database.model.Employee;
import com.aimprosoft.service.ContextDep;
import com.aimprosoft.service.ContextEmp;
import com.aimprosoft.service.impl.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Date: 10/16/13
 * Time: 11:40 AM
 */
public class Servlet extends javax.servlet.http.HttpServlet {
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");

        Department entity=new Department();
        ContextDep contextDep=new ContextDep();

        entity.setNameDep(request.getParameter("department"));
        entity.setId(Integer.parseInt(request.getParameter("id")));
    contextDep.setActionStrategy(new CreateDep());
    Department createD=contextDep.executeActionStrategy(request.getParameter("параметр хиден поля"), entity);

    contextDep.setActionStrategy(new DeleteDep());
    Department deleteD=contextDep.executeActionStrategy("dsf", entity);

    contextDep.setActionStrategy(new UpdateDep());
    Department updateD=contextDep.executeActionStrategy("dswqe", entity);

        Employee entityEmp=new Employee();
        ContextEmp contextEmp = new ContextEmp();

        entityEmp.setName(request.getParameter("name"));
        entityEmp.setSurname(request.getParameter("surname"));
        entityEmp.setEmail(request.getParameter("email"));
        entityEmp.setAge(Integer.parseInt(request.getParameter("age")));
    contextEmp.setActionStrategy(new CreateEmp());
    Employee createE=contextEmp.executeActionStrategy("dsd", entityEmp);

    contextEmp.setActionStrategy(new DeleteEmp());
    Employee deleteE=contextEmp.executeActionStrategy("dsf", entityEmp);

    contextEmp.setActionStrategy(new UpdateEmp());
    Employee updateE=contextEmp.executeActionStrategy("dswqe", entityEmp);
}
}
