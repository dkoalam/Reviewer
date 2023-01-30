//sadili_INF222
public class Wizard extends Human {

    public Wizard(String name, String job, int hp, int mp, int inte, int str, int agi) {
        super(name, job, hp, mp, inte, str, agi);
    }

    public Wizard(String name, String job) {
        super(name, job);
    }

    // ● Wizard: Add a method heal(Human) that heals the other human by the wizard's
    // intelligence
    public void healHuman(Human heal) {
        System.out.println();
        System.out.println(this.getJob() + " use heal to " + heal.getJob());
        heal.setHp(heal.getHp() + this.getInte());
        System.out.println(heal.getJob() + " has healed by " + this.getJob() + ", he have now " + heal.getHp() + "hp");

    }

    // ● Wizard: Add a method fireball(Human) that decreases the other human's
    // health by the wizard's intelligence * 3
    public void fireBall(Human target) {
        int dmg = this.getInte() * 3;
        System.out.println();
        System.out.println(this.getJob() + " use fire ball to " + target.getJob());
        takeDamage(dmg, target);
    }
}