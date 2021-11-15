package com.cst.demo3;
/*
子接口
 */
public interface MyInterface extends MyInterfaceA,MyInterfaceB{
    public abstract void method();

    @Override
    default void methodDefault() {
        System.out.println("子接口覆盖重写默认方法");
    }
}
