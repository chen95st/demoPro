package com.cst.Demo4Red;

public class User {
    /**
     * 所有用户
     * 姓名
     * 余额
     */
    private String name;
    private int money;

    public User() {
    }

    public User(String name, int money) {
        this.name = name;
        this.money = money;
    }
    // 展示一下用户当前的余额
    public void show(){
        System.out.println("我叫："+name+"，我拥有余额："+money);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
