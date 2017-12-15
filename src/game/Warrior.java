package game;

import java.util.Random;

/**
 *  Дочерний класс Hero
 *  Переопределяет методы атаки врага и героя, присваивает герою имя и значение здоровья
 *  Возвращает boolean значение о том, жив ли герой
 *  @version 1.0 06 Dec 2017
 *  @author Vlad Marchenko
 */


public class Warrior extends Hero {
    private static Random rand = new Random();
    Enemy one = new Witch(100);
    @Override
    public void attackEnemy () {
        System.out.println("Warrior " + name + " attacks the enemy");
        System.out.println("Damage: 25");
        one.takeDamage(25);
        enalive = one.isAlive();
    }
    @Override
    public void attackHero () {
        takeDamage(50);

    }

    Warrior (String name, int health) {
        super.name = name;
        super.health = health;
    }

    public void takeDamage (int damage) {
        health -= damage;
        System.out.println("The enemy attacks warrior " + name);
        System.out.println("Damage: 50");
        if (rand.nextInt(100) < 50) {
            health -= damage;
            System.out.println("The enemy attacks warrior again");
            System.out.println("Damage: 50");
        }
        healive = isAlive();

    }
}
