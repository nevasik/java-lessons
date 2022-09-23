package OopPractice;

public class Archer extends Hero {

    public Archer(String name, int health) {
        super(name, health);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println(name + " атакует " + enemy.getName());
        enemy.takeDamage(50);

        if (enemy.getHealth() <= 0)
            System.out.println(enemy.getName() + " погиб...");

    }
}
