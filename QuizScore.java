
/**
 * Write a description of class QuizScore here.
 *
 * @author (Ally,BITA/6/22/061/TZ)
 * @version (a version number or a date)
 */
import java.util.*;
public class QuizScore
{
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        
        System.out.println("Enter quiz score(0-5): ");
        int QuizScore=input.nextInt();
        
        char grade;
        switch(QuizScore){
            case 5:
                grade='A';
                break;
            case 4:
                grade='B';
                break;
            case 3:
                grade='C';
            case 2:
                grade='D';
                break;
            case 1:
                grade='E';
                break;
            case 0:
                grade='F';
                break;
            default:
                System.out.println("please enter your quizscore correct it between 0 upto 5");
                return;
        }
        
        System.out.println("The grade for quizScore "+QuizScore + " is: "+grade);
    }
}
