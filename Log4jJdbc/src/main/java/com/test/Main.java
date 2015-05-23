package com.test;

import org.apache.log4j.Logger;

import com.test.dao.Student;
import com.test.dao.StudentDAO;

public class Main
{

    private static final Logger LOG = Logger.getLogger(Main.class);
    
    
    public static void main(String[] args) throws Exception
    {
        LOG.info("Started");
        Student s = new Student();
        s.setId(5);
        s.setName("Veeresham");
        s.setGender("M");
        s.setAge(25);
        StudentDAO dao = new StudentDAO();
        dao.save(s);
        dao.getList();
        LOG.info("Completed"); 
    }

}
