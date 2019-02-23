import java.io.*;
import java.util.*;
public class Acolyte extends Novice
{
    public Acolyte(Novice previous)
    {
        super.set_job("Acolyte");
        super.set_all(previous.gethp(), previous.getlevel(),previous.bag);
    }
    public void attack()
    {
        super.set_exp(5);
        super.set_hp(-50);
        if(super.getexp() == 20)
        {
            super.set_level(1);;
            super.set_exp(-20);
        }
        skillHeal();
    }
    private void skillHeal()
    {
        System.out.println("Heal!!!!!! +20Hp");
        super.set_hp(20);
    }

}