package com.example.javaoop;

public class Sub extends Super{

    public void shakil(){
        super.shakil();
        this.c=this.a+this.b;
        System.out.println(c);
    }
}
