package com.learning;

public class Contact {
    String name;
    int pinCode;

    Contact(String name,int pinCode){
        this.name=name;
        this.pinCode = pinCode;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", pinCode=" + pinCode +
                '}';
    }
}
