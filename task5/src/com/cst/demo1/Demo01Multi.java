package com.cst.demo1;
/*
左父右子就是多态

代码中体现多态性，其实就是一句话，父类引用指向子类对象
父类名称 对象名 = new 子类名称();
接口名称 对象名 = new 实现类名称();

 */
public class Demo01Multi {
    public static void main(String[] args) {
        // 使用多态的写法
        // 左侧父类的引用，指向了右侧子类的对象
        Fu obj = new Zi();  // 右边new的是谁就运行谁
        obj.method();
        obj.methodFu();
    }
}
