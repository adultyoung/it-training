package game;

import java.util.Random;

/**
 * Класс Врага, присваивающий значение жизни врага, имеющий метод получения урона от героя
 * Переопределяет функцию интерфейса Mortal.
 *
 * @author Vlad Marchenko
 * @version 1.0 06 Dec 2017
 */

public abstract class Enemy implements Mortal {
    private static Random rand = new Random();
    int health;

    public abstract void setHealth(int health);

    public abstract void takeDamage(int damage);

    @Override
    public boolean isAlive() {
        System.out.println("Enemy health: " + health);
        if (health > 0) {
            return true;
        } else if (rand.nextInt(100) < 50) {
            health = 50;
            System.out.println("Enemy resurrected with health: " + health);
        }
        return false;
    }
}
