package com.company.players;

import com.company.General.RPG_Game;

public class Berserk extends Hero {

    public Berserk(int health, int damage, String heroname) {
        super(health, damage, heroname, SuperAbility.SAVE_DAMAGE_AND_REVERT);
    }

    @Override
    public void applySuperAbility(Hero[] heroes, Boss boss) {
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i] instanceof Berserk)
                setDamage(getDamage() + boss.getDamage()/5);//++2: 20,22,24 and .....
        }
    }
}