package com.company.players;

public class Witcher extends Hero{
    public Witcher(int health, int damage, String heroname) {
        super(health, damage, heroname, SuperAbility.GIVE_LIFE);
    }

    @Override
    public void applySuperAbility(Hero[] heroes, Boss boss) {
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getHealth() <= 0){
                heroes[i].setHealth(heroes[i].getHealth()+getHealth());//Он отдает жизнь
                setHealth(0);
                System.out.println("Witcher : "+heroes[i].getName());
            }
        }
    }
}
