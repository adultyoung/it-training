package game;

public class Woman extends Enemy {
    Woman() {
    }

    Woman(int health) {
        this.setHealth(health);
    }

    @Override
    public void setHealth(int health) {
        if (health >= 0) {
            this.health = health;
        }
    }

    @Override
    public void takeDamage(int damage) {
        health -= damage;
    }
}
