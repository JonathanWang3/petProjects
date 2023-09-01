
/**
 * Write a description of class gcdV2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class gcdV2
{
    public static void main(String[] args){
        int val1, val2, ph;
        Scanner kb = new Scanner(System.in);
        
        System.out.println("2 numbers: ");
        
        val1 = kb.nextInt();
        val2 = kb.nextInt();
        System.out.println(val1 + val2);
        
        if (val2 > val1){
            ph = val1;
            val1 = val2;
            val2 = ph;
        } else if (val1 == val2){
            System.out.println("GCD is the same: " + val1);
            val2 = 0;
        }
        
        while (val2 >= 0) {
            ph = val1 % val2;
            val1 = val2;
            val2 = ph;
        }
    }
}
