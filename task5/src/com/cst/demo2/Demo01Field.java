package com.cst.demo2;
/*
访问成员变量的两种方式：
1、直接通过对象名称访问成员变量：看等号左边是谁，优先用谁，没有则向上找
2、间接通过成员方法访问成员变量：看该方法属于谁，优先用谁，没有则向上找
 */
public class Demo01Field {
    public static void main(String[] args) {
        //使用多态写法
        Fu obj = new Zi();
        System.out.println(obj.num);
//        System.out.println(obj.age);//父类没有，不能向下找
        System.out.println("=============");
        //子类没有覆盖重写，所以就是父类中成员方法
        //子类如果覆盖重写，就是子类中的成员方法啦
        obj.showNum();

    }
}
