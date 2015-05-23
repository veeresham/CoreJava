package com.test.app;

import java.util.List;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;

import com.test.mongodb.client.Person;

public class ApplicationWithXML
{

    public static void main(String[] args)
    {
        AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");
        MongoOperations mongoOperation = (MongoOperations) ctx.getBean("mongoTemplate");
        Person p = new Person();
        p.setId("10");
        p.setName("Joe");
        p.setAge(30);
        p.setSalary(3000.00);
        
        //Save ID : 1
        mongoOperation.save(p);
        
        //Create Query for fetching the data
        Query searchUserQuery = new Query(Criteria.where("salary").lte(3000.00));
        Person person = mongoOperation.findOne(searchUserQuery, Person.class);
        
        if(person != null)
            System.out.println("After inserting : Found Person : " + person);
        else
            System.out.println("No person found");
        
        mongoOperation.updateMulti(searchUserQuery, 
                Update.update("salary", "40000"),Person.class);
        
        List<Person> list = mongoOperation.findAll(Person.class);
        
        System.out.println("After updating Size is "+(list == null ? 0: list.size()));
        
        if(list != null)
        {
            for(Person pr : list)
            {
                System.out.println(pr);
            }
        }
        
        Query rQuery = new Query(Criteria.where("id").is("10"));
        
        mongoOperation.remove(rQuery, Person.class);
        
        list = mongoOperation.findAll(Person.class);
        
        System.out.println("After deleteing one Person. Size is "+(list == null ? 0: list.size()));
        
        
        if(list != null)
        {
            for(Person pr : list)
            {
                System.out.println(pr);
            }
        }
        ctx.close();

    }

}
