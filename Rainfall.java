
/**
 * Write a description of class Rainfall here.
 *
 * @author (Ally,BITA/6/22/061/TZ)
 * @version (a version number or a date)
 */
import java.util.*;
public class Rainfall
{
    public static void main(String []args){
        Scanner input=new Scanner(System.in);
        
        System.out.println("Enter number of the month: ");
        int numberyear=input.nextInt();
        
        int totalmonth=numberyear*12;
        double totalrainfall=0;
        
        for(int year=1;year<=numberyear;year++){
            for(int month=1;month<=12;month++){
                System.out.println("enter the inches of rainfall for year "+year+",month"+month);
                double rainfall=input.nextInt();
                totalrainfall+=rainfall;
            }
        }
        
        double averagerainfall=totalrainfall/totalmonth;
        
        System.out.println("number of month: " +numberyear);
        System.out.println("total inches of rainfall: "+totalrainfall);
        System.out.println("average rainfall per month: "+averagerainfall+" inches");
    }
}
