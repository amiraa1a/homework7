package com.company;

public class Magic  extends Hero  {
    @Override
    public void applySuperAbility() {
        setHealth(270);
        setDamage(60);
        setAbilityType("соль в глаза");
         System.out.println("Мэджик" + getHealth() + "хп" + getDamage() + " " + "дамаг мэджика" +   " " + getAbilityType() + " "+ "мэджик применил магию");
    }
}

