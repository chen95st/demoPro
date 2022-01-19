package com.cst.demo5;
/*
如果接口的实现类(或者父类的子类），只需要使用唯一的一次
那么这情况下就可以省略该类的定义，而改为使用【匿名内部类】

匿名内部类定义格式
接口名称 对象名 = new 接口名称(){
    // 覆盖重写接口中所有抽象方法
};

匿名内部类，省略的类名称，但是匿名对象省略的对象名称

 */
public class DemoMain {
    public static void main(String[] args) {
//        MyInterfaceImpl obj = new MyInterfaceImpl();
//        obj.method();

//        MyInterface obj = new MyInterfaceImpl();
//        obj.method();

        // 使用匿名内部类！！！！！！！！！！！！匿名内部类省略的类名称，不是匿名对象
        MyInterface  obj = new MyInterface() {
            @Override
            public void method() {
                System.out.println("匿名内部类实现了方法");
            }
        };
        obj.method();

        // 使用匿名内部类，同时使用匿名对象
        new MyInterface(){
            @Override
            public void method(){
                System.out.println("使用匿名对象");
            }
        }.method();
    }
}
