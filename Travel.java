
/**
 * Write a description of class Travel here.
 *
 * @author (Ally,BITA/6/22/061/TZ)
 * @version (a version number or a date)
 */
import java.util.*;
public class Travel
{
    public static void main(String []args){
        Scanner input=new Scanner(System.in);
        
        System.out.println("Enter the speed of vehicle: ");
        int speed=input.nextInt();
        
        
        System.out.println("Enter number of the hour travel: ");
        int hour=input.nextInt();
        
        System.out.println("Hour  Distance:");
        
        for(int i=1;i<=hour;i++){
            int distance=speed*i;
            System.out.println(i+"       "+distance);
        }
    }
}
