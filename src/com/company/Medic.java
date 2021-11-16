package com.company;

public class Medic extends Hero{

    @Override
    public void applySuperAbility() {
        setHealth(280);
        setDamage(0);
        setAbilityType("лечит");
        System.out.println("медик" + getHealth() + "хп" + " " + getDamage() + "" +  getAbilityType()+ " вылечил");
    }
}

