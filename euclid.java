
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
        int val1, val2, placeholder, remainder, vp1, vp2;
        boolean bugFix = true;
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Enter a numerator and a denominator: ");
        val1 = keyboard.nextInt();
        val2 = keyboard.nextInt();
        vp1 = val1; //#kms
        vp2 = val2;
        //#System.out.println(val1 + " " + val2);
        if (val2 <= val1){ //#one alligator mark boi screwed me up
            placeholder = val1;
            val1 = val2;
            val2 = placeholder;
        }
        
        while (val1 > 0){
            placeholder = val1;
            val1 = val2;
            val2 = val2%placeholder;
        } 
        System.out.println(val1 + " / " + val2);
        /*#if (val2 == 1 || val1 == 1){
            System.out.println(val1 + " / " + val2);
            bugFix = false;
        }
        else{
            bugFix = true;
        }
        
        while (bugFix){//#val1 % val2 != 0){
            remainder = val1 % val2;
            while (val2 > remainder){
                val2 = val2 - remainder;
            }
            val1 = remainder;
        }
        if (bugFix){
            System.out.println((vp1/val1) + " / " + (vp2/val1));
        }
            //# hello?
        //# bro
        
        **/
    }    
}
