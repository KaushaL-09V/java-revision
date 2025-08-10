package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component          //If you want the objects ,You don't have do do ny configuration no need of been tag

public class Alien {

    private int age;

    @Autowired
    private Computer computer;

    public Alien() {
        System.out.println("Alien Object Created....");
    }

    public Alien(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Computer getComputer() {
        return computer;
    }

    public void setComputer(Computer computer) {
        this.computer = computer;
    }

    public void code(){
        System.out.println("Coding.........");
        computer.compile();
    }
}
