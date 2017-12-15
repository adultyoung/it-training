package game;

/**
 * Абстрактный класс, является родительским для Warrior, Mage и Archer, создает методы атаки героя и врага,
 * определяемые в дочерних классах
 *
 * @author Vlad Marchenko
 * @version 1.0 06 Dec 2017
 */

 abstract class Hero implements Mortal {
    int i=5;
    String name;
    int health;
    static boolean enalive = true;
    static boolean healive = true;
    @Override
    public boolean isAlive () {
        if (health > 0) {
            System.out.println(name + " health: " + health);
            return true;
        } else {
            health = 100;
            System.out.println(name + "resurrected with health: " + health);
            i--;
            System.out.println(name + " has " + i + " lives left");

        }
        return false;
    }

    public abstract void attackEnemy();

    public abstract void attackHero();
}
