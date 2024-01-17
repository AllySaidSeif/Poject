
/**
 * Write a description of class UsCitizen here.
 *
 * @author (Ally,BITA/6/22/061/TZ)
 * @version (a version number or a date)
 */
import java.util.*;
public class UsCitizen
{
   public static void main(String []args){
       Scanner input= new Scanner(System.in);
        System.out.println("Enter your age:");
        int age=input.nextInt();
        
        System.out.println("Enter number of year live as Us citizen: ");
        int Uscitizen=input.nextInt();
        
        
        boolean senateEligibility = age>=30 && Uscitizen>=9;
        boolean houseEligibility = age>=25 && Uscitizen>=7;
        
        System.out.println("SenateEligibility: " + (senateEligibility? "yes":"no"));
        
    System.out.println("HouseEligibility: " + (houseEligibility? "yes":"no"));
        
   }
}
