/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flight.manager;


import java.util.HashMap;
import java.util.Scanner;


public class FlightUI {
     //hashmap to store our Plane objects
     HashMap<String, Plane> planeCollection;  
     HashMap<String, Flights> flightCollection;
     
     
     boolean firstPart = true;
     boolean secondPart = true;
     
     
     public FlightUI(){
         this.planeCollection = new HashMap<String, Plane>();
         this.flightCollection = new HashMap<String, Flights>();
     }
     
     public void start(){
         
       
       
       System.out.println();
       System.out.println();
       
       
       //Our Variables
       
      
       
       
       
      //part 1
       while(firstPart) {
         Scanner kb = new Scanner(System.in);
         //calling ask user method which asks user what to choose
         askUser();
           
         
         //after askUser method is executed, will prompt user to enter from one of the options
         String user = kb.nextLine().trim();
         
         //if user types 1 it will ask them to enter a plane ID and a Plane Capacity
         if("1".equals(user)){
         System.out.print("Give plane ID: ");
         String id = kb.nextLine();
         System.out.print("Give plane capacity: ");
         int capacity = kb.nextInt();
         //creates an object with our ID, and our capacity
            addPlane(id, capacity);
            //also adds the object to our hashmap in the method, to store the object
         }
           
        //temporary command, if user types X, will prompt to enter the ID, and will call the getPLane method which returns
        //a string of the object when typed into system.out.println
         
         
         if("2".equals(user)){
           System.out.print("Give plane ID: ");
           String id = kb.nextLine();
           System.out.print("Give departure code: ");
           String depart = kb.nextLine();
           System.out.print("Give destination code: ");
           String destination = kb.nextLine();
           if(getPlane(id) == null){
               System.out.println("Plane does not Exist!");
           start();
               return;
           }
           addFlight(getPlane(id), depart, destination);
         }
         
         
         if("x".equals(user)){
              break;
             
         }
       }
       
       System.out.println();
       System.out.println("Flight Service");
       System.out.println("--------------");
       
       //part 2
       while(secondPart){
         Scanner kb = new Scanner(System.in);
         
         flightService();
         
         
         String user = kb.nextLine().trim();
         if("1".equals(user)){
             /*foreach loop that puts the values from planeCollection into a Plane object, then prints out the object using
             our getPlane method to return the value of our plane.*/
             for(Plane value: planeCollection.values()){
                 System.out.println(getPlane(value.getID()));
             }
         }
         
           if("2".equals(user)){
              // String id = kb.nextLine();
              
              /*foreach loop that iterates through each object found in flightCollection hashMap, stores the objects
              in our value variable, then we print out the object using the getFlight method, which requires a string,
              in order to get that string, we must call the getPlane getter from our FLIGHTS class ( NOT THE getPlane() method
              from this class!!) which returns a plane value, from there we can then use the .getID() getter to retrieve a string
              value of our plane object, which in turn will be the HashMap keyValue needed to retrieve a flights object from our 
              flightCollection HashMap, and print out from our toString().
              */
              
               for(Flights value : flightCollection.values()) {
                System.out.println(getFlight(value.getPlane().getID()));  
}
             //System.out.println(getFlight(id));
             
         }
           
           if("3".equals(user)){
             System.out.print("Plane ID?:");
             String id;
             //calling our getPlane Method which takes in a String for ID, and returns a plane value
             System.out.println(getPlane(id = kb.nextLine()));
         }
         
         if("x".equals(user)){
              break;
         }
       }
    }
     
     public void askUser(){
        System.out.println("Choose operation:\n" +
                             "[1] Add airplane\n" +
                             "[2] Add flight\n" +
                             "[x] Exit");
        System.out.print(">");
        
    }
     
      public void flightService(){
        System.out.println("Choose operation:\n" +
                             "[1] Print Planes\n" +
                             "[2] Print Flights\n" +
                             "[3] Print Plane info\n" +
                             "[x] Exit");
        System.out.print(">");
        
    }
     
     //method used for adding and creating our plane object, will take in an id and a capacity
     public void addPlane(String id, int capacity){
         Plane plane = new Plane(id,capacity);
         //adds the object to our planeCollection variable
         planeCollection.put(id, plane);
        // System.out.println(plane.toString());
     }
     
     //returns a plane object, takes in an id key, and returns the Plane object based on our id key.
     public Plane getPlane(String id){
         //System.out.println(planeCollection.get(id).toString());
         return planeCollection.get(id);
     }
     
     
     /*Method used to add a flight to our Flight created Object, takes in a Plane object, String for depart
     and string for destination. 
     creates a new object with the passed in values, and adds it to our hashmap*/
     public void addFlight(Plane plane, String departLoc, String Destination){
         Flights flight = new Flights(plane, departLoc, Destination);
         flightCollection.put(plane.getID(), flight);
         
     }
     
     public Flights getFlight(String id){
         
         return flightCollection.get(id);
     }
     
     
}


