package com.example.utils;

import com.example.pojo.Student;
import com.example.service.IStudentService;
import com.example.service.StudentService;

import javax.print.DocFlavor;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JdbcUtils {
    public static void main(String[] args) {

    }
    private static final String url="jdbc:mysql://localhost:3306/yx2204?useUnicode=true&characterEncoding=utf8";
    private static final String name="root";
    private static final String password="0415";

    static {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url,name,password);
    }

    public static void close(Connection connection, Statement statement, ResultSet resultSet) throws SQLException {

        try {
            if (resultSet!=null) {
                resultSet.close();
            }
        }catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                if(statement!=null){
                    statement.close();
                }
            }catch (SQLException e) {
                e.printStackTrace();
            }finally {
                if(connection!=null) {
                    connection.close();
                }
            }
        }

    }
}
