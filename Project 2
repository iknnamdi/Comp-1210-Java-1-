import java.util.Scanner;
 /** 
 * A program that accepts a raw time measurement in seconds (of type int) 
 * and then then displays the time as a combination of days, hours, 
 * minutes, and seconds.   
 * Project 02
 * @author Nnamdi Ikenna-Obi - Comp 1210 - section 001
 * @version September 3, 2021.
 */
public class TimeInSeconds {
/**
    * Program converts seconds into hours,
    * minutes, seconds and days.
    * 
    * @param args Command line arguments (not used).
    */

   public static void main(String[] args)
   {
      Scanner userInput = new Scanner(System.in);
      int secondsInputed;
      int days;
      int hours;
      int minutes;
      int seconds;
      
      /*Prompt the user to enter the time in seconds:
      */
      System.out.print("Enter the raw time in seconds: ");
      secondsInputed = userInput.nextInt();
      
      //Prompt the user for the days, seconds, minutes, hours:
      days = (secondsInputed) / 86400;
      hours = (secondsInputed % 86400) / 3600;
      minutes = (secondsInputed % 86400 % 3600) / 60;
      seconds = (secondsInputed % 60);
      
    
      if (secondsInputed < 0) {
         System.out.println("*** Time must be non-negative. ***");
      }
      
      else {
         System.out.println("\nTime by combined"
                        + " days, hours, minutes, seconds: ");
                        
        //Prompt the user to do the calculation:
         System.out.println("\tdays: " + days);
         System.out.println("\thours: " + hours);
         System.out.println("\tminutes: " + minutes); 
         System.out.println("\tseconds: " + seconds); 
         System.out.println("");  
      
         System.out.println(secondsInputed + " seconds = " + days + " "
              + "days, " + hours + " hours, " + minutes + " minutes, "
              + seconds + " seconds");
      }
     
                
   
   
   
   
   }
   
     
}   
//
//
//
import java.util.Scanner;
 /** 
 * A program that inputs values of type double for x and y and
 * solves for the result of the indicated expression when xy is 
 * not equal to zero.
 *
 * Project 02
 * @author Nnamdi Ikenna-Obi - Comp 1210 - section 001
 * @version September 3, 2021.
 */
 
public class TwoVariableExpression {

/**
    * Program uses values of type double to solve for xy.
    * 
    * @param args Command line arguments (not used).
    */


   public static void main(String[] args) {
      Scanner userInput = new Scanner(System.in);
      double x;
      double y;
      double result = 0;
   
   // Prints equation:
      System.out.println("result = (4.5x + 12.5) (3y - 9.0) / xy");
   
   // Prompt for x:
      System.out.print("\tx = ");
      x = userInput.nextDouble();
   
   // Prompt for y:
      System.out.print("\ty = ");
      y = userInput.nextDouble();
   
   //Declares if x * y is undefined and if not then solve equation:
      if (x * y == 0) { 
         System.out.println("result is \"undefined\" "); 
      }
      
      else {
         result = (4.5 * x + 12.5) * (3 * y - 9.0) / (x * y);
         System.out.println("result = " + result);
      }
   }
}
 
 
 

