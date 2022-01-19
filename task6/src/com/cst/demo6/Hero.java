package com.cst.demo6;

public class Hero {

    private String name;
    private int age;
    private Weapon weapon;  // 类作为成员变量

    public Hero() {
    }

    public Hero(String name, int age, Weapon weapon) {
        this.name = name;
        this.age = age;
        this.weapon = weapon;
    }
    public void attack(){
        System.out.println("年龄为"+age+"的"+name+"拿着"+weapon.getCode()+"攻击了敌方~");
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

}
