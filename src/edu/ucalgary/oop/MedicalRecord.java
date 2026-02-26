/* 
    ENSF 380 - Object Oriented Principles
    Group 11
    Class: Medical Record
    Completed by: Basema Khan
 */

package edu.ucalgary.oop;
import java.lang.IllegalArgumentException;
import java.time.LocalDate;

public class MedicalRecord {
    private Location location;
    private String treatmentDetails;
    private LocalDate dateOfTreatment;

    // constructor
    public MedicalRecord(Location location, String treatmentDetails, LocalDate dateOfTreatment){
        if(location == null || treatmentDetails == null || dateOfTreatment == null){
            throw new IllegalArgumentException("Location, treatment details and date of treatment cannot be null.");
        }
        this.location = location;
        this.treatmentDetails = treatmentDetails;
        this.dateOfTreatment = dateOfTreatment;
    }

    // getters and setters
    public Location getLocation(){
        return location;
    }

    public void setLocation(Location location){
        if (location == null){
            throw new IllegalArgumentException("Location cannot be null.");
        }
        this.location = location;
    }

    public String getTreatmentDetails(){
        return treatmentDetails;
    }

    public void setTreatmentDetails(String treatmentDetails){
        if (treatmentDetails == null){
            throw new IllegalArgumentException("Treatment details cannot be null.");
        }
        this.treatmentDetails = treatmentDetails;
    }

    public LocalDate getDateOfTreatment(){
        return dateOfTreatment;
    }

    public void setDateOfTreatment(LocalDate dateOfTreatment){
        if (dateOfTreatment == null){
            throw new IllegalArgumentException("Date of treatment cannot be null.");
        }
        this.dateOfTreatment = dateOfTreatment;
    }
   
}
