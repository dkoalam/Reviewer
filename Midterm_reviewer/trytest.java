//sadili_INF222
public class trytest {

    public static void main(String[] args) {
        // ● Wizard: Set default health to 50

        // ● Wizard: Set default intelligence to 8
        Wizard c1 = new Wizard("wizard", "wizard", 50, 0, 8, 0, 0);
        // ● Ninja: Set default stealth to 10
        Ninja c2 = new Ninja("ninja", "ninja", 0, 0, 0, 10, 0);
        // ● Samurai: Set a default health of 200
        Samurai c3 = new Samurai("samurai", "samurai", 200, 0, 0, 0, 0);
        // ● Wizard: Add a method fireball(Human) that decreases the other human's
        // health by the wizard's intelligence * 3
        c1.fireBall(c3);

        // ● Wizard: Add a method heal(Human) that heals the other human by the wizard's
        // intelligence
         c1.healHuman(c2);

        // ● Ninja: Add a method steal(Human) that takes the amount of stealth the ninja
        // has, removes it from the other human's health, and adds it to the ninja's
        c2.Steal(c3);

        // ● Ninja: Add a method runAway() that decreases their health by 10
        c2.runAway();

        // ● Samurai: Add a method deathBlow(Human) that kills the other human, but
        // reduces the Samurai's health by half
        c3.deathBlow(c1);

        // ● Samurai: Add a method meditate() that heals the Samurai for half of their
        // current health.
        c3.meditate();

        // ● Samurai: Add a method howMany() that returns the total current number of
        // Samurai.
         c3.howMany();
        

    }
}
