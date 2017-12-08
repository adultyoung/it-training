package game;

/**
 * Абстрактный класс, является родительским для Warrior, Mage и Archer, создает методы атаки героя и врага,
 * определяемые в дочерних классах
 *
 * @author Vlad Marchenko
 * @version 1.0 06 Dec 2017
 */

 abstract class Hero {
    String name;
    int health;
    boolean enalive = true;
    boolean healive = true;

     boolean isAlive () {
        if (health > 0) {
            return true;
        }
        return false;
    }

    public abstract void attackEnemy();

    public abstract void attackHero();
}
