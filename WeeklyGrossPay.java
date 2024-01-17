
/**
 * Write a description of class WeeklyGrossPay here.
 *
 * @author (Ally,BITA/6/22/061/TZ)
 * @version (a version number or a date)
 */
import java.util.*;
public class WeeklyGrossPay
{
    public static void main(String []args){
        Scanner input=new Scanner(System.in);
        
        System.out.println("Enter Employee's ID number: ");
        double IDnumber=input.nextInt();
        
        System.out.println("Enter hour rate of pay: ");
        double HourRateOfPay=input.nextInt();
        
        System.out.println("Enter hour worked for the week: ");
        double HourWorkedForTheWeek=input.nextInt();
        
        double overtimehour=Math.max(0,HourWorkedForTheWeek-40);
        
        double regularhour=Math.max(40,HourWorkedForTheWeek);

        
        double overtimepay=overtimehour*1.5*HourRateOfPay;
        
        double regularpay=regularhour*HourRateOfPay;
        
        double GrossPay=overtimepay + regularpay;
        
        double incometax =(GrossPay >500.00)?0.15*GrossPay:0;
        
        double parkingcharge=20.00;
        
        double deduction=incometax + parkingcharge;
        double NetPay=GrossPay-deduction;
        
        System.out.println("Employee ID Number: "+ IDnumber);
        System.out.println("HourRateOfPay: "+HourRateOfPay);
        System.out.println("Regular Hour: "+regularhour);
        System.out.println("Overtime Hour: "+overtimehour);
        System.out.println("Total Hour: "+HourWorkedForTheWeek);
        System.out.println("Overtime Pay: "+overtimepay);
        System.out.println("Gross pay: "+GrossPay);
        System.out.println("Deduction: "+deduction);
        System.out.println("Netpay: "+NetPay);
    }
}
