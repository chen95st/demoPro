package com.cst.demo1;

public class DemoMethod02Return {
    public static void main(String[] args) {
        int result = getSum(10,20);
        System.out.println("getSum result is "+ result);
        System.out.println("===============");
        printSum(15,25);
    }
    // 有返回值
    public static int getSum(int a, int b){
        int result = a+b;
        return result;
    }
    // 无返回值
    public static void printSum(int a, int b){
        int result = a + b;
        System.out.println("printSum result is "+ result);
    }
}
