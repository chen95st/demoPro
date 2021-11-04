package com.cst.demo2;
/*
数组索引编号从0开始，一直到数组长度-1为止
若访问的数组元素，其索引编号并不存在，那么将会发生数组索引越界异常

空指针异常


*/
public class DemoArray04 {
    public static void main(String[] args) {
        int[] array1 = {10,20,30};
        System.out.println(array1[0]);
        System.out.println(array1[1]);
        System.out.println(array1[2]);
//        System.out.println(array1[3]);  //Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 3  数组索引越界异常
        int[] array2 = null;
        System.out.println(array2[0]); // Exception in thread "main" java.lang.NullPointerException
     }
}
