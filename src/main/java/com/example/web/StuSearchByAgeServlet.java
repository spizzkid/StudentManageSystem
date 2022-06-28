package com.example.web;

import com.example.pojo.Student;
import com.example.service.IStudentService;
import com.example.service.StudentService;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.List;

public class StuSearchByAgeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String age = request.getParameter("s_age");

        IStudentService studentService = new StudentService();
        List<Student> stuList = studentService.queryByAge(Integer.parseInt(age));

        request.setAttribute("stuList",stuList);

        request.getRequestDispatcher("/selectedByAge.jsp").forward(request,response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
