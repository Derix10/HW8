package com.company.players;

public class Golem extends Hero{

    public Golem(int health, int damage, String heroname) {
        super(health, damage, heroname, SuperAbility.DURABILITY);
    }

    @Override
    public void applySuperAbility(Hero[] heroes, Boss boss) {

        for (int i = 0; i < heroes.length; i++) {
            if(heroes[i] instanceof Golem){
                boss.setDamage(boss.getDamage()/5);// Разделяем атакубосса на 1/5 часть
                setHealth(getHealth()-(boss.setDamage(50)-(boss.getDamage()/5))+(boss.getDamage()/5)); // - 40
            }
        }

    }
}
