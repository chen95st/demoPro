package com.cst.demo2;

public class DemoArray02 {
    public static void main(String[] args) {
        //静态初始化
        //创建一个数组,直接加数据
        int[] array1 = new int[]{1,5,10,25};
        System.out.println(array1);  //   [I@6e0be858  内存地址哈希值；[ 代表数组  I代表int，@后面是十六进制
        System.out.println(array1[2]);
        int num = array1[0];
        System.out.println(num);
        String[] array2 = new String[]{"cst","hello","JD"};
        System.out.println(array2);  // [Ljava.lang.String;@61bbe9ba
        System.out.println(array2[0]);

        //省略格式的静态初始化
        int[] array3 = {2,3,4};

        int[] array4;
        array4 = new int[]{666,888};
    }

}
