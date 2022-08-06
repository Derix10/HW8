package com.company.players;

import com.company.General.RPG_Game;

public class Thor extends Hero{
    public Thor(int health, int damage, String heroname) {
        super(health, damage, heroname, SuperAbility.THUNDER);
    }

    @Override
    public void applySuperAbility(Hero[] heroes, Boss boss) {
        boolean ran = RPG_Game.ramdom.nextBoolean();
        if (ran){
            boss.setDamage(0);
        }
        if (!ran){
            boss.setDamage(50);
        }
    }
}
