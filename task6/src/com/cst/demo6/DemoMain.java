package com.cst.demo6;

public class DemoMain {
    public static void main(String[] args) {
        Hero hero = new Hero();
        hero.setName("艾伦");
        hero.setAge(25);


        Weapon weapon = new Weapon("霜之哀伤");
        hero.setWeapon(weapon);
        hero.attack();
    }
}
