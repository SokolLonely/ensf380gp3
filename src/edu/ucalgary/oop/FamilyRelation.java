/**
 * Class: FamilyRelation
 * Date: Feb 26, 2026
 * Completed by: Calvin Shaw
 */

package edu.ucalgary.oop;

public class FamilyRelation {

    private DisasterVictim personOne;
    private String relationshipTo;
    private DisasterVictim personTwo;

    /* Throws IllegalArgumentException if person1 or 2 are null or not distinct */
    public FamilyRelation(DisasterVictim personOne, String relationshipTo, DisasterVictim personTwo) throws IllegalArgumentException {
        
        if (personOne == null || personTwo == null) {
            throw new IllegalArgumentException("Neither personOne or personTwo can be null.");
        }
        if (personOne == personTwo) {
            throw new IllegalArgumentException("personOne and personTwo must be unique");
        }

        this.personOne = personOne;
        this.personTwo = personTwo;
        this.relationshipTo = relationshipTo;
    }

    public DisasterVictim getPersonOne() {
        return this.personOne;
    }

    /* Throws IllegalArgumentException if person1 is null or the same as person2 */
    public void setPersonOne(DisasterVictim personOne) throws IllegalArgumentException {
        
        if (personOne == null) {
            throw new IllegalArgumentException("personOne cannot be null.");
        }
        if (this.personTwo == personOne) {
            throw new IllegalArgumentException("personOne cannot be the same as personTwo");
        }

        this.personOne = personOne;
    }

    public String getRelationshipTo() {
        return this.relationshipTo;
    }

    public void setRelationshipTo(String relationshipTo) {
        this.relationshipTo = relationshipTo;
    }

    public DisasterVictim getPersonTwo() {
        return this.personTwo;
    }

    /* Throws IllegalArgumentException if person2 is null or the same as person1 */
    public void setPersonTwo(DisasterVictim personTwo) throws IllegalArgumentException {
        
        if (personTwo == null) {
            throw new IllegalArgumentException("personTwo cannot be null.");
        }
        if (this.personOne == personTwo) {
            throw new IllegalArgumentException("personTwo cannot be the same as personOne");
        }

        this.personTwo = personTwo;
    }

}