package com.cst.demo3;

public class Dog extends Animal{
    @Override
    public void eat() {
        System.out.println("狗吃狗粮");
    }
    public void watchHouse(){
        System.out.println("狗看家");
    }
}
