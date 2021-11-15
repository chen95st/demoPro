package com.cst.demo1Interface;
/*
从java8开始，接口当中允许定义静态方法

即将abstract或者default 换成static即可，带上方法体
 */
public interface MyInterfaceStatic {
    public static void methodStatic(){
        System.out.println(
                "这是接口的静态方法"
        );
    }
}
