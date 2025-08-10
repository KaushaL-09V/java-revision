package org.example.config;


import org.example.Alien;
import org.example.Computer;
import org.example.Desktop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;


//Lecture 6
@Configuration
@ComponentScan("org.example")

public class AppConfig {


    //@Bean()// Lec:1   Not specify name of bean
//    public Desktop desktop(){
//        return new compile();
//    }
    //@Bean(name = {"com2", "Beast", "desktop1"})       //Lec 2   Bean name

/*
    //Lecture 3
    @Bean
//    @Scope("prototype")
    public Desktop desktop(){
        return new Desktop();           //Here all the things will Create and injected ,managed by Sprinf framework
    }

    //Lecture 4 & 5
    @Bean
//    public Alien alien(@Qualifier("desktop") Computer com){
    public Alien alien(Computer com){
        Alien obj = new Alien();
        obj.setAge(25);
        obj.setComputer(com);
//        obj.setComputer(desktop());         //Tightly Coupled
        return obj;
    }

    @Bean
    @Primary
    public Laptop laptop(){
        return new Laptop();
    }

   */


}
//Lecture 2:
//-->Q:What is Bean name?
//-->A:Name Of the Bean is Method Name,By default name:Method name
//-->Q:We can change it?
//-->A:We can change it on @Bean(name="") Annotation



//Lecture 3:Scope Annotation
//-->By Default Every Bean Is singleton(Only one Object Created)
//
//-->Q: Can we created prototype by creating 2 time Object?(App.java)
//-->A: No.........By Calling two object you will get only Single object
//
//-->Q: Can i use Prototype Scope
//-->A: Yes.......Using => @Scope("prototype")


//Lecture 4:Autowire
//
// -->
// jep
