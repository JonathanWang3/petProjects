
/**#
 * Finds gcd using euclid method
 *
 * @author (Jonathan)
 * @version (8/30)
 */

import java.util.Scanner;
public class euclid
{
    public static void main(String[] args){
        int val1, val2, placeholder, remainder;
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Enter 2 numbers: ");
        val1 = keyboard.nextInt();
        val2 = keyboard.nextInt();
        //System.out.println(val1 + " " + val2);
        if (val2 >= val1){
            placeholder = val1;
            val1 = val2;
            val2 = placeholder;
        }
        while (val1 % val2 != 0){
            remainder = val1 % val2;
            while (val2 > remainder){
                val2 = val2 - remainder;
            }
            val1 = remainder;
        }
        System.out.println(val1);
        //# hello?
        //# bro
    }    
}
