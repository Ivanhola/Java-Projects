
package car.registration.center;

/**
 *
 * @author Ivans
 */
public class RegistrationPlate {
    private final String regCode;
    private final String country;
    
    public RegistrationPlate(String regCode, String Country){
        this.regCode = regCode;
        this.country = Country;
    }

    public String getRegCode() {
        return regCode;
    }

    public String getCountry() {
        return country;
    }
    
    
    
    @Override
    public String toString(){
        return regCode + " " + country;
    }
    
        @Override
    public boolean equals(Object object){
        /*if no object is being passed will return false*/
        if(object == null){
                return false;
        }
        
        
        /*if the object passed in and the object being compared are not the same class
        it will return false
        */
        if(this.getClass() != object.getClass()){
                return false;
        }
        
        
        /*Now that we have established that the object being passed is not empty, and are the same type
         we can typecast our object value into a RegistrationPlate Object value*/
        RegistrationPlate plate = (RegistrationPlate) object;
        
        
        /*if the variables compared within the 2 objects are not the same, it will return a false value*/
        
          if(!this.country.equals(plate.getCountry())){
                return false;
        }
        
          if(this.regCode == null || !this.regCode.equals(plate.getRegCode())){
                return false;
        }
        
        
        
       /*else if everything is the same, will return true.*/ 
        
        return true;
        
    }
    
    @Override
    public int hashCode(){
        if(this.regCode == null){
            return 7;
        }
        /*must use.hashCode() when returning strings.*/
        return this.regCode.hashCode() + this.country.hashCode();
    }
    
    
    
    
}
