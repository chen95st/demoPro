package com.cst.demo3;

public abstract class Dog extends Animal{
    @Override
    public void eat() {
        System.out.println(
                "狗吃狗粮"
        );
    }

    // public void sleep();
}
