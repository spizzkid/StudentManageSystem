package com.example.dao;

import com.example.pojo.Student;

import java.sql.SQLException;
import java.util.List;

public interface StudentDao {
    public int insert(Student student) throws SQLException;
    public int delete(Student student) throws SQLException;
    public int update(Student student) throws SQLException;
    public List<Student> selectAll() throws SQLException;
    public Student selectById(Integer id) throws SQLException;
    public List<Student> selectByAge(Integer age) throws SQLException;
    public Student selectByName(String name) throws SQLException;
}
