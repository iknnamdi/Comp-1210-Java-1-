import java.util.Scanner;
import java.text.DecimalFormat;    
   /** 
 *A complex program to solve fo specified expressions 
 *
 * Project 03
 * @author Nnamdi Ikenna-Obi - Comp 1210 - section 001
 * @version September 10, 2021.
 */
 
public class UsingMathMethods
{
/**
* Prints result for answer to equation
* @param args Command line arguments - not used.
*/
          
   public static void main(String[] args)
   {
   
      Scanner userInput = new Scanner(System.in);
      DecimalFormat df = new DecimalFormat();
   
      double x;
      double result;
      String numbers;
      int numbersLeft;
      int numbersRight;
   
   /*Prompt the user to a value for x:
      */
      System.out.print("Enter a value for x: ");
      x = userInput.nextDouble();
      
      result = (8 * Math.pow(x , 4)) + (Math.sqrt(Math.abs((4 * Math.pow(x, 3)) + (4 * Math.pow(x, 2))
               + (4 * x) + 4)) / (4 + Math.abs(x)));
      System.out.println("Result: " + result);
      
      numbers = Double.toString(result);
      int index = numbers.indexOf('.');
      String numberL = numbers.substring(0, index);
      String numberR = numbers.substring(index + 1, numbers.length());
      numbersLeft = numberL.length();
      numbersRight = numberR.length();
      
      DecimalFormat fmt1 = new DecimalFormat("##,##0.0####");
      
      System.out.println("# of characters to left of decimal point: "
                         + numbersLeft);
                         
      System.out.println("# of characters to right of decimal point: "
                         + numbersRight);
                                            
      System.out.println("Formatted Result: " + fmt1.format(result));
   
     
   
   
   
   }
   
}
   
