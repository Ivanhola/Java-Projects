
package flight.manager;

import java.awt.print.Book;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Ivans
 *  NOTE ALL OF THIS CAN BE USED IN ANOTHER JAVA CLASS FOR STORING AND HANDLING OUR UI.
 */
public class FlightManager {
    //hashmap to store our Plane objects
    static HashMap<String, Plane> planeCollection  = new HashMap<String, Plane>();
    public static void main(String[] args) {
       /************************/
       /* Welcome to the Flight Manager program created by Ivan Llamas!
          In this program we will make use of HashMaps, Classes, Objects, User input and more!
          
          This program will prompt the user with options to create airplanes, and assign them with
          Plane ID, Plane Capacity, 
          Flight class will know the plane ID, airport code, and destination code.
          
       */
       
       System.out.println("     /* Welcome to the Flight Manager program created by Ivan Llamas!\n" +
            "          In this program we will make use of HashMaps, Classes, Objects, User input and more!\n" +
            "          \n" +
            "          This program will prompt the user with options to create airplanes, and assign them with\n" +
            "          Plane ID, Plane Capacity, \n" +
            "          Flight class will know the plane ID, airport code, and destination code.\n" +
            "          \n" +
            "       */");
       
       
       System.out.println();
       System.out.println();
       
       
       //Our Variables
       
      
       
       
       
      //part 1
       while(true) {
         //calling ask user method which asks user what to choose
           askUser();
           
         Scanner kb = new Scanner(System.in);
         //after askUser method is executed, will prompt user to enter from one of the options
         String user = kb.nextLine().trim();
         
         //if user types 1 it will ask them to enter a plane ID and a Plane Capacity
         if("1".equals(user)){
         System.out.print("plane ID: ");
         String id = kb.nextLine();
         System.out.print("plane capacity");
         int capacity = kb.nextInt();
         //creates an object with our ID, and our capacity
            addPlane(id, capacity);
            //also adds the object to our hashmap in the method, to store the object
         }
           
        //temporary command, if user types X, will prompt to enter the ID, and will call the getPLane method which returns
        //a string of the object when typed into system.out.println
         if("x".equals(user)){
             System.out.println("Plane ID?:");
             String id;
             System.out.println(getPlane(id = kb.nextLine()));
             
         }
         
         if("2".equals(user)){
             break;
         }
       }
       
       
       //part 2
       while(true){
           System.out.println("Welcome to part 2");
            Scanner kb = new Scanner(System.in);
         String user = kb.nextLine().trim();
         if("1".equals(user)){
             
         }
         
         if("x".equals(user)){
              System.out.println("exit!");
         }
       }
       
    }
    
     public static void askUser(){
        System.out.println("Choose operation:\n" +
        "[1] Add airplane\n" +
        "[2] Add flight\n" +
        "[x] Exit");
        System.out.print(">");
        
    }
     
     //method used for adding and creating our plane object, will take in an id and a capacity
     public static void addPlane(String id, int capacity){
         Plane plane = new Plane(id,capacity);
         //adds the object to our planeCollection variable
         planeCollection.put(id, plane);
         System.out.println(plane.toString());
     }
     
     //returns a plane object, takes in an id key, and returns the Plane object based on our id key.
     public static Plane getPlane(String id){
         //System.out.println(planeCollection.get(id).toString());
         return planeCollection.get(id);
     }

     
   
    
}
