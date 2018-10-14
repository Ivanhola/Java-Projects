
package flight.manager;

/**
 *
 * @author Ivans
 */
public class Plane {
    private String ID;
    private int capacity;
    
    public Plane(String id, int capacity){
        this.ID = id;
        this.capacity = capacity;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Plane " + "ID= " + ID + ", capacity=" + capacity;
    }
    
    
}
