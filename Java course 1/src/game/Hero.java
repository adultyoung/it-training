package game;

public abstract class Hero {
    String name;
    int health;
    boolean enalive = true;
    boolean healive = true;

    public abstract void attackEnemy ();
    public abstract void attackHero ();
}
