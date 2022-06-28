package com.example.web;

import com.example.pojo.Student;
import com.example.service.IStudentService;
import com.example.service.StudentService;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class StuDeleteServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String did = request.getParameter("did");

        IStudentService studentService = new StudentService();
        studentService.remove(new Student(Integer.parseInt(did)));

        response.sendRedirect("/StudentManager_war_exploded/StuListServlet");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
