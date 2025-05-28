package com.kat.tasks;

public class Main {
    public static void main(String[] args) {
        Human spiderMan = new Human("Peter Parker", "Male", 24);
        Human ironMan = new Human("Tony Stark", "Male", 53);
        Human blackWidow = new Human("Natasha Romanoff", "Female", 42);
        Human doctorStrange = new Human("Steven Strange", "Male", 45);
        Human hulk = new Human("Bruce Banner", "Male", 55);
        Human scarletWitch = new Human("Wanda Maximoff", "Female", 35);
        Human msPotts = new Human("Pepper Potts", "Female", 44);
        Human captainMarvel = new Human("Carol Danvers", "Female", 27);
        Human antMan = new Human("Scott Lang", "Male", 47);

        City newYork = new City("New York", "1694");
        City losAngeles = new City("Los Angeles", "1781");
        City moscow = new City("Moscow", "1147");

        newYork.getHumans().add(spiderMan);
        newYork.getHumans().add(doctorStrange);
        newYork.getHumans().add(hulk);
        losAngeles.getHumans().add(ironMan);
        losAngeles.getHumans().add(msPotts);
        losAngeles.getHumans().add(captainMarvel);
        losAngeles.getHumans().add(antMan);
        moscow.getHumans().add(scarletWitch);
        moscow.getHumans().add(blackWidow);

        System.out.println("City: " + newYork.getCityName() + " , Humans: " + newYork.getHumans());
        System.out.println("City: " + losAngeles.getCityName() + " , Humans: " + losAngeles.getHumans());
        System.out.println("City: " + moscow.getCityName() + " , Humans: " + moscow.getHumans());
    }
}