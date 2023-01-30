//sadili_INF222
public class Human {
    private String name,job;
    private int hp,mp,inte,str,agi;

private static int count=0;
public Human(){
    count++;
}
public static int getCount(){
    return count;
}

    public Human(String name, String job, int hp, int mp, int inte, int str, int agi) {
        this.name = name;
        this.job = job;
        this.hp = hp;
        this.mp = mp;
        this.inte = inte;
        this.str = str;
        this.agi = agi;
    }
    public Human(String name, String job) {
        this.name = name;
        this.job = job;
    }
    
    public Human(int count) {
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getJob() {
        return job;
    }
    public void setJob(String job) {
        this.job = job;
    }
    public int getHp() {
        return hp;
    }
    public void setHp(int hp) {
        this.hp = hp;
    }
    public int getMp() {
        return mp;
    }
    public void setMp(int mp) {
        this.mp = mp;
    }
    public int getInte() {
        return inte;
    }
    public void setInte(int inte) {
        this.inte = inte;
    }
    public int getStr() {
        return str;
    }
    public void setStr(int str) {
        this.str = str;
    }
    public int getAgi() {
        return agi;
    }
    public void setAgi(int agi) {
        this.agi = agi;
    }
    public void charac(){

    }

    public void takeDamage(int dmg ,  Human target){
        
        
        target.setHp(target.getHp()-dmg);
    

        if(target.getHp()<=0){
            target.setHp(0);
            System.out.println(target.getJob()+" is now dead");
        
            
        }
                System.out.println(target.getJob()+" now have "+target.getHp()+" hp.");
        
    }

    
}
    

