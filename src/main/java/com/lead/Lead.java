package com.lead;

import java.util.Objects;

public class Lead {
    private String id;
    private String email;
    private String firstName;
    private String lastName;
    private String address;
    private String entryDate;

    public Lead(String id, String email, String firstName, String lastName, String address, String entryDate) {
        this.id = id;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.entryDate = entryDate;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof Lead)) {
            return false;
        }
        Lead lead = (Lead) o;
        return  Objects.equals(email, lead.email);/* &&
                Objects.equals(firstName, lead.firstName) &&
                Objects.equals(lastName, lead.lastName) &&
                Objects.equals(address, lead.address);*/
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + email.hashCode();
        //result = 31 * result + firstName.hashCode();
        //result = 31 * result + lastName.hashCode();
        //result = 31 * result + address.hashCode();
        System.out.println("Int HashCode = "+result);
        return result;
    }

    public String toString(){
        return "id: "+id+"  email: "+email+"  firstName: "+firstName+"  lastName: "+lastName+"  address: "+address+"  entryDate: "+entryDate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(String entryDate) {
        this.entryDate = entryDate;
    }


}
