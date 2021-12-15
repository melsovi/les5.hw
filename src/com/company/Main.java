package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHealth(700);
        boss.setDamage(120);
        boss.setTypeOfProtection("Magic");
        System.out.println("Здоровье Босса: " + boss.getHealth() + " Урон Босса: " +
                boss.getDamage() + " Тип защиты: " + boss.getTypeOfProtection());
        for (int i = 0; i < createHeroes().length; i++) {
            if (createHeroes()[i].getSuperPower() == null) {
                System.out.println("Здоровье героя " + createHeroes()[i].getHealth()
                        + " Урон Героя: " + createHeroes()[i].getDamage()
                        + " Суперспособность Героя: " + "суперспособность отсутствует");
            } else {
                System.out.println("Здоровье героя " + createHeroes()[i].getHealth()
                        + " Урон Героя: " + createHeroes()[i].getDamage()
                        + " Суперспособность Героя: " + createHeroes()[i].getSuperPower());
            }
        }
    }

    public static Hero[] createHeroes() {
        Hero thor = new Hero(250, 50, "Thunder");
        Hero soldier = new Hero(200, 30);
        Hero kinetic = new Hero(210, 60, "Impellent");

        Hero heroes[] = new Hero[]{thor, soldier, kinetic};
        return heroes;
    }
}
/*
Создать класс Героя (Hero), с приватными полями здоровье, урон и суперспособность.
Написать 2 разных конструктора для создания объекта. В одном конструкторе задаются все поля,
в другом только здоровье и урон. Добавить в класс Hero геттеры для всех полей.
Создать класс Босса (Boss), с приватными полями здоровье, урон и тип защиты.
Добавить в класс геттеры и сеттеры для всех полей.
В классе Main создать 1 экземпляр босса и задать ему все свойства (значения полям).
Затем распечатать всю информацию о боссе.
ДЗ на сообразительность:
Добавить метод в классе Main который называется createHeroes,
в теле метода необходимо создать 3х героев с помощью класса Hero,
используя при этом разные варианты конструкторов (либо первый либо второй).
Затем поместить созданные экземпляры героев в массив и вернуть его с помощью команды return,
как возвращаемый результат метода createHeroes. Hero[]
Затем вызвать этот метод в методе main и распечатать информацию о всех героях массива через цикл.
 */