package com.cst.demo3;
/*
如何知道一个父类引用对象本来是什么子类
格式：
对象 instanceof 类型
将会得到一个boolean值，即判断前面的对象能不能当作后面类型的实例

 */
public class Demo02Instaceof {
    public static void main(String[] args) {
//        Animal animal = new Cat();
        Animal animal = new Dog();
        animal.eat();

        // 如果希望调用子类特有方法，需要向下转型
        // 判断一下父类引用animal本来是不是Dog
        if (animal instanceof Dog){
            Dog dog = (Dog) animal;
            dog.watchHouse();
        }
        // 判断一下父类引用animal本来是不是Cat
        if (animal instanceof Cat){
            Cat cat = (Cat) animal;
            cat.catchMouse();
        }
        System.out.println("===============");
        giveAPet(new Cat());
    }

    public static void giveAPet(Animal animal){
        // 判断一下父类引用animal本来是不是Dog
        if (animal instanceof Dog){
            Dog dog = (Dog) animal;
            dog.watchHouse();
        }
        // 判断一下父类引用animal本来是不是Cat
        if (animal instanceof Cat){
            Cat cat = (Cat) animal;
            cat.catchMouse();
        }
    }
}
