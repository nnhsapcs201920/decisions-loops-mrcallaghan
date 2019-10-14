import java.util.Scanner;

/**
 * Chapter 5 Notes - decisions.
 *
 * @author mr callaghan
 * @version 14oct2019
 */
public class Notes
{
    public static void ifExample()
    {
        // model a coin flip; 1: heads, 0: tails
        int coinFlip = (int) ( Math.random() * 2 );
        
        /*
         * if statement
         *      statements are executed if the conditional expression is true
         *      conditional expression must go inside the parentheses
         *      statements are grouped by blocks (i.e. {} )
         *          not indented like in Python
         *      no colon after the conditional expression in Java, unlke Python
         */
        if (coinFlip == 1)
        {
            System.out.println("Coin is heads!");
        }
        
        /*
         * { } are not required if it's a single statement
         *      However, they are always a good idea.
         *      Leaving them out can lead to bugs like this:
         */
        
        if( coinFlip == 0 )
            System.out.println( "Coin is tails!" );   // in the if block
            System.out.println( "Better luck next time!" ); // not in the if block
            
        /*
         * if-else statement
         *     else block will execute if teh condition is false
         */
        if (coinFlip == 1)
        {
            System.out.println("Coin is heads!");
        }
        else
        {
            System.out.println("Coin is tails!");
        }
        
        // challenge: roll a 4 sided die and print the value that came up.
        // simulate rolling a four sided die (1-4)
        int dieRoll = (int) ( Math.random() * 4 ) + 1;
        
        /*
         * if-else if-else statement in Java
         *   In Java, "else if" is used instead of "elif" like Python
         */
        if( dieRoll == 1 )
        {
            System.out.println( "rolled a 1" );
        }
        else if( dieRoll == 2 )
        {
            System.out.println( "rolled a 2" );
        }
        else if( dieRoll == 3 )
        {
            System.out.println( "rolled a 3" );
        }
        else
        {
            System.out.println( "rolled a 4" );
        }
       
    }
    
    public static boolean doublesAreEqual( double num1, double num2 )
    {
        /*
             * If we are using the (==) equality operator for doubles, it will return true
             *      if the binary digits match.
             * For "equal" numbers this is probably not the case due to floating point rounding
             *      and, therefor, not what we want.
             * We will check if they are "close enough" (i.e., epsilon value)
             */
        final double EPSILON = 1e-14;  // 1 x 10 ^ -14
        
        if ( Math.abs( num1 - num2 ) < EPSILON )
        {
            return true;
        }
        else
        {
            return false;
        }
    
        // don't have to use an if statement when working with a boolean
        // return ( Math.abs( num1 - num2 ) < EPSILON );
    }
}
