/**
 * Class: DisasterVictim
 * Date: Feb 26, 2026
 * Completed by: Benjamin Anderson
 */

package edu.ucalgary.oop;

import java.time.LocalDate;
import java.util.Arrays;

public class DisasterVictim {
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private FamilyRelation[] familyConnections;
    private MedicalRecord[] medicalRecords;
    private Supply[] personalBelongings;
    private final LocalDate ENTRY_DATE;
    private String gender;
    private String comments;

    public DisasterVictim(String firstName, LocalDate entryDate) {
        this.ENTRY_DATE = entryDate;
        this.firstName = firstName;
    }

    public DisasterVictim(String firstName, LocalDate entryDate, LocalDate dateOfBirth) {
        this.ENTRY_DATE = entryDate;
        this.firstName = firstName;
        setDateOfBirth(dateOfBirth);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) throws IllegalArgumentException {
        if (dateOfBirth.isAfter(ENTRY_DATE)) {
            throw new IllegalArgumentException("Birthdate cannot be set to a future date");
        }
        this.dateOfBirth = dateOfBirth;
    }

    public FamilyRelation[] getFamilyConnections() {
        return familyConnections;
    }

    public MedicalRecord[] getMedicalRecords() {
        return medicalRecords;
    }

    public Supply[] getPersonalBelongings() {
        return personalBelongings;
    }

    public void setFamilyConnections(FamilyRelation[] connections) {
        this.familyConnections = connections;
    }

    public void setMedicalRecords(MedicalRecord[] records) {
        this.medicalRecords = records;
    }

    public void setPersonalBelongings(Supply[] belonging) {
        this.personalBelongings = belonging;
    }

    public void addPersonalBelonging(Supply belonging) throws IllegalArgumentException {
        if (belonging == null) {
            throw new IllegalArgumentException("belonging cannot be null");
        }
        if (personalBelongings == null) {
            personalBelongings = new Supply[0];
        }
        personalBelongings = Arrays.copyOf(personalBelongings, personalBelongings.length + 1);
        personalBelongings[personalBelongings.length-1] = belonging;
    }

    public void removePersonalBelonging(Supply belonging) throws IllegalArgumentException {
        if (personalBelongings == null) {
            throw new IllegalArgumentException("disaster victim has no personal belongings");
        }
        int index = -1;
        for (int i = 0; i < personalBelongings.length; i++) {
            if (personalBelongings[i] == belonging) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            throw new IllegalArgumentException("belonging not found");
        }
        Supply[] newSupply = new Supply[personalBelongings.length-1];
        for (int i = 0; i < personalBelongings.length; i++) {
            if (i != index) {
                newSupply[i] = personalBelongings[i];
            }
        }
        personalBelongings = newSupply;
    }

    public void addFamilyConnection(FamilyRelation connection) throws IllegalArgumentException {
        if (connection == null) {
            throw new IllegalArgumentException("cannot add null connection");
        }
        if (familyConnections == null) {
            familyConnections = new FamilyRelation[0];
        }
        familyConnections = Arrays.copyOf(familyConnections, familyConnections.length + 1);
        familyConnections[familyConnections.length-1] = connection;
    }

    public void removeFamilyConnection(FamilyRelation connection) throws IllegalArgumentException {
        if (familyConnections == null) {
            throw new IllegalArgumentException("disaster victim has no connections");
        }
        int index = -1;
        for (int i = 0; i < familyConnections.length; i++) {
            if (familyConnections[i] == connection) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            throw new IllegalArgumentException("connection not found");
        }
        FamilyRelation[] newRelation = new FamilyRelation[familyConnections.length-1];
        for (int i = 0; i < newRelation.length; i++) {
            if (i != index) {
                newRelation[i] = familyConnections[i];
            }
        }
        familyConnections = newRelation;
    }

    public void addMedicalRecord(MedicalRecord record) throws IllegalArgumentException {
        if (record == null) {
            throw new IllegalArgumentException("cannot add null record");
        }
        if (medicalRecords == null) {
            medicalRecords = new MedicalRecord[0];
        }
        medicalRecords = Arrays.copyOf(medicalRecords, medicalRecords.length + 1);
        medicalRecords[medicalRecords.length-1] = record;
    }

    public LocalDate getEntryDate() {
        return ENTRY_DATE;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) throws IllegalArgumentException {
        if ((this.gender != null && this.gender.equalsIgnoreCase("please specify")) ||
            gender.equalsIgnoreCase("please specify")
            ) {
            this.gender = gender;
        }
        else if (gender.equalsIgnoreCase("boy") ||
                gender.equalsIgnoreCase("girl")) {
            LocalDate current = LocalDate.now();
            LocalDate adultDate = LocalDate.of(dateOfBirth.getYear()+18, dateOfBirth.getMonthValue(), dateOfBirth.getDayOfMonth());
            if (current.isAfter(adultDate) || current.equals(adultDate)) {
                throw new IllegalArgumentException("cannot set gender to " + gender + " as age >= 18");
            }
            String upper = gender.substring(0,1).toUpperCase();
            String lower = gender.substring(1).toLowerCase();
            
            this.gender = upper + lower;
        }
        else if (gender.equalsIgnoreCase("man") ||
                gender.equalsIgnoreCase("woman")) {
            LocalDate current = LocalDate.now();
            LocalDate adultDate = LocalDate.of(dateOfBirth.getYear()+18, dateOfBirth.getMonthValue(), dateOfBirth.getDayOfMonth());
            if (current.isBefore(adultDate)) {
                throw new IllegalArgumentException("cannot set gender to " + gender + " as age < 18");
            }
            String upper = gender.substring(0,1).toUpperCase();
            String lower = gender.substring(1).toLowerCase();
            
            this.gender = upper + lower;
        }
        else {
            throw new IllegalArgumentException("Invalid gender");
        }
    }
}
