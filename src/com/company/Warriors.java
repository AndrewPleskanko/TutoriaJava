package com.company;

import java.util.Scanner;

public class Warriors {
    int id;
    String name;
    int hp;
    int attackForce;
    float miss;
    float armor;
    int sumSoldier;

    public Warriors(int id, String name, int hp, int attackForce, float miss, float armor, int sumSoldier) {
        this.id = id;
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

    public static void main(String[] args) {

        Warriors warrior1 = new Warriors(1, "bowman", 100, 20, 3f, 1.4f, 1);
        Warriors warrior2 = new Warriors(2, "knight", 115, 15, 1.2f, 1, 1);
        Warriors warrior3 = new Warriors(3, "magician", 90, 17, 1f, 1, 1);

        System.out.println("write warrior for combat and tactic - player#1");
        System.out.println("1-knight; 2-bowman; 3-magician");
        Scanner scanner = new Scanner(System.in);
        int hero = scanner.nextInt();
        System.out.println("1-agresive; 2-defaultAtac; 3-passive");
        int attackMode = scanner.nextInt();
        switch (hero) {
            case 1:
                switch (attackMode) {
                    case 1:
                        agresive(warrior1.attackForce, warrior1.miss);
                        break;
                    case 2:
                        defaultAtac(warrior1.attackForce, warrior1.miss);
                        break;
                    case 3:
                        passive(warrior1.attackForce, warrior1.miss);
                        break;
                    default:
                        System.out.println("incorect value(tactic)");
                }
            case 2:
                switch (attackMode) {
                    case 1 -> agresive(warrior2.attackForce, warrior2.miss);
                    case 2 -> defaultAtac(warrior2.attackForce, warrior2.miss);
                    case 3 -> passive(warrior2.attackForce, warrior2.miss);
                    default -> System.out.println("incorect value(tactic)");
                }
            case 3:
                switch (attackMode) {
                    case 1:
                        agresive(warrior3.attackForce, warrior3.miss);
                        break;
                    case 2:
                        defaultAtac(warrior3.attackForce, warrior3.miss);
                        break;
                    case 3:
                        passive(warrior3.attackForce, warrior3.miss);
                        break;
                    default:
                        System.out.println("incorect value(tactic)");
                }
            default:
                System.out.println("incorect value(warrior)");

        }
    }

    static void agresive(int attackForce, float miss) {
        Warriors warriosHelp1 = new Warriors(1, 1, 1.1f, 1, 1);
        attackForce *= 3;
        miss *= 1.5f;

    }

    static void defaultAtac(int attackForce, float miss) {
        attackForce *= 1;
        miss *= 1;
    }

    static void passive(int attackForce, float miss) {
        attackForce *= 2;
        miss = 0;
    }


}


