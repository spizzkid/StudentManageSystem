package com.example.service;


import com.example.pojo.Student;

import java.util.List;

public interface IStudentService {
    public int save (Student student);
    public int remove (Student student);
    public int meger (Student student);
    public List<Student> getAll ();
    public Student queryById (Integer id);
    public List<Student> queryByAge (Integer age);
    public Student queryByName (String name);

}
