package com.learning;

public class Main {
    public static void main(String[] args) {
        Contact contact = new Contact("Siya",7990);
        Contact contact1 = new Contact("Rimya",5677);
        Contact contact2 = new Contact("Ram",8976);
        Contact contact3 = new Contact("Heena",8975);

        AddressBook addressBook = new AddressBook();
        addressBook.contactList.add(contact);
        addressBook.contactList.add(contact1);
        addressBook.contactList.add(contact2);
        addressBook.contactList.add(contact3);

        System.out.println(addressBook.contactList);
    }
}
