package com.cst.demo2;

public class Fu {
    int num = 10;
    public void showNum(){
        System.out.println("父类展示num="+num);
    }

    public void method(){
        System.out.println("父类方法");
    }
    public void methodFu(){
        System.out.println("父类特有方法");
    }
}
