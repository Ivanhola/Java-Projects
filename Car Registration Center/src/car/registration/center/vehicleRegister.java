
package car.registration.center;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Ivans
 */
public class vehicleRegister {
    
    /*Our Vehicle Register Class will contain a HashMap that will store RegistrationPlate as key, and String for our owners value*/
    HashMap<RegistrationPlate, String> owners;
    
    
    public vehicleRegister(){
       this.owners = new HashMap<RegistrationPlate, String>();
    }
    
    /*Method used to adding an object and string onto our HashMap, gets a RegistrationPlate object, and a String value, adds it to our hashMap*/
    public boolean add(RegistrationPlate plate, String owner){
        /*if when calling our hashMap, and it doesnt find the object values of the object we passed in(plate) 
        we will add the object and owner information to our hashmap*/
        if(owners.get(plate) == null){
            owners.put(plate, owner);
            return true;
        }else{
            return false;
        }
        
        
    }
    
    
    public String get(RegistrationPlate plate){
        /*if our hashMap contains the key of plate, it will return a plate object(toString method)*/
        if(owners.containsKey(plate)){
            return owners.get(plate);
        }else {
            return null;
        }
    }
    
    
        public boolean delete(RegistrationPlate plate) {
        if (owners.containsKey(plate)) {
            owners.remove(plate);
            return true;
        } else {
            return false;
        }
    }
     
        
    public void printRegistrationPlates() {
        for (RegistrationPlate key : owners.keySet()) {
            System.out.println(key);
        }
    }

    public void printOwners() {
        
        ArrayList<String> owner = new ArrayList<String>();
        
        for (RegistrationPlate key : owners.keySet()) {
            String ownerName = owners.get(key);
            if (!owner.contains(ownerName)) {
                owner.add(ownerName);
            }
        }
        
        for (String name : owner) {
            System.out.println(name);
        }
    }
        
        
}
