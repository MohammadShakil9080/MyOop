package com.example.javaoop;

public class Instance {

    public int a=90;
    public int b=67;
    public int c;

    public void instance(){
        this.c=this.a+this.b;
        System.out.println("sum is =  "+c);

    }

    public void instance2(){
        this.c=this.a*this.b;

        System.out.println(c);
    }
}
