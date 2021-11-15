package com.cst.demo1Interface;
/*
Java8开始，接口中允许有默认方法（默认方法可以有方法体）
[public] default 返回值类型 方法名称(参数列表){
    方法体
}
备注：默认方法可以解决接口升级问题
 */
public interface MyInterfaceDefault {
    //抽象方法
    public abstract void methodAbs();
    // 新抽象方法
//    public abstract void methodAbs2();  // 不覆盖重写就会报错
    // default方法，新添加的方法改成默认方法
    public default void methodDefault(){
        System.out.println("这是新添加的默认方法");
    }
}
