
/**
 * Write a description of class WordGame here.
 *
 * @author (Ally,BITA/6/22/061/TZ)
 * @version (a version number or a date)
 */
import java.util.*;
public class WordGame
{
    public static void main(String []args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter your Name: ");
        
        String name = input.nextLine();
        
        System.out.println("Enter your age: ");
         int age = input.nextInt();
         
         System.out.println("Enter your city: ");
         String city =input.nextLine();
          
         System.out.println();
         
          System.out.println("Enter your college: ");
         String college=input.nextLine();
         
          System.out.println("Enter your profession: ");
         String profession =input.nextLine();
         
          System.out.println("Enter your type of animal: ");
         String animal =input.nextLine();
         
          System.out.println("Enter your pet name: ");
         String pet =input.nextLine();
         
          System.out.println("There once was a person named " + name + " who lived in "
          + city + ".At the age of " + age +"," + name + " went to college at " + college
          + name + " graduted and went to work as a " + profession + ".Then," + name + " adopted an "
          + animal + " named " + pet + ".They both lived happily eve after");
    }
}
