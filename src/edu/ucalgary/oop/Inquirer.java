package edu.ucalgary.oop;

public class Inquirer {
    private final String FIRST_NAME;
    private final String LAST_NAME;
    private final String INFO;
    private final String SERVICES_PHONE;

    Inquirer(String firstName, String lastName, String phone, String info)
    {
        this.FIRST_NAME =firstName;
        this.LAST_NAME = lastName;
        this.SERVICES_PHONE = phone;
        this.INFO = info;
    }

    String getFirstName()
    {
        return this.FIRST_NAME;
    }
    
    String getLastName() 
    {
        return this.LAST_NAME;
    }

    String getServicesPhoneNum()
    {
        return this.SERVICES_PHONE;
    }

    String getInfo()
    {
        return this.INFO;
    }
}
