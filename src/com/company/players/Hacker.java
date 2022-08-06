package com.company.players;

import com.company.General.RPG_Game;

public class Hacker extends  Hero {
    private int hackingHealth;

    public Hacker(int health, int damage, String heroname, int hackingHealth) {
        super(health, damage, heroname, SuperAbility.HACKING);
        this.hackingHealth = hackingHealth;
    }

    public int getHackingHealth() {
        return hackingHealth;
    }

    public void setHackingHealth(int hackingHealth) {
        this.hackingHealth = hackingHealth;
    }

    @Override
    public void applySuperAbility(Hero[] heroes, Boss boss) {
        int gg = RPG_Game.ramdom.nextInt(heroes.length);
        if (heroes[gg].getHealth() > 0 && heroes[gg].getName() != this.getName()) {
            boss.setHealth(boss.getHealth()-this.hackingHealth);//Хакер отбирает у Босса(здоровье)
            heroes[gg].setHealth(heroes[gg].getHealth() + this.hackingHealth);//Хакер восполняет здоровье случайному герою
            System.out.println("+-+-+-Hacker choose: " + heroes[gg].getName() + "+-+-+-+-+-");
        }
    }
}