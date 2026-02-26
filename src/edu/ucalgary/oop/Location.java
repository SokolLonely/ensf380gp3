/* 
    ENSF 380 - Object Oriented Principles
    Group 11
    Class: Location
    Completed by: Basema Khan
 */

package edu.ucalgary.oop;
import java.lang.IllegalArgumentException;

public class Location {
    private String name;
    private String address;
    private DisasterVictim[] occupants;
    private Supply[] supplies;

    // constructor
    public Location(String locationName, String address){
        if (locationName == null || address == null) {
            throw new IllegalArgumentException("Name and address cannot be null.");
        }
        this.name = locationName;
        this.address = address;

        // empty arrays
        this.occupants = new DisasterVictim[0]; 
        this.supplies = new Supply[0];
        }

    // getters and setters
    public String getName() {
        return name;
    }

    public void setName(String locationName) {
        if (locationName == null) {
            throw new IllegalArgumentException("Name cannot be null.");
        }
        this.name = locationName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        if (address == null) {
            throw new IllegalArgumentException("Address cannot be null.");
        }
        this.address = address;
    }

    public DisasterVictim[] getOccupants(){
        return occupants;
    }

     public void setOccupants(DisasterVictim[] occupants) {
        if (occupants == null) {
            throw new IllegalArgumentException("Occupants array cannot be null.");
        }
        this.occupants = occupants;
    }

    public Supply[] getSupplies() {
        return supplies;
    }

    public void setSupplies(Supply[] inventory) {
        if (inventory == null) {
            throw new IllegalArgumentException("Supplies array cannot be null.");
        }
        this.supplies = inventory;
    }

    // add and remove 
    public void addOccupant(DisasterVictim occupant){
        if (occupant == null) {
            throw new IllegalArgumentException("Occupant cannot be null.");
        }

        DisasterVictim[] newOccupants = new DisasterVictim[occupants.length + 1];
        System.arraycopy(occupants, 0, newOccupants, 0, occupants.length);
        newOccupants[occupants.length] = occupant;
        occupants = newOccupants;
    }

    public void removeOccupant(DisasterVictim occupant){
        if (occupant == null){
            throw new IllegalArgumentException("Occupant cannot be null.");
        }

    }

    public void addSupply(Supply inventory){
        if (inventory == null) {
            throw new IllegalArgumentException("Supply cannot be null.");
        }

        Supply[] newSupplies = new Supply[supplies.length + 1];
        System.arraycopy(supplies, 0, newSupplies, 0, supplies.length);
        newSupplies[supplies.length] = inventory;
        supplies = newSupplies;
    }

    public void removeOccupant(Supply inventory){
        if (inventory == null){
            throw new IllegalArgumentException("Supply cannot be null.");
        }

    }

}
