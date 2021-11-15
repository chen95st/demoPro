package com.cst.Demo4Red;

import java.util.ArrayList;

public class Manager extends User{
    public Manager() {
        // super()
    }

    public Manager(String name, int money) {
        super(name, money);
    }
    // 群主发红包的方法
    public ArrayList<Integer> send(int totalMoney, int count){
        //需要一个集合，用来存储若干个红包的金额
        ArrayList<Integer> redList = new ArrayList<>();
        //看群主本身总余额
        int leftMoney = super.getMoney();
        if (totalMoney > leftMoney){
            System.out.println("余额不足");
            return redList;//返回空集合
        }

        // 扣钱，重新设置余额
        super.setMoney(leftMoney-totalMoney);

        // 发红包，需要平均拆分成count份
        int avg = totalMoney / count;
        int mod = totalMoney % count;
        // 除不开的零头，加到最后一个红包中；
        // 将红包一个个放入集合中
        for (int i = 0; i < count-1; i++) {
            redList.add(avg);
        }
        // 零头加到最后一个红包中
        redList.add(avg+mod);
        return redList;
    }
}
