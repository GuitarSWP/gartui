import java.io.*;
import java.util.*;
public class Bag {
    private int count = 15;
    private Item item = new Item();
    public int usePotion(int index)
    {
        if(count!=0 && item.getpotion(index).equals("Potion"))
        {
            count--;
            return 20;
        }
        
        return 0;
    }

    public int showcount(){
        return count;
    }
    
}