
/**
 * Write a description of class palindrome here.
 *
 * @author (Ally,BITA/6/22/061/TZ)
 * @version (a version number or a date)
 */import java.util.*;
public class palindrome
{
   public static void main(String []args){
       Scanner input=new Scanner(System.in);
       
       System.out.println("Enter number with five intergers: ");
       int number=input.nextInt();
       
       int ProcessOne=number%10;
       int ProcessTwo=number/10;
       
       int PalindromeNumber=ProcessOne*10+ProcessTwo;
       
       if(number==PalindromeNumber){
           System.out.println("the number: " + number + "is palindrome");
       }else{
           System.out.println("the number: " + number + "is not palindrome");
       }
   }
}
