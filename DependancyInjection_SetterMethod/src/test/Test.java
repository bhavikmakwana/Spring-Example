package test;

import beans.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {
        System.out.println("Welcome to Java Spring Framework Setter Dependency  Injection");
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("resources/employeeBean.xml");
        Employee employee = (Employee) applicationContext.getBean("emp");
        employee.printData();
    }
}
