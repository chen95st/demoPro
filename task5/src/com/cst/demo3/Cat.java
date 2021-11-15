package com.cst.demo3;

public class Cat extends Animal{
    @Override
    public void eat() {
        System.out.println("猫爱吃猫粮");
    }
    public void catchMouse(){
        System.out.println("猫捉老鼠");
    }
}
