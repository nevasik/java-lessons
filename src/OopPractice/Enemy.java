package OopPractice;

public abstract class Enemy implements Mortal {
    private int health;
    private String name;

    public Enemy(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public void takeDamage(int damage){
        health = health - damage;
    }

    @Override
    public boolean isAlive() {
        return health > 0;
    }

    public abstract void attackHero(Hero hero);
}
