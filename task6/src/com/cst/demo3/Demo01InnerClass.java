package com.cst.demo3;
/*
如果一个事物的内部包含另一个事务，那么就是一个类内部包含另个类
如 身体和心脏、汽车和发动机

分类
1、成员内部类
2、局部内部类（包含匿名内部类）

成员内部类的定义格式
修饰符 class 类名称{
    修饰符 class 内部类名称{
        // ...
    }
    // ...
}
注意：内用外，随意访问；外用内，需要内部类对象
==========================
如何使用这个成员内部类？两种方式：
1、间接方式：在外部类的方法中，使用内部类，然后main只是调用外部类的方法；
2、直接方式：
一般：类名称 对象名 = new 类名称();
【外部类名称.内部类名称 对象名 = new 外部类名称().new 内部类名称();】

 */
public class Demo01InnerClass {
    public static void main(String[] args) {
        Body body = new Body();  //外部类的对象
        body.setName("Jenny");
        // 通过外部类的对象，调用外部类的方法，里面间接的使用内部类Heart
        body.methodBody();
        System.out.println("=============");

        Body.Heart heart = new Body().new Heart();  //直接调用内部类
        heart.beat();
    }

}
