package game;

public class Warrior extends Hero implements Mortal {
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

    public boolean isAlive () {
        if (health>0) {
            return true;
        }
        return false;
    }
}
