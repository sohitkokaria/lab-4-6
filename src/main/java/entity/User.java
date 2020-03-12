package entity;

import java.io.Serializable;

public class User implements Serializable {
    private String firstName;
    private String lastName;
    private String DOB;
    private String occupation;
    private String email;

    public User(String firstName, String lastName, String DOB, String occupation, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.DOB = DOB;
        this.occupation = occupation;
        this.email = email;
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

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
