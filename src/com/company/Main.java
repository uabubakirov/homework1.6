package com.company;

public class Main {

    public static void main(String[] args) {
        Weapon bossWeapon = new Weapon();
        bossWeapon.setTypeOfWeapon("Физический");
        bossWeapon.setNameOfWeapon("Меч");

        Boss boss = new Boss();
        boss.setName("Босс");
        boss.setHitPoints(800);
        boss.setDamage(50);
        boss.setWeapon(bossWeapon);
        System.out.println(boss.info());

        Weapon warriorSkeletsWeapon = new Weapon();
        warriorSkeletsWeapon.setNameOfWeapon("Лук");
        warriorSkeletsWeapon.setTypeOfWeapon("Физический(сильный),стрелы");

        Skelet warriorSkelet = new Skelet();
        warriorSkelet.setName("Скелет воин");
        warriorSkelet.setHitPoints(200);
        warriorSkelet.setDamage(70);
        warriorSkelet.setWeapon(warriorSkeletsWeapon);
        warriorSkelet.setArrows(10);
        System.out.println(warriorSkelet.info());


        Weapon scoutWeapon = new Weapon();
        scoutWeapon.setNameOfWeapon("Лук");
        scoutWeapon.setTypeOfWeapon("Физический(слыбый),стрелы");

        Skelet scoutSkelet = new Skelet();
        scoutSkelet.setName("Скелет разведчик");
        scoutSkelet.setHitPoints(100);
        scoutSkelet.setDamage(20);
        scoutSkelet.setWeapon(scoutWeapon);
        scoutSkelet.setArrows(5);
        System.out.println(scoutSkelet.info());


    }
}
