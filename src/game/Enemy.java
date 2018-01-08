package game;

/**
 * Класс Врага, присваивающий значение жизни врага, имеющий метод получения урона от героя
 * Переопределяет функцию интерфейса Mortal.
 *
 * @author Vlad Marchenko
 * @version 1.0 06 Dec 2017
 */

public abstract class Enemy implements Mortal {
    int health;

    public abstract void setHealth(int health);

    public abstract void takeDamage(int damage);

    @Override
    public boolean isAlive() {
        if (health > 0) {
            return true;
        }
        return false;
    }
}
