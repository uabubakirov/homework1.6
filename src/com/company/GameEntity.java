package com.company;

public class GameEntity {
    private int hitPoints;
    private int damage;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHitPoints() {
        return hitPoints;
    }


    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
    public String info(){
        return  "Информация о персонаже --------->"+"  "+name+":  " +"Здоровье: " + hitPoints +","+ "Урон: " + damage;
    }

}
