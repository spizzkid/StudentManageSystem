package com.example.dao;

import com.example.pojo.Student;
import com.example.utils.JdbcUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentDaoImpl implements StudentDao{
    @Override
    public int insert(Student student) throws SQLException {
        String sql = "insert into student values(null,?,?,?,?)";
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        int num = 0;
        try {
            connection = JdbcUtils.getConnection();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setObject(1, student.getName());
            preparedStatement.setObject(2, student.getAge());
            preparedStatement.setObject(3, student.getAddress());
            preparedStatement.setObject(4, student.getPhone());

            num = preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JdbcUtils.close(connection,preparedStatement,null);
        }
        return num;
    }

    @Override
    public int delete(Student student) throws SQLException {
        String sql = "delete from student where id=?";
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        int num = 0;
        try {
            connection = JdbcUtils.getConnection();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setObject(1, student.getId());


            num = preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JdbcUtils.close(connection,preparedStatement,null);
        }
        return num;
    }

    @Override
    public int update(Student student) throws SQLException {
        String sql = "update student set s_name=?,s_age=?,s_address=?,s_phone=? where id=?";
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        int num = 0;
        try {
            connection = JdbcUtils.getConnection();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setObject(1, student.getName());
            preparedStatement.setObject(2, student.getAge());
            preparedStatement.setObject(3, student.getAddress());
            preparedStatement.setObject(4, student.getPhone());
            preparedStatement.setObject(5, student.getId());

            num = preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JdbcUtils.close(connection,preparedStatement,null);
        }
        return num;
    }

    @Override
    public List<Student> selectAll() throws SQLException {
        List<Student> stuList = new ArrayList<>();

        String sql = "select * from student";
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            connection = JdbcUtils.getConnection();
            preparedStatement = connection.prepareStatement(sql);

            ResultSet resultSet = preparedStatement.executeQuery();
            while(resultSet.next()) {
                stuList.add(new Student(resultSet.getInt("id"),
                        resultSet.getString("s_name"),
                        resultSet.getInt("s_age"),
                        resultSet.getString("s_address"),
                        resultSet.getString("s_phone")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JdbcUtils.close(connection,preparedStatement,null);
        }
        return stuList;
    }

    @Override
    public Student selectById(Integer id) throws SQLException {

        String sql = "select * from student where id=?";
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        int num = 0;
        try {
            connection = JdbcUtils.getConnection();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setObject(1,id);

            ResultSet resultSet = preparedStatement.executeQuery();
            if(resultSet.next()) {
                return (new Student(resultSet.getInt("id"),
                        resultSet.getString("s_name"),
                        resultSet.getInt("s_age"),
                        resultSet.getString("s_address"),
                        resultSet.getString("s_phone")));
            }
            num = preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JdbcUtils.close(connection,preparedStatement,null);
        }
        return null;
    }
    public List<Student> selectByAge(Integer age) throws SQLException {
        List<Student> stuList = new ArrayList<>();

        String sql = "select * from student where s_age=?";
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            connection = JdbcUtils.getConnection();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setObject(1, age);

            ResultSet resultSet = preparedStatement.executeQuery();
            while(resultSet.next()) {
                stuList.add(new Student(resultSet.getInt("id"),
                        resultSet.getString("s_name"),
                        resultSet.getInt("s_age"),
                        resultSet.getString("s_address"),
                        resultSet.getString("s_phone")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JdbcUtils.close(connection,preparedStatement,null);
        }
        return stuList;
    }

    public Student selectByName(String name) throws SQLException {

        String sql = "select * from student where s_name=?";
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        int num = 0;
        try {
            connection = JdbcUtils.getConnection();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setObject(1,name);

            ResultSet resultSet = preparedStatement.executeQuery();
            if(resultSet.next()) {
                return (new Student(resultSet.getInt("id"),
                        resultSet.getString("s_name"),
                        resultSet.getInt("s_age"),
                        resultSet.getString("s_address"),
                        resultSet.getString("s_phone")));
            }
            num = preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JdbcUtils.close(connection,preparedStatement,null);
        }
        return null;
    }
}
