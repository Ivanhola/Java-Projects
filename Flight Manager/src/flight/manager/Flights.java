/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flight.manager;

/**
 *
 * @author Ivans
 */
public class Flights {
    Plane plane;
    String StartingDestination;
    String NextDestination;
    public Flights(Plane plane, String StartingDestination, String NextDestination){
        this.plane = plane;
        this.StartingDestination = StartingDestination;
        this.NextDestination = NextDestination;
    }

    public Plane getPlane() {
        return plane;
    }

    public void setPlane(Plane plane) {
        this.plane = plane;
    }

    public String getStartingDestination() {
        return StartingDestination;
    }

    public void setStartingDestination(String StartingDestination) {
        this.StartingDestination = StartingDestination;
    }

    public String getNextDestination() {
        return NextDestination;
    }

    public void setNextDestination(String NextDestination) {
        this.NextDestination = NextDestination;
    }

    @Override
    public String toString() {
        return  plane + " " + StartingDestination + " - "  + NextDestination;
    }
    
    
}
