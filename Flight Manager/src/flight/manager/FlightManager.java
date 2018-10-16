
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
       FlightUI program = new FlightUI();
       program.start();
       
    }
 

     
   
    
}
