
/**
 * Write a description of class Craps here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.Scanner;

public class Craps
{


    public static void main(String[] args)
    {
        Instructions info = new Instructions();
        Die dice = new Die();
        System.out.println("Welcome to craps!");
        Scanner in = new Scanner(System.in);
        System.out.print("Do you know how to play? (y/n) ");
        String knowledge = in.nextLine();
        if (!knowledge.substring(0,1).equalsIgnoreCase("y"))
        {
            System.out.println(info.giveInstructions());
        }
        Scanner in2 = new Scanner(System.in);
        System.out.print("Would you like to play craps? (y/n) ");
        String playing = in2.nextLine();
        while (playing.substring(0,1).equalsIgnoreCase("y"))
        {
            System.out.println("You've started a new game of craps");
            System.out.println("Press [ENTER] to roll the dice");
            Scanner in3 = new Scanner(System.in);
            String waiting = in3.nextLine();
            int result = dice.rollDice();
            if (result == 7 || result == 11)
            {
                System.out.println("You rolled a " + result);
                System.out.println("Congradulations! You win!");
            }
            else if (result == 2 || result == 3 || result == 12)
            {
                System.out.println("You rolled a " + result);
                System.out.println("Unlucky. You lose.");
            }
            else
            {
                int count = 0;
                int point = result;
                while ((result != 7 && point != result) || count == 0)
                {
                    count ++;
                    System.out.println("You rolled a " + result);
                    System.out.println("Your point is " + point);
                    System.out.println("Press [ENTER] to keep rolling");
                    Scanner in4 = new Scanner(System.in);
                    String pause = in4.nextLine();
                    result = dice.rollDice();
                    if (result == point)
                    {
                        System.out.println("You rolled a " + result);
                        System.out.println("Congradulations! You win!");
                    }
                    else if (result == 7)
                    {
                        System.out.println("You rolled a 7");
                        System.out.println("Unlucky. You lose.");
                    }
                }

            }
            System.out.print("Would you like to play again? (y/n)");
            Scanner in5 = new Scanner(System.in);
            playing = in5.nextLine();
            System.out.println("");
        }

    }
}
