package OopPractice;

public class Warrior extends Hero {

    public Warrior(String name, int health) {
        super(name, health);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println(name + " атакует " + enemy.getName());
        doubleAttack(enemy);

        if (enemy.getHealth() <= 0)
            System.out.println(enemy.getName() + " погиб...");

    }

    public void doubleAttack(Enemy enemy){
        enemy.takeDamage(30);
        enemy.takeDamage(30);
    }
}
