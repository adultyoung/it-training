package game;

public class Archer extends Hero implements Mortal {
    @Override
    public void attackEnemy () {
        Enemy one = new Enemy();
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

    public boolean isAlive () {
        if (health>0) {
            return true;
        }
        return false;
    }
}
