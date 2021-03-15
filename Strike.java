
/**
 * Driver class strike
 *
 * @author Sacha & LCH
 * @version 16/3/21
 */
public class Strike
{
    /**
     * This class will create a strike ticket (a series of 4 numbers) and then check it
     * against the lotto draw
     * 
     * @ param args
     * 
     */
    public static void main(String[] args)
    { 
        // instance vars
        int counter = 1;
        int match = 0;
        int STRIKELENGTH = 4;
        Draw draw1 = new Draw();
        Draw draw2 = new Draw();
        // instance variables 
        final int DRAWLENGTH = 8;
        int[] ticket = new int[DRAWLENGTH]; // array for the ticket
        int[] lotto = new int[DRAWLENGTH]; // array for the lotto balls
        
        // creates the ticket by calling on the draw class to fill it with randints 
        ticket = draw1.draw();
        
        while (match != 4)
        {
            match = 0;
            // draws from our lotto balls 
            lotto = draw2.draw();
            for (int i = 0; i < STRIKELENGTH; i++) // runs the length of array to check balls
            {
                if (ticket[i] == lotto[i])  // checks if ball is already in array
                {
                       match += 1; 
                       System.out.println(match);
                       counter += 1;
                }
            }
        }
        System.out.println(match);
        System.out.println("The total number of draws until a perfect strike was reached: " + counter);
    }
}
