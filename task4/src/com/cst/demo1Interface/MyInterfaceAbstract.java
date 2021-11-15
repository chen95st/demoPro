package com.cst.demo1Interface;
/*
任何版本Java中，接口都能定义抽象方法
格式：
[public] [abstract] 返回值类型 方法名称（参数列表）

注意事项：
1、接口当中的抽象方法，修饰符必须是两个固定的关键字，public abstract
2、这两个关键字可选择性省略，但是不推荐
3、方法的三要素可以随意定义

 */
public interface MyInterfaceAbstract {

    //以下都是抽象方法（都是分号直接结束，没有方法体的）
    public abstract void method1Abs1();
    abstract void method1Abs2();
    public void method1Abs3();
    void method1Abs4();

}
