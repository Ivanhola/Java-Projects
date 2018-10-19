
package car.registration.center;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Ivans
 */
public class main {
    
    public static void main(String[] args) {
        
        /*Create 3 RegistrationPlate Objects*/
        RegistrationPlate plate1 = new RegistrationPlate("ABC-123", "CA");
        RegistrationPlate plate2 = new RegistrationPlate("FGH-567", "CA");
        
        RegistrationPlate plate3 = new RegistrationPlate("DEF-234", "OR");
        
        /*Create an array list that will store our RegistrationPlate objects from California*/
        ArrayList<RegistrationPlate> California = new ArrayList<RegistrationPlate>();
        
        /*Add them to our ArrayList*/
        California.add(plate2);
        California.add(plate1);
        
        RegistrationPlate newPlate = new RegistrationPlate("ABC-123", "CA");
        /*If California does not contain newPlate (Which has the same value as plate1) add it to our arraylist*/
        if(!California.contains(newPlate)){
            California.add(newPlate);
        }
        
        System.out.println("California: "+ California);
            
        /*Output: the newPlate registration is not repeated meanining our equals Worked.*/
        
        /*Create a HashMap to store the owners of our registration plates, we will pass in a RegistrationPlate object as our Key
        and the String as the name of the owner of the car*/
        HashMap<RegistrationPlate, String> plateOwners = new HashMap<RegistrationPlate, String>();
        
        /*Add Objects plate1,plate3 to our HashMap, with the Strings as names for our values*/
        plateOwners.put(plate1, "Ivan");
        plateOwners.put(plate3, "Angela");
        
        System.out.println("Plate owners:");
        /*Get the owners of the values from the RegistrationPlate object(In other words, "ABC-123", "CA" are the values from
        plate 1 etc etc.*/
        System.out.println(plateOwners.get(new RegistrationPlate("ABC-123", "CA")));
        System.out.println(plateOwners.get(new RegistrationPlate("DEF-234", "OR")));
        
        
        /*If the hashCode works, it will return the owners because they contain the same values(TEST BY REMOVING THE HashCode Method
        From our RegistrationPlate Class*/
        
        /*HERE we basically create a new hashMap (same thing we did above) but in a new class
        when we call the add method in our created object, we basically call the .put function if the object
        isnt already in our object
        Once we have the object in our hashmap(register) we can call it using the .getmethod where we return a string value
        which goes into the hashmap on the vehicleRegister class, and prints out the String value("Ivan")
        */
        vehicleRegister register = new vehicleRegister();
        register.add(plate3, "Ivan");
        /**/
        System.out.println(register.get(plate3)); 
        register.delete(plate3);
        System.out.println(register.get(plate3));
        
        
        /*IMPORTANT CONFUSION ANSWER, IF YOU'RE WONDERING WHY IT RETURNS IVAN, AND NOT THE OBJECT VALUES(ABC-123) IT IS BECAUSE
        ITS CALLING INTO OUR HASHMAP WE CREATE, WHICH HAS A KEY(PLATE OBJECT) AND A VALUE("STRING"), WHEN WE PRINT OUR FROM OUR
        HASHMAP, WE ARE PRINTING OUT THE VALUE("STRING") OF THE KEY(PLATE OBJECT), THEREFORE IT PRINTS OUT IVAN*/
        
        
    }   
    
}
