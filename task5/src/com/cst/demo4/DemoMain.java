package com.cst.demo4;

import jdk.swing.interop.SwingInterOpUtils;

public class DemoMain {
    public static void main(String[] args) {
        //首先需要创建一个笔记本电脑
        Laptop computer = new Laptop();
        computer.powerOn();

        //准备一个鼠标，供电脑使用
        Mouse mouse = new Mouse();

        //首先进行向上转型
        USB usbMouse = new Mouse(); //多态写法
        //参数是USB类型，我正好传递进去的是USB鼠标
        computer.usbDevice(usbMouse);

        //创建一个USB键盘
        Keyboard keyboard = new Keyboard();  // 没有使用多态写法

        // 方法参数是USB类型，传递进去的是【实现类对象】
        computer.usbDevice(keyboard);   // 发生了向上转型
        // 使用子类对象，匿名对象，都是可以的
//        computer.usbDevice(new Keyboard()); // 也是正确写法

        computer.powerOff(); // 没有使用多态写法

        System.out.println("=============");
        method(10.0);  // 正确写法； double -> double
        method(10);  // 正确写法； 自动转换 int -> double
        int a = 30;
        method(a);
    }

    public static void method(double num){
        System.out.println(num);
    }
}
