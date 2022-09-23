package OopPractice;

public class BlackHuman extends Enemy {

    public BlackHuman(String name, int health) {
        super(name, health);
    }

    @Override
    public void attackHero(Hero hero) {
        System.out.println(getName() + " атакует " + hero.name);
        hero.takeDamage(75);

        if (hero.health <= 0){
            System.out.println(hero.name + " погиб...");
        }
    }
}
