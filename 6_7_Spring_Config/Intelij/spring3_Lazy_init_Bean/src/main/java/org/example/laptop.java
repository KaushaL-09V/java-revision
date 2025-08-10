package org.example;

public class laptop implements Computer {
    public laptop(){
        System.out.println("Laptop object created....");
    }

    @Override
    public void compile(){
        System.out.println("Compiling...In Laptop");
    }
}
