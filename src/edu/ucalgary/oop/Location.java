package edu.ucalgary.oop;
import java.lang.IllegalArgumentException;

public class Location {
    private String name;
    private String address;
    private DisasterVictim[] occupants;
    private Supply[] supplies;

    public Location(String locationName, String address){
        if (locationName == null || address == null) {
            throw new IllegalArgumentException("Name and address cannot be null.");
        }
        this.name = locationName;
        this.address = address;
        }

    // getters and setter
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
    
}
