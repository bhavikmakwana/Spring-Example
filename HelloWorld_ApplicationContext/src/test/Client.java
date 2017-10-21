package test;


import beans.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
    public static void main(String [] args){
        System.out.println("Welcome to Java Spring framework on Application Context J2EE Container !!!!!");
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("resources/spring.xml");
        Test test = (Test) applicationContext.getBean("test");
        System.out.println("-------------------------------------------");
        Test test1 = (Test) applicationContext.getBean("test");
        System.out.println("-------------------------------------------");
        Test test2 = (Test) applicationContext.getBean("test");
        System.out.println("-------------------------------------------");
        test.sayHello();//Singleton//ByDefault its singleton

    }
}
