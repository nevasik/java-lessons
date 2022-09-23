package OopPractice;

public abstract class Hero {
    String name;
    int health;
    boolean perish; // возможность погибнуть

    public Hero(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public void takeDamage(int damage){
        health = health - damage;

        if (health < 0){
            health = 0;
        }
    }

    public String getName() {
        return name;
    }

    public abstract void attackEnemy(Enemy enemy);
}
