package com.denysdudka.spring.rest;

import com.denysdudka.spring.rest.configuration.MyConfig;
import com.denysdudka.spring.rest.entity.Employee;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        AnnotationConfigApplicationContext context = 
                new AnnotationConfigApplicationContext(MyConfig.class);
        Communication communication = context.getBean("communication",
                Communication.class);
//       List<Employee> allEmployees = communication.getAllEmployees();
//       System.out.println(allEmployees);
        //        *******************************
//        Employee empByID = communication.getEmployee(2);
//        System.out.println(empByID);
//        *******************************
//        Employee emp = new Employee("Sveta","Sokol","IT",450);
//        emp.setId(9);
//        communication.saveEmployee(emp);
        //        *******************************
        communication.deleteEmployee(9);
    }
}
