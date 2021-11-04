package com.cst.demo2;
/*
一个数组的内存图

*/
public class DemoArray03 {
    public static void main(String[] args) {
        int[] array1 = new int[3];
        System.out.println(array1[0]);
        System.out.println(array1[1]);
        System.out.println(array1[2]);

        //改变数组中元素的内容
        array1[1]=10;
        array1[2]=20;
        System.out.println(array1); //地址值
        System.out.println(array1[0]);
        System.out.println(array1[1]);
        System.out.println(array1[2]);

        System.out.println("======第二个数组=====看两个数组的内存图");
        int[] array2 = new int[3];
        System.out.println(array2[0]);
        System.out.println(array2[1]);
        System.out.println(array2[2]);

        //改变数组中元素的内容
        array2[1]=10;
        array2[2]=20;
        System.out.println(array2); //地址值
        System.out.println(array2[0]);
        System.out.println(array2[1]);
        System.out.println(array2[2]);

    }
}
