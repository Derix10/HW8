package com.company.players;

import com.company.General.RPG_Game;

public class Warrior extends Hero{
    public Warrior(int health, int damage, String heroname) {
        super(health, damage, heroname, SuperAbility.CRITICAL_DAMAGE);
    }

    @Override
    public void applySuperAbility(Hero[] heroes, Boss boss) {
        int number = RPG_Game.ramdom.nextInt(4)+2;
        setDamage(getDamage()*number);
    }
}
