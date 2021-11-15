package com.cst.demo1Interface;
/*
接口的默认方法，可以通过接口实现类对象，直接调用
接口中的默认方法，可以被接口实现类覆盖重写

 */
public class Demo02Interface {
    public static void main(String[] args) {
        MyInterfaceDefaultA a = new MyInterfaceDefaultA();
        a.methodAbs();
        a.methodDefault();

        MyInterfaceDefaultB b = new MyInterfaceDefaultB();
        b.methodAbs();
        b.methodDefault();

    }
}
