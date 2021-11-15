package com.cst.demo1;
/*
p195
final 关键字代表最终、不可改变的
常见四种用法：
1、可以用来修饰一个类
2、可用用来修饰一个方法
3、还可以用来修饰一个局部变量
4、还可以用来修饰一个成员变量
 */
public class Demo01Final {
    public static void main(String[] args) {
        int num1 = 10;
        System.out.println(num1);
        num1 = 20;
        System.out.println(num1);

        // 一旦使用final修饰局部变量，那么这个变量不能进行更改
        // 一次赋值，终生不变
        final int num2 = 200;
        System.out.println(num2);
//        num2 = 200; //错误写法
//        num2 = 110;  //错误写法

        final int num3;
        num3 = 30; // 正确写法，只要保证是唯一一次赋值即可

        // 对于基本类型来说，不可变说的是变量中的数据不可改变
        // 对于引用类型来说，不可变说的是变量中的地址值不可改变

        Student stu1 = new Student("Jenny");
        System.out.println(stu1);
        System.out.println(stu1.getName());
        stu1 = new Student("Tom");
        System.out.println(stu1);
        System.out.println(stu1.getName());

        final Student stu2 = new Student("Amy");
//        stu2 = new Student("hahh");// 错误写法，final的引用类型变量，其中的地址值不可改变
        stu2.setName("Amyyyyy");
        System.out.println(stu2.getName());


    }
}
