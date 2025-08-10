package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(org.example.config.AppConfig.class);

        // Lecture1
        // Desktop desktop = applicationContext.getBean(Desktop.class);

        //Lecture2
        //Desktop desktop = applicationContext.getBean("Beast",Desktop.class);

        //Lecture3
        //Desktop desktop = applicationContext.getBean(Desktop.class);
        //desktop.compile();
        //Desktop desktop1 = applicationContext.getBean(Desktop.class);
        //desktop1.compile();

        //Lecture 4 Autowire
        Alien obj1 = applicationContext.getBean(Alien.class);
//        obj1.setAge(21);
        System.out.println(obj1.getAge());
        obj1.code();



        //Lecture 6: Stereo type anotation

    }
}
