/**
 * Class: Supply
 * Date: Feb 25, 2026
 * Completed by: Calvin Shaw
 */

package edu.ucalgary.oop;

import java.lang.IllegalArgumentException;

public class Supply {

    private String type;
    private int quantity;

    /* Throws IllegalArgumentException if quantity is less than 0 */
    public Supply(String type, int quantity) throws IllegalArgumentException {

        if (quantity < 0) {
            throw new IllegalArgumentException("Quantity cannot be less than zero.");
        }

        this.type = type;
        this.quantity = quantity;
    }

    public void setType(String type) {
        this.type = type;
    }

    /* Throws IllegalArgumentException if quantity is less than 0 */
    public void setQuantity(int quantity) throws IllegalArgumentException {

        if (quantity < 0) {
            throw new IllegalArgumentException("Quantity cannot be less than zero.");
        }
        
        this.quantity = quantity;
    }

    public String getType() {
        return this.type;
    }

    public int getQuantity() {
        return this.quantity;
    }

}