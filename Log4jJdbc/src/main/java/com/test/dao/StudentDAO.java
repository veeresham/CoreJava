package com.test.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class StudentDAO
{
    public void save(Student student) throws Exception
    {
        Connection con = MyConnection.getConnection();
        PreparedStatement st = con
                .prepareStatement("INSERT INTO Student VALUES(?,?,?,?)");
        st.setInt(1, student.getId());
        st.setString(2, student.getName());
        st.setInt(3, student.getAge());
        st.setString(4, student.getGender());

        st.executeUpdate();
        con.close();
    }

    public List<Student> getList() throws Exception
    {
        List<Student> list = new ArrayList<Student>();
        Connection con = MyConnection.getConnection();
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("select * from Student");
        while (rs.next())
        {
            Student student = new Student();
            student.setId(rs.getInt("id"));
            student.setName(rs.getString("name"));
            student.setAge(rs.getInt("age"));
            student.setGender(rs.getString("gender"));
            list.add(student);
        }

        return list;
    }
}
