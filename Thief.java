import java.io.*;
import java.util.*;
public class Thief extends Novice
{
    public Thief(Novice previous)
    {
        super.set_all(1000, previous.getlevel(),previous.bag);
        super.set_job("Thief");
        
    }
    public void attack()
    {
        super.set_exp(5);
        super.set_hp(-100);
        if(super.getexp() == 20)
        {
            super.set_level(1);;
            super.set_exp(-20);
        }
    }
}