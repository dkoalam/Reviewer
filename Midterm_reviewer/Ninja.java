//sadili_INF222
public class Ninja extends Human {

    public Ninja(String name, String job, int hp, int mp, int inte, int str, int agi) {
        super(name, job, hp, mp, inte, str, agi);
    }

    public Ninja(String name, String job) {
        super(name, job);
    }

    // ● Ninja: Add a method runAway() that decreases their health by 10
    public void runAway() {
        System.out.println();

        this.setHp(this.getHp() - 10);
        System.out.println(
                this.getJob() + " use run away that decreases his health by 10,he have now " + this.getHp() + " hp");
    }

    // ● Ninja: Add a method steal(Human) that takes the amount of stealth the ninja
    // has, removes it from the other human's health, and adds it to the ninja's
    public void Steal(Human target) {
        System.out.println();
        System.out.println(this.getJob() + " use steal to " + target.getJob());
        target.setHp(target.getHp() - this.getStr());
        this.setHp(this.getHp() + this.getStr());
        System.out.println(this.getJob() + " now have " + this.getHp() + " hp and " + target.getJob() + " now have "
                + target.getHp()+" hp");
    }
}
