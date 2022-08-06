package com.company.General;

import com.company.players.*;

import java.util.BitSet;
import java.util.Random;

public class RPG_Game {
    public static int roundNumber;
    public static Random ramdom = new Random();

    public static void start(){
        Boss boss = new Boss(900,50);
        Warrior warrior =new Warrior(270,5,"Warrior01");
        Medic doc = new Medic(220,5,"Doc",15);
        Medic assistant = new Medic(250,10,"Assistant",5);
        Magic magic = new Magic(220,20,"Magic");
        Berserk berserk = new Berserk(300,20,"Berserk");
        Thor thor = new Thor(330,15,"Thor");
        Golem golem =new Golem(600,5,"Golem");
        Hacker hacker = new Hacker(200,10,"Hacker",20);
        Witcher witcher = new Witcher(280,20,"Witcher");
        TrickyBastard trickyBastard = new TrickyBastard(300,25,"TriskyBastard");

        Hero[] heroes = {warrior,doc,assistant,magic,berserk,thor,golem,hacker,witcher,trickyBastard};
        printStatistics(heroes,boss);

        while(!isGameFinished(heroes,boss)){
            round(heroes,boss);
        }

    }
    private static void round(Hero[] heroes,Boss boss){
        roundNumber++;
        bossHits(heroes,boss);
        heroHits(heroes,boss);
        System.out.println(" ");
        applySuperAbility(heroes,boss);
        System.out.println(" ");
        printStatistics(heroes,boss);
    }

    private static void printStatistics(Hero[] heroes, Boss boss) {
        System.out.println("--------- ROUND " + roundNumber+" ----------");
        System.out.println("Boss health: "+ boss.getHealth()+"[ " + boss.getDamage()+" ]");
        for (int i = 0; i < heroes.length; i++) {
            System.out.println(heroes[i].getName()+" ,Health: "+heroes[i].getHealth()+" ,Damage: ["+
                    heroes[i].getDamage()+"] ");

        }

    }
    private static void bossHits(Hero[] heroes, Boss boss){
        int newBossAttack =  boss.setDamage(boss.getDamage()/5);
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getHealth() > 0 && boss.getHealth() > 0) {
                heroes[i].setHealth(heroes[i].getHealth() - newBossAttack);
            }

        }


    }
    private static void heroHits(Hero[] heroes,Boss boss){
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getHealth() > 0 && boss.getHealth() > 0) {
                boss.setHealth(boss.getHealth() - heroes[i].getDamage());
            }

        }
    }
    private static void applySuperAbility(Hero[] heroes,Boss boss){

        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getHealth() > 0 && boss.getHealth() > 0){
                heroes[i].applySuperAbility(heroes , boss);
            }
        }
    }

    private static boolean isGameFinished(Hero[] heroes,Boss boss){
        if(boss.getHealth() <= 0){
            System.out.println("Heroes won!");
            return true;
        }
        boolean allHeroesDead = true;
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getHealth() > 0) {
                allHeroesDead = false;
                break;
            }
        }
        if(allHeroesDead){
            System.out.println("Boss won!");
        }
        return allHeroesDead;
    }


}

