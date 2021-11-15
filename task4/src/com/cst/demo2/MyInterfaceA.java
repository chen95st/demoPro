package com.cst.demo2;

public interface MyInterfaceA {
    //错误写法，不能有静态代码块
//    static{
//
//    }
    // 错误写法，不能有构造方法
//    public MyInterface(){
//
//    }
    public abstract void methodA();
    public abstract void methodAbs();
    public default void methodDefault(){
        System.out.println("aaa");
    }

}
