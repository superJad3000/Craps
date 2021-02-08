
/**
 * Write a description of class Die here.
 *
 * @author Jack Adkins
 * @version 02-02-2021
 */
public class Die
{
    // instance variables - replace the example below with your own

    /**
     * Constructor for objects of class Die
     */
    public Die()
    {
        // initialise instance variables
        
    }
    
    public int rollDice()
    {
        int roll1 = (int) (Math.random() * 6) + 1;
        int roll2 = (int) (Math.random() * 6) + 1;
        int total = roll1 + roll2;
        return total;
    }

    
}
