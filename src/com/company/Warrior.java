package com.company;

public class Warrior extends Hero{
    @Override
    public void applySuperAbility(){
        setHealth(280);
        setDamage(56);
        setAbilityType("лучший удар");
        System.out.println("вариор" + getHealth() +"hp" + " " + getDamage() + "дамаг вариора" + " " + getAbilityType() + "использовал силу");


    }
}

