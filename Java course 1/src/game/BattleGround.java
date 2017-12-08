package game;

import java.util.Scanner;

public class BattleGround {
    public static int health = 100;
    public static void main(String[] args) {
        System.out.print("name: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        Hero hero = new Warrior(name, health);
        while (hero.enalive) {
            if (hero.healive) {
                hero.attackEnemy();
                hero.attackHero();
            } else {
                System.out.println("Warrior " + name + " was slain");
                return;
            }
        }
        System.out.println("Enemy was slain");

    }
}
