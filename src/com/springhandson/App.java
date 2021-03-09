package com.springhandson;


import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main (String args[])
    {
        /*
        ClassC objC = new ClassC(1,"Abhinav");

        BeanFactory beanFactory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
        ClassC objC = (ClassC) beanFactory.getBean("refClassC");


        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        ClassC objC = (ClassC) applicationContext.getBean("refClassC");
        */


        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(BeanConfig.class);
        ClassC objc = (ClassC) applicationContext.getBean(ClassC.class);
        System.out.println(objc.geta());
        System.out.println(objc.getb());
        System.out.println(objc.getobjB().geta());
        System.out.println(objc.getobjB().getb());
        System.out.println(objc.getobjB().getobjA().geta());
        System.out.println(objc.getobjB().getobjA().getb());
        System.out.println(objc.getobjB().getobjA().getc());







    }
}
