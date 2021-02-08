 
/**
 * Write a description of class Instructions here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Instructions
{
    // instance variables - replace the example below with your own

    /**
     * Constructor for objects of class Instructions
     */
    public Instructions()
    {
        // initialise instance variables
        
    }

    public String giveInstructions()
    {
        String info = "Let's play craps! Here's how to play. ";
        info += "First, roll the two dice. ";
        info += "If you roll a 7 or 11 then you win. ";
        info += "If you roll a 2, 3, or 12 then you lose. ";
        info += "If your first roll was not one of those numbers then remember it. ";
        info += "That number will be the 'point'. ";
        info += "Keep rolling the two dice until you get a 7 or the 'point' number. ";
        info += "If you get a 7 then you lose.";
        info += "if you get the 'point' number then you win. ";
        info += "That's how you play craps.";
        return info;
    }
}
