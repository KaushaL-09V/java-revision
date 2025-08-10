package org.example;

public class Alien {

    private int age;
    private laptop lap;
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
