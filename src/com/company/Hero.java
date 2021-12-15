package com.company;

public class Hero {
    private int health;
    private int damage;
    private String superPower;

    public Hero(int heal, int damage, String superPower) {
        this.health = heal;
        this.damage = damage;
        this.superPower = superPower;
    }

    public Hero(int heal, int damage) {
        this.health = heal;
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

    public String getSuperPower() {
        return superPower;
    }
}
