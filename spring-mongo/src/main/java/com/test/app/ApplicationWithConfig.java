package com.test.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;

import com.test.mongodb.client.Person;
import com.test.mongodb.config.SpringMongoConfig;

public class ApplicationWithConfig
{

    public static void main(String[] args)
    {
        AbstractApplicationContext ctx = new AnnotationConfigApplicationContext(SpringMongoConfig.class);
        MongoOperations mongoOperation = (MongoOperations)ctx.getBean("mongoTemplate");
        
        Person p = new Person();
        p.setId("1");
        p.setName("Joe");
        p.setAge(30);
        p.setSalary(3000.00);
        
        //Save ID : 1
        mongoOperation.save(p);
        
        //Create Query for fetching the data
        Query searchUserQuery = new Query(Criteria.where("salary").lte(3000.00));
        Person person = mongoOperation.findOne(searchUserQuery, Person.class);
        
        if(person != null)
            System.out.println("Found Person : " + person.getName());
        else
            System.out.println("No person found");
        
        mongoOperation.updateMulti(searchUserQuery, 
                Update.update("salary", "40000"),Person.class);
        
        System.out.println(" Size is "+mongoOperation.findAll(Person.class).size());
        
        Query rQuery = new Query(Criteria.where("id").is("1"));
        
        mongoOperation.remove(rQuery, Person.class);
        
        System.out.println(" Size is "+mongoOperation.findAll(Person.class).size());
        ctx.close();
    }

}
