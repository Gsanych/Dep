package com.aimprosoft.controller;

import com.aimprosoft.service.Reader;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Date: 10/16/13
 * Time: 5:49 PM
 */
public class View extends HttpServlet {
   private Reader reader=new Reader();
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        RequestDispatcher rd;
        try{
            request.setAttribute("ViewDep", reader.read());
            rd=request.getRequestDispatcher("/WEB-INF/jsp/View.jsp");
            rd.forward(request, response);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
