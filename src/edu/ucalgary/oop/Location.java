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
        this.name = locationName;
        this.address = address;
    }

    // getters and setters
    public String getName() {
        return name;
    }

    public void setName(String locationName) {
        this.name = locationName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public DisasterVictim[] getOccupants(){
        return occupants;
    }

     public void setOccupants(DisasterVictim[] occupants) {
        this.occupants = occupants;
    }

    public Supply[] getSupplies() {
        return supplies;
    }

    public void setSupplies(Supply[] inventory) {
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

        int index = -1;
        for (int i = 0; i < occupants.length; i++) {
            if (occupants[i].equals(occupant)) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            throw new IllegalArgumentException("No occupant with that name found."); 
        }

        DisasterVictim[] newOccupants = new DisasterVictim[occupants.length - 1];
        for (int i = 0, j = 0; i < occupants.length; i++) {
            if (i != index) {
                newOccupants[j++] = occupants[i];
            }
        }
        occupants = newOccupants;
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

    public void removeSupply(Supply inventory){
        if (inventory == null){
            throw new IllegalArgumentException("Supply cannot be null.");
        }

        int index = -1;
        for (int i = 0; i < supplies.length; i++) {
            if (supplies[i].equals(inventory)) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            throw new IllegalArgumentException("No supply with that name found."); 
        }

        Supply[] newSupplies = new Supply[supplies.length - 1];
        for (int i = 0, j = 0; i < supplies.length; i++) {
            if (i != index) {
                newSupplies[j++] = supplies[i];
            }
        }
        supplies = newSupplies;

    }

}
