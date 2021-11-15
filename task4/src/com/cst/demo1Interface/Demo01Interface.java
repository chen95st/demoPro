package com.cst.demo1Interface;
/*
接口是多个类的公共的规范
接口是一种引用类型，最重要的内容是其中的抽象方法
定义一个接口格式：
public interface 接口名称{
    //接口内容
}

备注：  .java --> .class

java 7
1、常量
2、抽象方法

Java8
额外包含
3、默认方法
4、静态方法

Java9
5、私有方法

接口使用步骤：
1、接口不能直接使用，必须有一个"实现类"实现该接口；
2、接口的实现类，必须覆盖重写接口中所有抽象方法
3、创建实现类的对象

注意事项：
如果实现类并没有覆盖接口中全部抽象方法，则实现类本身必须是抽象类
 */
public class Demo01Interface {
    public static void main(String[] args) {
//        MyInterfaceAbstract inter = new MyInterfaceAbstract(); //错误方法
        //创建实现类的对象
        MyInterfaceAbstractImpl myimpl = new MyInterfaceAbstractImpl();
        myimpl.method1Abs1();
        myimpl.method1Abs2();
        myimpl.method1Abs3();
        myimpl.method1Abs4();
    }
}
