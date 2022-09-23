package OopPractice;

public class Mage extends Hero {

    public Mage(String name, int health) {
        super(name, health);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println(name + " атакует " + enemy.getName());
        enemy.takeDamage(45);

        if (enemy.getHealth() <= 0)
            System.out.println(enemy.getName() + " погиб...");

    }
}
