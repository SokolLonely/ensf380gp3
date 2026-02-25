package edu.ucalgary.oop;

import java.lang.IllegalArgumentException;

public class Supply {

    private String type;
    private int quantity;

    public Supply(String type, int quantity) {

        if (quantity < 0) {
            throw new IllegalArgumentException();
        }

        this.type = type;
        this.quantity = quantity;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setQuantity(int quantity) {

        if (quantity < 0) {
            throw new IllegalArgumentException();
        }
        
        this.quantity = quantity;
    }

    public String getType() {
        return type;
    }

    public int getQuantity() {
        return quantity;
    }

}
