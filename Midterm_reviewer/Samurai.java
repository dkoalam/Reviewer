//sadili_INF222
public class Samurai extends Human {

    // ● Samurai: Add a method howMany() that returns the total current number of
    // Samurai.
    private static int subcount = 0;

    public Samurai(String name, String job, int hp, int mp, int inte, int str, int agi) {
        super(name, job, hp, mp, inte, str, agi);
        subcount++;
    }

    public static int getCount() {
        return subcount;
    }

    public Samurai(String name, String job) {
        super(name, job);
    }

    // ● Samurai: Add a method deathBlow(Human) that kills the other human, but
    // reduces the Samurai's health by half
    public void deathBlow(Human target) {
        int dmg = target.getHp();
        this.setHp(this.getHp() / 2);
        System.out.println();
        System.out.println(this.getName() + " use deathBlow to " + target.getName());
        System.out.println(this.getJob() + " now have " + this.getHp() + " hp");
        takeDamage(dmg, target);
    }

    // ● Samurai: Add a method meditate() that heals the Samurai for half of their
    // current health.
    public void meditate() {
        int heal = this.getHp() / 2;
        this.setHp(this.getHp() + heal);
        System.out.println();
        System.out.println(this.getJob() + " use meditate,he have now " + this.getHp() + " hp");
    }

    // ● Samurai: Add a method howMany() that returns the total current number of
    // Samurai.
    public void howMany() {
        System.out.println("\nthe total current number of Samurai is " + Samurai.getCount());
    }

}
