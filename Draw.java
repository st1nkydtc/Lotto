import java.random;
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
    
    // array
    public int[] draw = new int[DRAWLENGTH]; 
    

    /**
     * Constructor for objects of class Draw
     */
    public Draw()
    {
        // initialise instance variables
        draw(); 
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int draw()
    {
        // put your code here
        for (int n: lotto)
        {
            int ball = (int) Math.random() * 40;
            int duplicate = 0;
            for (int i : lotto)
            {
                if (ball != lotto[i])
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
}
