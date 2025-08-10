package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        ApplicationContext applicationContext= new ClassPathXmlApplicationContext("spring.xml");
        Alien obj1 =(Alien) applicationContext.getBean("alien1");
//        obj1.age = 21;
        System.out.println(obj1.getAge());
        obj1.code();

/*
        Alien obj2 =(Alien) applicationContext.getBean("alien1");
        System.out.println(obj1.age);
        obj2.code();
*/
    }
}
