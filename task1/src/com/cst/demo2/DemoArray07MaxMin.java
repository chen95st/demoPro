package com.cst.demo2;

public class DemoArray07MaxMin {
    public static void main(String[] args) {
        int[] array1 = {5,10,30,20,100};
        int num = array1[0];
        for (int i=0;i<array1.length;i++){
            if (num < array1[i]){
                num = array1[i];
            }
        }
        System.out.println("max is "+num);
    }
}
