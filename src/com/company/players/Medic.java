package com.company.players;

public class Medic extends Hero{
    private int healPoints;

    public Medic(int health, int damage, String heroname, int healPoints) {
        super(health, damage, heroname, SuperAbility.HEAL);
        this.healPoints = healPoints;
    }

    public int getHealPoints() {
        return healPoints;
    }

    public void setHealPoints(int healPoints) {
        this.healPoints = healPoints;
    }

    @Override
    public void applySuperAbility(Hero[] heroes, Boss boss) {
        for (int i = 0; i < heroes.length; i++) {

            if (heroes[i].getHealth() > 0 && heroes[i].getHealth() < 100 && heroes[i].getName() != this.getName()){
                heroes[i].setHealth(heroes[i].getHealth() + this.healPoints);

            }

        }

    }
}
