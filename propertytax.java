
/**
 * Write a description of class propertytax here.
 *
 * @author (Ally,BITA/6/22/061/TZ)
 * @version (a version number or a date)
 */
import java.util.*;
public class propertytax
{
 public static void main(String[]args){
     Scanner input=new Scanner(System.in);
     System.out.println("Enter your actual taxes value: ");
     double ActualValue=input.nextDouble();
     
     System.out.println("Enter your tax rate is 100 of assessed value: ");
     double TaxRate=input.nextDouble();
     
     double assessedValue= ActualValue*0.6;
     
     double taxperhundred= TaxRate*assessedValue/100;
     
     double annuallypropertytax= taxperhundred*(assessedValue/100);
     
     System.out.println("The annualproperty tax for the charged for property at $" + ActualValue + " is: $" +
     annuallypropertytax); 
 }
}
