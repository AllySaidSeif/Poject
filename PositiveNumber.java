
/**
 * Write a description of class PositiveNumber here.
 *
 * @author (Ally,BITA/6/22/061/TZ)
 * @version (a version number or a date)
 */
import java.util.*;
public class PositiveNumber
{
    public static void main(String []args){
        Scanner input=new Scanner(System.in);
        int sum =0;
        int number;
        System.out.println("Enter negative number to end");
        
        do{
            System.out.println("Enter number: ");
            number=input.nextInt();
            
            if(number>=0){
                sum+=number;
            }
        }while(number>=0);
        System.out.println("the sum of the positive number is: " +sum);
        
    }
}
