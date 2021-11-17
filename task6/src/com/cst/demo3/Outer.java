package com.cst.demo3;

import java.util.Objects;

public class Outer {
    int num = 10;
    public class Inner /*extends Object*/ {
        int num =20;
        public void methodInner(){
            int num =30;
            System.out.println(num);  // 就近原则，内部类方法的局部变量
            System.out.println(this.num);  // 内部类的成员变量
            System.out.println(Outer.this.num);   // 此处新学   外部类的成员变量
        }
    }
}
