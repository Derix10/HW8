package com.company.players;

import com.company.General.RPG_Game;

public class Magic extends Hero{
    public Magic(int health, int damage, String heroname) {
        super(health, damage, heroname, SuperAbility.BOOST);
    }

    @Override
    public void applySuperAbility(Hero[] heroes, Boss boss) {

    }
}
