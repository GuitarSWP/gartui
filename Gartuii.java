import java.util.*;
public class Gartuii{

    public static void main(String[] args){
        

        Novice novice = new Novice();
        
        int hp;
        System.out.println("--------------------------------------------------");
        System.out.println("Your HP is " + novice.gethp());
        System.out.println("Your EXP is " + novice.getexp());
        System.out.println("Your Level is " + novice.getlevel());
        System.out.println("Your Job is " + novice.getjob());
        System.out.println("-----------When You Fight With Monster------------ ");
        Scanner s = new Scanner (System.in);
        while(novice.gethp() > 0){
            System.out.println("Choose A for attack / Choose H for heal -> Your Potion have  " + novice.bag.showcount());
            char data = s.next().charAt(0);
            if(data == 'A') 
            {
                novice.attack();
                
            }
            else if(data == 'H')
            {
                hp = novice.bag.usePotion(0); novice.addHP(hp);
            }
            if(novice.getlevel() == 5 && novice.getjob().equals("Novice"))
            {
                System.out.println("Choose your new job\n");
                System.out.println(" 'A' or 'a' for Acolyte");
                System.out.println(" 'T' or 't' for Thief");
                char job = s.next().charAt(0);
                if(job == 'T' || job == 't')
                {
                    novice = new Thief(novice);
                }
                else if(job == 'A' || job == 'a')
                {
                    novice = new Acolyte(novice);
                } 
            }
            
            System.out.println("--------------------------------------------------");
            System.out.println("Your HP is " + novice.gethp());
            System.out.println("Your EXP is " + novice.getexp());
            System.out.println("Your Level is " + novice.getlevel());
            System.out.println("Your Job is " + novice.getjob());
            System.out.println("--------------------------------------------------");
        }
        System.out.println("----------GAME OVER-----------");
    }   
}