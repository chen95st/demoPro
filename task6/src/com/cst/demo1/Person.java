package com.cst.demo1;
/*
final关键字修饰成员变量桑踹，则这个变量也是不可变的
成员变量具有默认值，所以用了final之后必须手动赋值，不会再给默认值
对于final的成员变量，要么直接赋值，要么通过构造方法赋值
必须保证类当中所有重载方法都对final成员变量进行赋值
 */
public class Person {
    private final String name;

    public Person() {
        name = "关关";
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

//    public void setName(String name) {
//        this.name = name;
//    }
}
