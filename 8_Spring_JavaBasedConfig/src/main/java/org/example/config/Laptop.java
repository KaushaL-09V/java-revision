package org.example.config;

import org.example.Computer;
import org.springframework.stereotype.Component;

@Component
public class Laptop implements Computer {
    public void laptop(){
        System.out.println("Laptop object created....");
    }

    @Override
    public void compile(){
        System.out.println("Compiling...In Laptop");
    }
}
