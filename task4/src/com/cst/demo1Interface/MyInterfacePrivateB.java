package com.cst.demo1Interface;
/*
使用了Java11。接口类中使用静态私有化方法必须是java9及之后版本p180
 */
public interface MyInterfacePrivateB {
    public static void methodDefault1(){
        System.out.println("静态方法1");
        methodStaticCommon();
    }

    public static void methodDefault2(){
        System.out.println("静态方法2");
        methodStaticCommon();
    }

    private static void methodStaticCommon(){   // java9之后才可以在接口中使用静态私有化方法
        System.out.println("aaa");
        System.out.println("bbb");
        System.out.println("ccc");
    }
}
