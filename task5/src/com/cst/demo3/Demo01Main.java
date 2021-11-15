package com.cst.demo3;
/*
对象的向上转型
弊端：一旦向上转型为父类，无法调用子类特有方法
解决方法：用对象的向下转型【还原】
对象的向下转型


 */
public class Demo01Main {
    public static void main(String[] args) {
        Animal animal = new Cat();
        animal.eat();

        // 向下转型
        Cat cat = (Cat)animal;
        cat.catchMouse();

        // 向下转型为Dog，还原错了形态；本来是猫，你愣要转成狗，人家能愿意么～
//        Dog dog = (Dog) animal;  // 报错：java.lang.ClassCastException
//        dog.eat();
    }
}
