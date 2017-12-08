package game;

/**
 *  Дочерний класс Hero
 *  Переопределяет методы атаки врага и героя, присваивает герою имя и значение здоровья
 *  Возвращает boolean значение о том, жив ли герой
 *  @version 1.0 06 Dec 2017
 *  @author Vlad Marchenko
 */

public class Warrior extends Hero {
    Enemy one = new Enemy(BattleGround.health);
    @Override
    public void attackEnemy () {
        one.takeDamage(25);
        System.out.println("Warrior " + name + " attacks the enemy");
        System.out.println("Damage: 25");
        enalive = one.isAlive();
    }
    @Override
    public void attackHero () {
        takeDamage(10);
        System.out.println("The enemy attacks warrior" + name);
        System.out.println("Damage: 10");
        healive = isAlive();
    }

    Warrior (String name, int health) {
        super.name = name;
        super.health = health;
    }

    public void takeDamage (int damage) {
        health -= damage;
    }

}
