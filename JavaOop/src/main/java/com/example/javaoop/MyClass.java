package com.example.javaoop;

public class MyClass {

    public static void main(String[] args) {
        MyJava myJava=new MyJava();
        myJava.oopJava();
        myJava.A();

        Instance instanceObj=new Instance();
        instanceObj.instance();
        instanceObj.instance2();


        Parameter parameterObj=new Parameter();
        parameterObj.parameter(34, 45, 22);
        parameterObj.parameter2(23, 54, 44);


        StaticClass.sonaMia();
        StaticClass.A();


        Conastractor conastractor=new Conastractor(20 , 34);
        Conastractor conastractor1=new Conastractor(20.99, 56.80);



        Sub sub=new Sub();
        sub.shakil();


        HelpInt helpInt=new HelpInt();
        helpInt.allah();


        IntHelp intHelp=new IntHelp();
        intHelp.yaKarim();


        HelpAbastract abastractObj=new HelpAbastract();
        abastractObj.sonaMia();


        Getter getter=new Getter();
        getter.allah();
        System.out.println( getter.allah());


        Setter setter=new Setter();
        setter.H("YA Allah");


        Get getObj=new Get();
        System.out.println(getObj.mohammad());


        Set setObj=new Set();
        setObj.sonaMia("Mohammad");


        AbSet abSet=new AbSet();
        abSet.G("AllahuAkbar");



        AbGet abGet=new AbGet();
        System.out.println(abGet.H());


        OverLoading overLoading=new OverLoading();
        overLoading.minhaz(45.000, 56.899, 234.00);
        overLoading.murad(45, 67);


        SubSon subSon=new SubSon();
        subSon.allah();

        MihazHelp ooo =new MihazHelp();
        ooo.muradDon();






    }
}