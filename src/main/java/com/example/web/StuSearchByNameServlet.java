package com.example.web;

import com.example.pojo.Student;
import com.example.service.IStudentService;
import com.example.service.StudentService;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class StuSearchByNameServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("s_name");

        IStudentService studentService = new StudentService();
        Student student = studentService.queryByName(name);

        request.setAttribute("stuList",student);

        request.getRequestDispatcher("/selectedByName.jsp").forward(request,response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
