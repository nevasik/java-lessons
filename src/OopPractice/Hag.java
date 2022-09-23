package OopPractice;

public class Hag extends Enemy { // ведьма

    public Hag(String name, int health) {
        super(name, health);
    }

    @Override
    public void attackHero(Hero hero) {
        System.out.println(getName() + " атакует " + hero.name);
        hero.takeDamage(50);

        if (hero.health <= 0){
            System.out.println(hero.name + " погиб...");
        }
    }

    public void recoveryHealth(Hag hag){
        hag.setHealth(hag.getHealth() + hag.getHealth());
    }
}
