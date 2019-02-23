/**
 * Novice
 */
import java.io.*;
public class Novice {
    private int hp;
    private int exp;
    private int level;
    private int maxHp;
    private String job;
    Bag bag ;
    public Novice(){
         hp = 500;
         exp = 0;
         level = 1;
         maxHp = 2000;
         job = "Novice";
         bag = new Bag();
        }
    public void attack()
    {
        exp = exp + 5;
        this.hp -= 20;
        if(exp >= 20)
        {
            level = level + 1;
            exp = 0;
        }
    }
    public void addHP(int hpup){
        if(hp + hpup < maxHp)
        {
            this.hp += hpup;
        }
        else if(hp + hpup >= maxHp){
            this.hp += (maxHp - hp);
        }
        gethp();
    }
    public int gethp()
    {
        return hp;
    }
    public int getexp()
    {
        return exp;
    }
    public int getlevel()
    {
        return level;
    }
    public String getjob()
    {
        return job;
    }
    public void set_hp(int set)
    {
        hp += set;
    }
    public void set_exp(int set)
    {
        exp += set;
    }
    public void set_level(int set)
    {
        level += set;
    }
    public void set_job(String set)
    {
        job = set;
    }
    public void set_all(int last_hp,int last_level,Bag last_bag)
    {
        hp = last_hp;
        level = last_level;
        bag = last_bag;
    }
}
