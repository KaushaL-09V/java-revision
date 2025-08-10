package org.example;

import java.beans.ConstructorProperties;

public class Alien {

    private int age;
    private laptop lap;
    public Alien() {
        System.out.println("Alien Object Created....");
    }

    @ConstructorProperties({"age","lap"})
    public Alien(int age,laptop lap){
        System.out.println("Para Constructor Called");
        this.age=age;
        this.lap = lap;
        System.out.println("Constructor End");
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("Setter called");
        this.age = age;
    }

    public void code(){
        System.out.println("Coding.....");
        lap.compile();
    }

    public laptop getLap() {
        return lap;
    }

    public void setLap(laptop lap) {
        this.lap = lap;
    }
}
