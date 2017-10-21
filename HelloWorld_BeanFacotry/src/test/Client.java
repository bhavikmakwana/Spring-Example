package test;

import beans.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Client {
    public static void main(String [] args){
        System.out.println("Welcome to Java Spring with BeanFactory !!!");
        //find the xml file for loading in ioc container
        Resource resource = new ClassPathResource("resources/spring.xml");
        //load xml file into container
        BeanFactory factory = new XmlBeanFactory(resource);
        //create Test class object
        Test test = (Test) factory.getBean("test");//from ref name of POJO class which we gives in xml file
        System.out.println("--------------------------------");
        Test test1 = (Test) factory.getBean("test");//from ref name of POJO class which we gives in xml file
        System.out.println("--------------------------------");
        Test test2 = (Test) factory.getBean("test");//from ref name of POJO class which we gives in xml file

        System.out.println("=======================================");
        test.sayHello();//Default it is singleton
    }
}
