package com.company.players;

import com.company.General.RPG_Game;

public class TrickyBastard extends Hero{
    public TrickyBastard(int health, int damage, String heroname) {
        super(health, damage, heroname,SuperAbility.PRETEND_TO_BE_DEAD);
    }

    @Override
    public void applySuperAbility(Hero[] heroes, Boss boss) {
        boolean ff = RPG_Game.ramdom.nextBoolean();
        if (ff){// еслт (правда)
            setHealth(getHealth()+boss.setDamage(boss.getDamage()/5));
            boss.setHealth(boss.getHealth()+getDamage());//притворяется мертвым
        }
    }
}
