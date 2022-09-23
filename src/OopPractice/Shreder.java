package OopPractice;

public class Shreder extends Enemy {

    public Shreder(String name, int health) {
        super(name, health);
    }

    @Override
    public void attackHero(Hero hero) {
        System.out.println(getName() + " атакует " + hero.name);
        hero.takeDamage(80);

        if (hero.health <= 0){
            System.out.println(hero.name + " погиб...");
        }
    }
}
