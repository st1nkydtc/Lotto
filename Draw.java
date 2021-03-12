import java.util.Random;
/**
 * Draws 8 unique numbers (lotto balls) and sticks them into an array
 * Numbers between 1 and 40
 *  
 * @author AT + LCH
 * @version 11/3/21
 */
public class Draw
{
    // instance variables 
    private final int DRAWLENGTH = 8;
    private final int MAXDRAW = 40;
    private final int MINDRAW = 1;
    private int ball;
    private int duplicate = 1;
    
    // array
    public int[] lotto = new int[DRAWLENGTH]; 
    

    /**
     * Constructor for objects of class Draw
     */
    public Draw()
    {
        // initialise instance variables
        draw(); 
    }

    /**
     * Draws the random numbers for each of the 8 balls
     * checks if ball is already in array and if not adds ball to it
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int[] draw()
    {
        // put your code here
        for(int n = 0; n < DRAWLENGTH; n++) // beginning of for loop for the length of the draw
        {
            duplicate = 1;
            while (duplicate == 1)
            {
                ball = (int)(Math.random() * MAXDRAW) +1; // sets the balls number to somewhere between 0 and 40
                duplicate = 0;
                for (int i = 0; i < DRAWLENGTH; i++) // runs the length of array to check balls
                {
                    if (ball == lotto[i])  // checks if ball is already in array
                    {
                     duplicate = 1;        
                    }
 
                }
                if (duplicate == 0); 
                {
                 lotto[n] = ball;
                }  
            }
        }
        return(lotto);
    }
}
