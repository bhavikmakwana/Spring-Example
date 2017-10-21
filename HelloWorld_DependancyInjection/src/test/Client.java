package test;

import beans.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
    public static void main(String [] args){
        System.out.println("Welcome Java from spring Dependency Injection !!");
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("resources/spring.xml");
        Test test = (Test) applicationContext.getBean("test");
        test.hello("Bhavik");
    }
}
