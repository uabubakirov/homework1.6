package com.company;

public class Boss extends GameEntity {
    Weapon weapon;

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
    public String info(){
        return  super.info() +"," + "Использует оружие: " + weapon.getNameOfWeapon()+","+"Тип урона: "+weapon.getTypeOfWeapon();
    }
}
