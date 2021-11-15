package com.cst.demo3;
/*
1、类与类之间是单继承的，直接父类只能有一个；
2、类与接口之间是多实现的，一个类可以实现多个接口；
3、接口与接口之间是多继承的
注意事项：
1、多个父接口中的抽象方法重复，没关系；
2、多个父接口中的默认方法重复，有关系，子接口必须进行默认接口的覆盖重写
 */
public class Demo01Relations {
    public static void main(String[] args) {
    MyInterfaceImpl myInterfaceimpl = new MyInterfaceImpl();
    myInterfaceimpl.methodDefault();
    }
}
