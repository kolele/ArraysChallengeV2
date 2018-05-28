package com.kole;

import java.util.ArrayList;

public class MobilePhone {
    private String name;
    private int number;
    private ArrayList<Contact> contacts;

    public MobilePhone(String name, int number) {
        this.name = name;
        this.number = number;
        this.contacts = new ArrayList<>();
    }

    public void addContact(String name, int number) {
        if (queryContact(name)>=0){
            System.out.println("Contact already exists!");
        } else contacts.add(new Contact(name,number));
        System.out.println("Added contact " + name + " to the phonebook");
    }

    private int queryContact(String name) {
        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).getName().contains(name)) {
                Contact tempContact = contacts.get(i);
                return contacts.indexOf(tempContact);
            }
        }return -1;
    }

    public void printContacts(){
        for (int i=0; i<contacts.size();i++){
            System.out.println("Contact with name " + contacts.get(i).getName() + " with phone number " + contacts.get(i).getNumber() + " is at position " + contacts.get(i).getName().indexOf(name)  + " in the phonebook.");
        }
    }
}