package game;

public class Enemy implements Mortal {
    int health;

    Enemy () {}
    Enemy (int health) {
        this.setHealth(health);
    }
    public void setHealth (int health) {
        if (health >= 0) {
            this.health = health;
        }
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
