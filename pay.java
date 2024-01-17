
/**
 * Write a description of class pay here.
 *
 * @author (Ally,BITA/6/22/061/TZ)
 * @version (a version number or a date)
 */

public class pay
{
   public static void main(String []args){
       int annuallyearn =32500;
       int paypermonth=2;
       int payPerYear=24;
       int payPerYearBiWeekly=26;
       
       int GrossPayPerYear= annuallyearn/payPerYear;
       
       int GrossPayPerYearBiWeekly=annuallyearn/payPerYearBiWeekly;
       
       System.out.println("Gross pay per year " + GrossPayPerYear);
       System.out.println("Gross pay per bi weekly " + GrossPayPerYearBiWeekly);
       
   }
}
