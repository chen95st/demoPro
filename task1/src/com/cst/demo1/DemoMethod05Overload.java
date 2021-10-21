package com.cst.demo1;
/*
方法的重载
*/
public class DemoMethod05Overload {
    public static void main(String[] args) {
        getSum(10,20);
        getSum(15,25,10);
    }
    public static int getSum(int a, int b){
        return a+b;
    }
    public static int getSum(int a, int b, int c){
        return a+b+c;
    }

}
