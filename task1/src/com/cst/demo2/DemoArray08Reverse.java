package com.cst.demo2;
/*
数组元素反转，即对称位置的元素交换
遍历数组是用的一个索引；
现在表示对称位置需要两个索引；
 */
public class DemoArray08Reverse {
    public static void main(String[] args) {
        int[] array = {5,2,9,6,1,10,20};
        // 打印数组初始模样
        for (int i = 0;i<array.length;i++){
            System.out.println(array[i]);
        }
        /*
        初始化语句
        条件判断
        步进表达式
        循环体（涉及三个变量）
         */
        for (int smaller= 0,larger=array.length-1; smaller < larger;smaller++,larger--){
                int temp = array[smaller];
                array[smaller] = array[larger];
                array[larger] = temp;
            }
        // 打印反转后的数组
        for (int i = 0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }
}
