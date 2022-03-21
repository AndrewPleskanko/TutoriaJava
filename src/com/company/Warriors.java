package com.company;

import java.util.Scanner;

public class Warriors {
     static int id;
     String name;
     int hp;
     int attackForce;
     float miss;
     float armor;
     int sumSoldier;

    public Warriors( String name, int hp, int attackForce, float miss, float armor, int sumSoldier) {
        this.name = name;
        this.hp = hp;
        this.attackForce = attackForce;
        this.miss = miss;
        this.armor = armor;
        this.sumSoldier = sumSoldier;
    }
    public Warriors(int hp, int attackForce, float miss, float armor, int sumSoldier) {
        this.hp = hp;
        this.attackForce = attackForce;
        this.miss = miss;
        this.armor = armor;
        this.sumSoldier = sumSoldier;
    }
    void agresive(int attackForce, float miss ){
        attackForce *= 3;
        miss *= 1.5f;
    }
    void defaultAtac(int attackForce, float miss){
        attackForce *= 1;
        miss *= 1;
    }
    void passive(int attackForce, float miss){
        attackForce *= 2;
        miss = 0;
    }
    public static void main(String[] args) {
        Warriors warrior1 = new Warriors("bowman",100,20,3,1.4f,1);
        Warriors warrior2 = new Warriors("knight",115,15, 1.3f,1,1);
        Warriors warrior3 = new Warriors("magician",90,26, 1.5f,1,1);

        Warriors warriosHelp2 = new Warriors(1,1,1,1,1);
            System.out.println("write warrior for combat and tactic - player#1");
            System.out.println("1-knight; 2-bowman; 3-magician");
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
            System.out.println("1-agresive; 2-defaultAtac; 3-passive");
        String b = scanner.nextLine();


       switch(a.equals(warrior1.name) || a.equals(warrior2.name)  ){
           case 1: Warriors warriosHelp1 = new Warriors(warrior1.hp, warrior1.attackForce, warrior1.miss, warrior1.armor, 1);
break;

               case2:warriosHelp1 = new Warriors(1,1,1,1,1);
               case3:warriosHelp1 = new Warriors(1,1,1,1,1);
           default:
               System.out.println("incorrent warrior");
               break;
       }
        System.out.println("select methods for combat player#1");
        System.out.println("1-knight; 2-bowman; 3-magician");


}
    }

