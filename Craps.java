
/**
 * Write a description of class Craps here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.Scanner;

public class Craps
{
    public String instructions()
    {
        return("Let's play craps! Here's how to play.");
        return("First, roll the two dice.");
        return("If you roll a 7 or 11 then you win.");
        return("If you roll a 2, 3, or 12 then you lose");
        return("If your first roll was not one of those numbers then take your first roll number and remember it.");
        return("That number will be the 'point'");
        return("Now you are going to keep rolling the two dice until you get a 7 or the 'point' number.");
        return("If you get a 7 then you lose, but if you get the 'point' number then you win.");
        return("That's how you play craps.");
    }
    
    public int Die()
    {
        int roll = (int) (Math.random() * 6) + 1;
        return roll;
    }
    
    public int rollDice()
    {
        System.out.println("Press [ENTER] to roll the dice");
        Scanner in = new Scanner(System.in);
        String waiting = in.nextLine();
        int roll1 = Die();
        int roll2 = Die();
        System.out.println("You rolled a " + roll1 + " and a " + roll2);
        int total = roll1 + roll2;
        System.out.println("Thats a " + total);
        return total;
    }
    
    public static void main(String[] args)
    {
        System.out.println("Welcome to craps!");
        Scanner in = new Scanner(System.in);
        System.out.println("Do you know how to play? (y/n)");
        String knowledge = in.nextLine();
        if (!knowledge.substring(0,1).equalsIgnoreCase("y"))
        {
            System.out.println(instructions());
        }
        
        
        
    }

    
}
