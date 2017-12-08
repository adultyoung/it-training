package game;

/**
 *  Дочерний класс Hero
 *  Переопределяет методы атаки врага и героя, присваивает герою имя и значение здоровья
 *  Возвращает boolean значение о том, жив ли герой
 *  @version 1.0 06 Dec 2017
 *  @author Vlad Marchenko
 */


public class Archer extends Hero {
    @Override
    public void attackEnemy () {
        Enemy one = new Enemy(BattleGround.health);
        one.takeDamage(15);
        System.out.println("Archer " + name + " attacks the enemy");
        System.out.println("Damage: 15");
        enalive = one.isAlive();
    }
    @Override
    public void attackHero () {
        takeDamage(10);
        System.out.println("The enemy attacks warrior" + name);
        System.out.println("Damage: 10");
        healive = isAlive();
    }

    Archer (String name, int health) {
        super.name  = name;
        super.health = health;
    }
    public void takeDamage (int damage) {
        health -= damage;
    }
}
