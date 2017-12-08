package game;

/**
 * Класс Врага, присваивающий значение жизни врага, имеющий метод получения урона от героя
 * Переопределяет функцию интерфейса Mortal.
 *
 * @author Vlad Marchenko
 * @version 1.0 06 Dec 2017
 */

public class Enemy implements Mortal {
    int health;

    Enemy() {
    }

    Enemy(int health) {
        this.setHealth(health);
    }

    public void setHealth(int health) {
        if (health >= 0) {
            this.health = health;
        }
    }

    public void takeDamage(int damage) {
        health -= damage;
    }

    public boolean isAlive() {
        if (health > 0) {
            return true;
        }
        return false;
    }
}
