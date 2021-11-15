package com.cst.demo2;
/*
【p183 继承父类并实现多个接口】

1、接口是没有静态代码块或者构造方法的
2、一个类的直接父类是唯一的，但是一个类可以同时实现多个接口
public class MyInterfaceImpl implements MyInterfaceA,MyInterfaceB{
    // 覆盖重写所有抽象方法
}
3、实现类中所实现的多个接口抽象方法重名了，只需要实现一次
4、如果实现类没有实现对应所有接口中的抽象方法，此实现类就必须是抽象类
5、如果实现类实现的多个接口中，存在重复的默认方法，那么实现类一定要对冲突的默认方法进行覆盖重写
6、一个类如果直接父类当中的方法，和接口当中的默认方法有了冲突，优先用父类中的方法
继承优先于接口实现
 */
public class Demo01Interface {
    public static void main(String[] args) {
        Zi zi =new Zi();
        zi.method();
    }
}
