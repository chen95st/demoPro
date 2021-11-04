package com.cst.demo2;
/*
数组作为方法参数
当调用方法时，传入的参数，其实是数组的地址值
 */
public class DemoArray09Param {
    public static void main(String[] args) {
        int[] array ={10,20,25,30,5,45};
        System.out.println("=====one=====");
        printArray(array);
        System.out.println("=====two=====");
        printArray(array);
    }
    public static void printArray(int[] array){
        System.out.println(array);
        for (int i = 0;i <array.length;i++){
            System.out.println(array[i]);
        }
    }
}







