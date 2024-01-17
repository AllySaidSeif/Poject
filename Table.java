
/**
 * Write a description of class Table here.
 *
 * @author (Ally,BITA/6/22/061/TZ)
 * @version (a version number or a date)
 */

public class Table
{
    public static void main(String[]args){
        System.out.println("N\t10*N\t100*N\t1000*N");
        
        int n=1;
        while(n<=5){
            int ten=10*n;
            int hundred=100*n;
            int thousand=1000*n;
            
            System.out.println(n+"\t"+ten+"\t"+hundred+"\t"+thousand);
            n++;
        }
    }
}
