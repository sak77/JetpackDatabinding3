package com.saket.jetpackdatabinding;

/**
 *
 */
public class User {

    private String firstName, lastName;

    public String getFirstName(String person) {
/*
        switch (person) {
            case "me": firstName = "Saket"; break;
            case "daddy": firstName = "Shivshankar"; break;
            case "mummy": firstName = "Rita"; break;
            case "mrs": firstName = "Komal"; break;
            case "baby": firstName = "Bunny"; break;
            case "bro1": firstName = "Aniket"; break;
            case "bro2": firstName = "Vishket"; break;
            default: firstName = "Unknown"; break;
        }
*/
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
}
