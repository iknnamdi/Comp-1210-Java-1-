import java.text.DecimalFormat;    
   /** 
 * A complex program that defines object for 3-D geometric shape objects
 * with ten square side faces and two regular decagon caps where edge
 * and height are non-negative. 
 *
 * Project 04.
 * @author Nnamdi Ikenna-Obi - Comp 1210 - section 001.
 * @version September 17, 2021.
 */
// DecagonalPrism.java

public class DecagonalPrism {
  
   // data members
   private String label;
   private double edge;
   private double height;
  
   /**
   *3-arg constructor to initialize the fields to specified values.
   *@param labelIn for label
   *@param edgeIn for edge
   *@param heightIn for height
   */
   public DecagonalPrism(String labelIn, double edgeIn, double heightIn) {
       // all the setters to set the values
      setLabel(labelIn);
      setEdge(edgeIn);
      setHeight(heightIn);
   }
  
   /**
   *@return label
   */
   public String getLabel() {
      return label;
   }
  
   /**
   *sets the label. 
   *@return boolean
   *@param labelIn for label
   */
   public boolean setLabel(String labelIn) {
      if (labelIn != null) // label is not null
      {
         label = labelIn.trim(); // trim the label and set it
         return true; // successful
      }
      
      return false; // failed
   }
  
   /**
   *@return edge.
   */
   public double getEdge() {
      return edge;
   }
  
   /**
   *sets the edge. 
   *@return boolean
   *@param edgeIn for edge
   */
   public boolean setEdge(double edgeIn) {
      if (edgeIn >= 0) // edge is non-negative
      {
         edge = edgeIn;
         edge = edgeIn;
         return true; // successful
      }
      
      return false; // failed
   }

   /**
   *@return height
   */
   public double getHeight() {
      return height;
   }
  
   /**
   *sets height.
   *@return boolean
   *@param heightIn for height
   */
   public boolean setHeight(double heightIn) {
      if (heightIn >= 0) // height is non-negative
      {
         height = heightIn;
         return true; // successful
      }
      
      return false; // failed
   }
  
  /**
   *@return surface area
   */
   public double surfaceArea() {
      return (10 * edge * height + 5 * Math.pow(edge, 2) 
         * Math.sqrt(5 + 2 * Math.sqrt(5)));
   }
  
   /**
   *@return base area
   */

   public double baseArea() {
      return (5.0 / 2.0 * Math.pow(edge, 2) * Math.sqrt(5 + 2 * Math.sqrt(5)));
   }
  
   /**
   *@return lateral surface area
   */
   public double lateralSurfaceArea() {
      return 10 * edge * height;
   }
  
   /** 
   *@return volume
   */
   public double volume() {
      return (((5.0 / 2.0) * Math.pow(edge, 2))  
         * (Math.sqrt(5 + 2 * Math.sqrt(5)) * height));
   }
  
   /**
   *@return String representation of DecagonalPrism.
   */
   public String toString() {
   
      DecimalFormat df = new DecimalFormat("#,##0.0##");
   
      String output = "A decagonal prism " + label + " with edge = "
         + df.format(edge) + " units and height = " 
         + df.format(height) + " units, has:";
      output += "\n surface area = " + df.format(surfaceArea()) 
         + " square units "; 
      output += "\n base area = " + df.format(baseArea()) + " square units";
      output += "\n lateral surface area = " 
         + df.format(lateralSurfaceArea()) + " square units";
      output += "\n volume = " + df.format(volume()) + " cubic units";       
      
      return output;
   }
  
}
//
//
//
//
//
import java.util.Scanner;    
   /** 
 *A complex program that prompts the user to enter the label, edge, and height.
 *
 * Project 04
 * @author Nnamdi Ikenna-Obi - Comp 1213 - section 001
 * @version September 17, 2021.
 */
 
public class DecagonalPrismApp {
  /**
  *Prompts user to enter label, edge and height of decagonal prism.
  @param args command line argument
  */
   public static void main(String[] args) {
   
      Scanner sc = new Scanner(System.in);
      String label;
      double edge;
      double height;
      
       // input label
      System.out.println("Enter label, edge, and height for a" 
         + " decagonal prism.");
      System.out.print(" label: ");
      label = sc.nextLine();
       // input edge
      System.out.print(" edge: ");
      edge = Double.parseDouble(sc.nextLine());
       // validate edge is non-negative, else display error and exit
      if (edge < 0) {
         System.out.println("Error: edge must be non-negative.");
      }
      else
      {
           // input height
         System.out.print(" height: ");
         height = Double.parseDouble(sc.nextLine());
           // validate height is non-negative, else display error and exit
         if (height < 0) {
         
            System.out.println("Error: height must be non-negative.");
         }
         else
         {
               /** all valid, create an object of DecagonalPrism and 
               *display its String representation
               */
            DecagonalPrism d1 = new DecagonalPrism(label, edge, height);
            System.out.println(d1);
         }
         
      }
      
   }

}
