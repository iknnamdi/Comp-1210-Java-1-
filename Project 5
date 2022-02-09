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

public class DecagonalPrism {
  
   // instance variables
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
         * (Math.sqrt(5 + 2 * Math.sqrt(5))) * height);
   }
  
   /**
   *@return String representation of DecagonalPrism.
   */
   public String toString() {
   
      DecimalFormat df = new DecimalFormat("#,##0.0##");
   
      String output = "A decagonal prism \"" + label + "\" with edge = "
         + df.format(edge) + " units and height = " 
         + df.format(height) + " units, has:";
      output += "\n\tsurface area = " + df.format(surfaceArea()) 
         + " square units "; 
      output += "\n\tbase area = " + df.format(baseArea()) + " square units";
      output += "\n\tlateral surface area = " 
         + df.format(lateralSurfaceArea()) + " square units";
      output += "\n\tvolume = " + df.format(volume()) + " cubic units";       
      
      return output;
   }
  
}
//
//
//
//
//
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileNotFoundException;
/**
*A complex program that defines DecagonalPrismList objects.
*
*Project 05.
*@author - Nnamdi Ikenna-Obi - Comp 1210 - section 001.
*@version September 24th, 2021.
*/

public class DecagonalPrismList {

//instace variable
   private String name;
   private ArrayList<DecagonalPrism> list;

//Constructor
/**
*@param nameIn for name
*@param listIn for list
*/
   public DecagonalPrismList(String nameIn, ArrayList<DecagonalPrism> listIn) {
      name = nameIn;
      list = listIn;
   }
   
   /**
   *@return name
   */
   public String getName() {
      return name;
   }
   
   /**
   *@return number of DecagonalPrism in the list
   */
   public int numberOfDecagonalPrisms() {
      return list.size();
   }
   
   /**
   *@return total surface area
   */
   public double totalSurfaceArea() {
      double total = 0;
      for (int i = 0; i < list.size(); i++) {
         total += list.get(i).surfaceArea();
      }
      return total;
   }
   
   /**
   *@return total base area
   */
   public double totalBaseArea() {
      double total = 0;
      for (int i = 0; i < list.size(); i++) {
         total += list.get(i).baseArea();
      }
      return total;
   }
   
   /**
   *@return total lateral surface area
   */
   
   public double totalLateralSurfaceArea() {
      double total = 0;
      for (int i = 0; i < list.size(); i++) {
         total += list.get(i).lateralSurfaceArea();
      }
      return total;
   }
   
   /**
   *@return total volume
   */
   public double totalVolume() {
      double total = 0;
      for (int i = 0; i < list.size(); i++) {
         total += list.get(i).volume();
      }
      return total;
   }
   
   /**
   *@return average surface area
   */
   public double averageSurfaceArea() {
      if (numberOfDecagonalPrisms() > 0) {
         return totalSurfaceArea() / numberOfDecagonalPrisms();
      }
      return 0;
   }
   
   /**
   *@return average volume
   */
   public double averageVolume() {
      if (numberOfDecagonalPrisms() > 0) {
         return totalVolume() / numberOfDecagonalPrisms();
      } 
      return 0;
   }
   
   /**
   *@return String
   */
   public String toString() {
      String result = name + "\n";
      for (int i = 0; i < list.size(); i++)
      {
         result += "\n" + list.get(i).toString() + "\n";
      }
      return result;     
   }
   
   /**
   *@return String
   */
   public String summaryInfo() {
      DecimalFormat df = new DecimalFormat("#,##0.0##");
      String result = "----- Summary for " + name + " -----";
      result = result + "\nNumber of Decagonal Prisms: " 
         + numberOfDecagonalPrisms()
         + "\nTotal Surface Area: " + df.format(totalSurfaceArea())
         + "\nTotal Base Area: " + df.format(totalBaseArea())
         + "\nTotal Lateral Surface Area: " 
         + df.format(totalLateralSurfaceArea())
         + "\nTotal Volume: " + df.format(totalVolume())
         + "\nAverage Surface Area: " + df.format(averageSurfaceArea())
         + "\nAverage Volume: " + df.format(averageVolume());
   
      return result;
   }
    
/**
   * The getList method returns the ArrayList of DecagonalPrism objects.
   *
   * @return list
   */
   public ArrayList<DecagonalPrism> getList() {
      return list;
   }

   /**
   * The readFile method takes a String parameter representing the file name,
   * reads in the file, storing the list name and creating an ArrayList of
   * DecagonalPrism objects, uses the list name and the ArrayList to create a
   * DecagonalPrismList object, and then returns the DecagonalPrismList object.
   *
   * @param nameIn Required for the filename to read.
   * @return dL for DecagonalPrismList
   * @throws IOException If the file cannot be opened.
   */
   public DecagonalPrismList readFile(String nameIn) throws FileNotFoundException {
      Scanner sc = new Scanner(System.in);
      ArrayList<DecagonalPrism> list = new ArrayList<DecagonalPrism>();
      String name = "";
    
      name = sc.nextLine();
    
      while (sc.hasNext()) {
         String label = sc.nextLine();
         double edge = Double.parseDouble(sc.nextLine());
         double height = Double.parseDouble(sc.nextLine());
       
         DecagonalPrism d = new DecagonalPrism(label, edge, height);
         list.add(d);
      }
      DecagonalPrismList dL = new DecagonalPrismList(name, list);
      return dL;
   }

   /**
   * The addDecagonalPrism method returns nothing but takes three parameters
   * (label, color, and edge), creates a new Dodecahedron object, and adds it
   * to the DodecahedronList object.
   *
   * @param sLabelIn For Label Input
   * @param dEdgeIn For Edge Input
   * @param sHeightIn For Height Input
   */
   public void addDecagonalPrism(String labelIn,
                               double edgeIn, double heightIn) {
      DecagonalPrism d = new DecagonalPrism(labelIn, edgeIn, heightIn);
      list.add(d);
   }

   /**
   * The findDecagonalPrism method takes a label of a DecagonalPrism as the String
   * parameter and returns the corresponding Dodecahedron object if found in
   * the DecagonalPrism object; otherwise returns null.
   *
   * @param labelIn For Label Input
   * @return result Returns the corresponding DecagonalPrism object; otherwise,
   *                 it returns a null value.
   */
   public DecagonalPrism findDecagonalPrism(String labelIn) {
      DecagonalPrism result = null;
    
      for (int i = 0; i < list.size(); i++) {
         if (list.get(i).getLabel().equalsIgnoreCase(labelIn)) {
            result = list.get(i);
            break;
         }
      }
      return result;
   }

   /**
   * The deleteDecagonalPrism method takes a String as a parameter that
   * represents the label of the DecagonalPrism and returns the
   * DecagonalPrism if it is found in the DecagonalPrismList object and
   * deleted; otherwise returns null.
   *
   * @param sLabelIn For Label Input
   * @return Returns the DecagonalPrism if it is found in the
   *          DecagonalPrismList object and deleted; otherwise,
   *          returns null.
   */
   public DecagonalPrism deleteDecagonalPrism(String labelIn) {
      DecagonalPrism result = findDecagonalPrism(labelIn);
    
      if (result != null) {
         list.remove(result);
      }
      return result;
   }

   /**
   * The editDecagonalPrism method takes three parameters (label, color,
   * and edge), uses the label to find the corresponding DecagonalPrism
   * object. If found, sets the color and edge to the values passed in
   * as parameters, and returns true. If not found, returns false.
   *
   * @param labelIn For Label Input
   * @param edgeIn For Edge Input
   * @param heightIn For Height Input
   * @return true Returns true; otherwise, it returns false.
   */
   public boolean editDecagonalPrism(String labelIn, double edgeIn, double heightIn) {
      DecagonalPrism result = null;
    
      for (int i = 0; i < list.size(); i++) {
         if (list.get(i).getLabel().equalsIgnoreCase(labelIn)) {
            result = list.get(i);
            list.get(i).setEdge(edgeIn);
            list.get(i).setHeight(heightIn);
            return true;
         }
      }
      return false;
   }

}
//
//
//
//
//
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;   
/**
*A complex program that reads in a file name entered by the user
*then reads the list name and DecagonalPrism data from the file,
*creates DecagonalDecagonalPrism objects and stores them in an ArrayList
   *of DecagonalPrism objects, creates an DecagonalPrismList object with the 
   *list name and ArrayList,prints the DecagonalPrismList object, and then 
   *prints summary information about the DecagonalPrismList object. 
*
*Project 05.
*@author - Nnamdi Ikenna-Obi - Comp 1210 - section 001.
*@version September 24th, 2021.
*/

public class DecagonalPrismListApp {
/**
*prompts the user to enter a file name, and then it should read in
   *the file.
*@param args command line argument
*@throws FileNotFoundException - for File not found
*/

   public static void main(String[] args)throws FileNotFoundException {
   
      String fileName;
      DecagonalPrismList prismList;
   
   /**
   *creates an array list to store DecagonalPrism objects read from file
   */
      ArrayList<DecagonalPrism> list = new ArrayList<>();
   
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter file name: ");
      fileName = sc.nextLine();
   
      sc = new Scanner(new File(fileName));
   
      String name, label;
      double edge = 0;
      double height = 0;
   
   
      name = sc.nextLine();
      while (sc.hasNextLine()) {
         label = sc.nextLine();
         edge = Double.parseDouble(sc.nextLine());
         height = Double.parseDouble(sc.nextLine());
         list.add(new DecagonalPrism(label, edge, height));
      }
      
      /**
      *creates an object of DecagonalPrismList
      */
      prismList = new DecagonalPrismList(name, list);
      
      System.out.println("\n" + prismList + "\n");
      System.out.println(prismList.summaryInfo());
      
   }
}
//
//
//
//
//
import java.util.Scanner;
import java.io.*;

public class test
{
   public static void main(String[] args) throws FileNotFoundException
   {
      Scanner scan1 = new Scanner(System.in);
      String file = scan1.nextLine();
      Scanner scan = new Scanner(new File(file));
      
      while(scan.hasNextLine())
      {
         System.out.println(scan.nextLine());
      }
      
   }
}


