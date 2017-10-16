package com.zorax;

public class Contact {
    private String name;
    private String phoneNumber;

    public Contact() {
    }

    public Contact(String Name, String phoneNumber) {
        this.name = Name;
        this.phoneNumber = phoneNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public static Contact createContact(String name, String phoneNumber){
        return new Contact((name, phoneNumber));
    }
}
