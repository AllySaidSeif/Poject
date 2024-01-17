
/**
 * Write a description of class Reversenumber here.
 *
 * @author (Ally,BITA/6/22/061/TZ)
 * @version (a version number or a date)
 */
import java.util.*;
public class Reversenumber
{
    public static void main(String []args){
        Scanner input=new Scanner(System.in);
        
        System.out.println("enter any 2 digit except zero: ");
        int x=input.nextInt();
        
        int onedigit=x%10;
        int seconddigit=x/10;
        
        int y=onedigit*10+seconddigit;
        
        int sum=x + y;
        
        System.out.println("x:  " +x);
        System.out.println("y:  " +y);
        System.out.println("Sum:  " +sum);
    }
}
