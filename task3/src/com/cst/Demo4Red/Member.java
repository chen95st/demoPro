package com.cst.Demo4Red;

import java.util.ArrayList;
import java.util.Random;

public class Member extends User{
    public Member() {
    }

    public Member(String name, int money) {
        super(name, money);
    }

    public void receive(ArrayList<Integer> arrayList){
        // 从多个红包中随便抽取一个
        // 随机获取一个集合当中的索引值
        int index = new Random().nextInt(arrayList.size());
        int delta =  arrayList.remove(index);
        // 当前成员自己本来多少钱？
        int money = super.getMoney();
        // 加完，重新设置回去
        super.setMoney(money + delta);
    }
}
