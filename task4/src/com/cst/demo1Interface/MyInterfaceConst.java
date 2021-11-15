package com.cst.demo1Interface;
/*
接口当中也可以定义"成员变量"，但是必须使用public static final 三个关键字修饰
从效果看，其实是接口的【常量】
[public] [static] [final] 数据类型 常量名称 = 数据值;

备注：一旦使用final关键字修饰，说明不可改变
注意事项：
1、接口当中的常量，可以省略public static final ，所以省略三个中任意一个，也是这样
2、接口当中的常量，一定要进行赋值
3、接口当中的常量名称，使用完全大些字母，用下划线分隔
 */
public interface MyInterfaceConst {
    // 此为常量，一旦被赋值，不可修改
    public static final int NUM_OF_MY_CLASS = 10;

}
