
/**
 * Driver class for lotto
 *
 * @author Sacha
 * @version 16/3
 */
public class Lotto
{
    /**
     * Drivr class for lotto
     * 
     * @ param args
     * 
     */
    public static void main(String[] args)
    { 
        // instance vars
        int counter = 1;
        int match = 0;
        int LOTTOLENGTH = 6;
        Draw draw1 = new Draw();
        Draw draw2 = new Draw();
        // instance variables 
        final int DRAWLENGTH = 8;
        int[] ticket = new int[DRAWLENGTH]; // array for the ticket
        int[] lotto = new int[DRAWLENGTH]; // array for the lotto balls
        
        // creates the ticket by calling on the draw class to fill it with randints 
        ticket = draw1.draw();
        
        while (match != 6)
        {
            match = 0;
            // draws from our lotto balls 
            lotto = draw2.draw();
            for (int n = 0; n < LOTTOLENGTH; n++)
            {
                for (int i = 0; i < LOTTOLENGTH; i++) // runs the length of array to check balls
                {
                    if (ticket[i] == lotto[i])  // checks if ball is already in array
                    {
                           match += 1; 
                           System.out.println(match);
                           counter += 1;
                    }
                }
            }
        }
        System.out.println(match);
        System.out.println("The total number of draws: " + counter);
    }
}
