package com.example.service;

import java.sql.SQLException;
import java.util.List;
import com.example.dao.StudentDao;
import com.example.dao.StudentDaoImpl;
import com.example.pojo.Student;



    public class StudentService implements IStudentService{
        StudentDao dao = new StudentDaoImpl();

        @Override
        public int save(Student student) {
            try{
                return dao.insert(student);
            }catch (SQLException e) {
                e.printStackTrace();
            }
            return 0;
        }

        @Override
        public int remove(Student student) {
            try{
                return dao.delete(student);
            }catch (SQLException e) {
                e.printStackTrace();
            }
            return 0;
        }

        @Override
        public int meger(Student student) {
            try{
                return dao.update(student);
            }catch (SQLException e) {
                e.printStackTrace();
            }
            return 0;
        }

        @Override
        public List<Student> getAll() {
            try{
                return dao.selectAll();
            }catch (SQLException e) {
                e.printStackTrace();
            }
            return null;
        }

        @Override
        public Student queryById(Integer id) {
            try {
                return dao.selectById(id);
            } catch (SQLException e) {
                e.printStackTrace();
            }
            return null;
        }

        @Override
        public List<Student> queryByAge(Integer age) {
            try {
                return dao.selectByAge(age);
            } catch (SQLException e) {
                e.printStackTrace();
            }
            return null;
        }

        @Override
        public Student queryByName(String name) {
            try {
                return dao.selectByName(name);
            } catch (SQLException e) {
                e.printStackTrace();
            }
            return null;
        }
    }
