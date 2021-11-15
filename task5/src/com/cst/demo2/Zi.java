package com.cst.demo2;

public class Zi extends Fu{
    int num = 20;
    int age = 18;
    @Override
    public void showNum(){
        System.out.println("子类展示num="+num);
    }
    @Override
    public void method(){
        System.out.println("子类方法");
    }

    public void methodZi(){
        System.out.println("子类特有方法");
    }
}
