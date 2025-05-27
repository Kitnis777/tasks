package com.kat.tasks;

public class Main {
    public static void main(String[] args) {
        Human spiderMan = new Human("Peter Parker", "Male", 24);
        Human ironMan = new Human("Tony Stark", "Male", 53);
        Human blackWidow = new Human("Natasha Romanoff", "Female", 42);
        Human doctorStrange = new Human("Steven Strange", "Male", 45);

        City newYork = new City("New York", "1694");
        City losAngeles = new City("Los Angeles", "1781");
        City moscow = new City("Moscow", "1147");

        newYork.addHuman(spiderMan);
        newYork.addHuman(doctorStrange);
        losAngeles.addHuman(ironMan);
        moscow.addHuman(blackWidow);

        System.out.println(newYork);
        System.out.println(losAngeles);
        System.out.println(moscow);
    }
}