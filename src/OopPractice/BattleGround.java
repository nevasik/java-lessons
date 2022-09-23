package OopPractice;

public class BattleGround {
    public static void main(String[] args) {
        // герои
        Warrior warrior = new Warrior("Hiland", 200);
        Mage mage = new Mage("Mag", 160);
        Archer archer = new Archer("Ralph", 500);

        // враги
        Shreder shreder = new Shreder("Shreder", 200);
        Hag hag = new Hag("Hag", 200);
        BlackHuman blackHuman = new BlackHuman("BlackHuman", 175);

        warrior.attackEnemy(shreder);
        System.out.println(warrior.name + " применил способность, нанося двойной урон");
        System.out.println("Здоровья: " + shreder.getHealth());

        System.out.println();

        shreder.attackHero(warrior);
        System.out.println("Здоровья: " + warrior.health);

        System.out.println();

        archer.attackEnemy(hag);
        hag.recoveryHealth(hag);
        System.out.println(hag.getName() + " применила исцеляющее лекарство, восстанавливая здоровье вдвое");
        System.out.println("Здоровья: " + hag.getHealth());

        System.out.println();

        blackHuman.attackHero(archer);
        System.out.println("Здоровья: " + archer.health);

        System.out.println();

        hag.attackHero(warrior);
        System.out.println("Здоровья: " + warrior.health);

        System.out.println();

        shreder.attackHero(warrior);
        System.out.println("Здоровья: " + warrior.health);
    }
}
