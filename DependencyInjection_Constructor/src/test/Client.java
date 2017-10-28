package test;

import beans.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
    public static void main(String [] args){
        System.out.println("Welcome to Java Spring Framework with Primitive value with Constructor Injection");
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("resources/employeeBean.xml");
        Employee employee = (Employee) applicationContext.getBean("emp");
        employee.printData();
    }
}
