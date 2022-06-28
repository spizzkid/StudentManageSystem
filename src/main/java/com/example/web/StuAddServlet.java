package com.example.web;

import com.example.pojo.Student;
import com.example.service.IStudentService;
import com.example.service.StudentService;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class StuAddServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String name = request.getParameter("s_name");
        String age = request.getParameter("s_age");
        String address = request.getParameter("city");
        String phone = request.getParameter("s_phone");

        IStudentService studentService = new StudentService();
        studentService.save(new Student(name,Integer.parseInt(age),address,phone));

        response.sendRedirect("/StudentManager_war_exploded/StuListServlet");

    }
}
