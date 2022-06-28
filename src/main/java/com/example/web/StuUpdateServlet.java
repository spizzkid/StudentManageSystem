package com.example.web;

import com.example.pojo.Student;
import com.example.service.IStudentService;
import com.example.service.StudentService;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class StuUpdateServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String uid = request.getParameter("uid");

        IStudentService studentService = new StudentService();
        Student stu = studentService.queryById(Integer.parseInt(uid));

        request.setAttribute("stuList",stu);
        request.getRequestDispatcher("/update.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
