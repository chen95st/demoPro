package com.cst.demo1;
/*
1、final可以用来修饰一个类
当final关键字用来修饰一个类的时候，格式：
public final class 类名称{
    // ...
}

也就是说，当前这个类不能有任何的子类，（太监类）但是有父类

一个类如果是final的，那么其中所有的成员方法都无法进行覆盖重写（因为没有儿子


 */
public final class MyClass /* extends Object */{
    public void method(){
        System.out.println(
                "方法执行！"
        );
    }
}
