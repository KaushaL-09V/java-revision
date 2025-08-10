package org.example;

import java.beans.ConstructorProperties;

public class Alien {

    private int age;
    private Computer com1;
    public Alien() {
        System.out.println("Alien Object Created....");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("Setter called");
        this.age = age;
    }

    public Computer getCom() {
        return com1;
    }

    public void setCom(Computer com) {
        this.com1 = com;
    }

    public void code(){
        System.out.println("Coding.....");
        com1.compile();
    }

}
