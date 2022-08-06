package com.company.players;

import com.company.General.RPG_Game;

public class Magic extends Hero{
    public Magic(int health, int damage, String heroname) {
        super(health, damage, heroname, SuperAbility.BOOST);
    }

    @Override
    public void applySuperAbility(Hero[] heroes, Boss boss) {
        int num = RPG_Game.ramdom.nextInt(5)+1;
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getHealth()>0 && this != heroes[i]){
                heroes[i].setDamage(heroes[i].getDamage() + num);
            }

        }
    }
}
