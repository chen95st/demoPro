package com.cst.demo1;

public class DemoMethod06OverloadSame {
    public static void main(String[] args) {
        byte a = 10;
        byte b = 10;
        byte c = 11;
        System.out.println(isSame(a,b));
        System.out.println(isSame(a,(short)b));
        System.out.println(isSame(c,(int)b));
    }
    public static boolean isSame(byte a, byte b){
        System.out.println("===two byte compare===");
        boolean result;
        if (a==b){
            result = true;
        }else {
            result = false;
        }
        return result;
    }
    public static boolean isSame(short a, short b){
        System.out.println("===two short compare===");
        boolean result = a == b ? true : false;
        return result;
    }
    public static boolean isSame(int a,int b){
        System.out.println("===two int compare===");
        boolean result = a == b;
        return result;
    }
    public static boolean isSame(long a,long b){
        System.out.println("===two long compare===");
        return a==b;
    }
    public static boolean isSame(int a,long b){
        System.out.println("===one int, one long compare===");
        return a==b;//shift +f6,对应修改所有
    }
}
