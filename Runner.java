
/**
 * Write a description of class Runner here.
 *
 * @author (Ally,BITA/6/22/061/TZ)
 * @version (a version number or a date)
 */
import java.util.*;
public class Runner
{
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        
        System.out.println("Enter names of the runner");
        System.out.println();
        String[]runners=new String[3];
        int[]times=new int[3];
        
        for(int i=0;i<3;i++){
            System.out.println("Enter name of runner" +(i+1)+";");
            runners[i]=input.nextLine();
            
            System.out.println("Enter finish time for "+ runners[i]+";");
            times[i]=input.nextInt();
            input.nextLine();
        }
        
        System.out.println("\nOrder of runner");
    
        for(int i=0;i<3;i++){
            System.out.println((i+1)+ "."+runners[i]+"-"+times[i] +" minutes");
        }
        
    }
}
