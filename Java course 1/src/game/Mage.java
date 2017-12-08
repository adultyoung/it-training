package game;

public class Mage extends Hero implements Mortal {
    @Override
    public void attackEnemy () {
        Enemy one = new Enemy();
        one.takeDamage(10);
        System.out.println("Mage " + name + " attacks the enemy");
        System.out.println("Damage: 10");
        enalive = one.isAlive();
    }
    @Override
    public void attackHero () {
        takeDamage(10);
        System.out.println("The enemy attacks warrior" + name);
        System.out.println("Damage: 10");
        healive = isAlive();
    }
    Mage (String name, int health) {
        super.name = name;
        super.health = health;
    }
    public void takeDamage (int damage) {
        health -= damage;
    }

    public boolean isAlive () {
        if (health>0) {
            return true;
        }
        return false;
    }
}
