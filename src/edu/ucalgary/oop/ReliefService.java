package edu.ucalgary.oop;

import java.time.LocalDate;

public class ReliefService {
    private Inquirer inquirer;
    private DisasterVictim missingPerson;
    private LocalDate dateOfInquiry;
    private String infoProvided;
    private Location lastKnownLocation;
    ReliefService(Inquirer inquirer, DisasterVictim missingPerson, LocalDate inquiryDate, String infoProvided, Location lastLocation)
    {
    this.inquirer = inquirer;
    this.missingPerson = missingPerson;
    this.dateOfInquiry = inquiryDate;
    this.infoProvided = infoProvided;
    this.lastKnownLocation = lastLocation;

    }
Inquirer getInquirer() 
{
    return this.inquirer;
}
void setInquirer(Inquirer inqurier)
{
    this.inquirer = inqurier;
}
DisasterVictim getMissingPerson() 
{
    return missingPerson;
}
void setMissingPerson(DisasterVictim missingPerson)
{
    this.missingPerson = missingPerson;
}
LocalDate getDateOfInquiry()
{
    return dateOfInquiry;
}
void setDateOfInquiry(LocalDate inquryDate) throws IllegalArgumentException
{
    if (inquryDate) {
        throw new IllegalArgumentException("Date of inquiry cannot be null.");
    }
    this.dateOfInquiry = inquryDate;
}
String getInfoProvided()
{
    return infoProvided;
}
void setInfoProvided(String info)
{
    this.infoProvided = info;
}
Location getLastKnownLocation() 
{
    return lastKnownLocation;
}
void setLastKnownLocation(Location lastLocation)
{
    this.lastKnownLocation = lastLocation;
}
String getLogDetails() 
{
    return "Inquirer: " + inquirer.getFirstName() + " " + inquirer.getLastName() + ", Missing Person: " + missingPerson.getName() + ", Date of Inquiry: " + dateOfInquiry.toString() + ", Info Provided: " + infoProvided + ", Last Known Location: " + lastKnownLocation.getName();
}
} //         "Inquirer: John, Missing Person: Jane Alex, Date of Inquiry: 2025-02-10, Info Provided: Looking for family member,        Last Known Location:  University of Calgary"
