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

    public void searchForContact(String name){
        int temp = queryContact(name);
        if (queryContact(name)<0){
            System.out.println("No such contact in phonebook");
        } else System.out.println("Contact found at position " + (temp+1));
    }

    public void printContacts(){
        for (int i=0; i<contacts.size();i++){
            int position = queryContact(contacts.get(i).getName());
            System.out.println("Contact with name " + contacts.get(i).getName() + " with phone number " + contacts.get(i).getNumber() + " is at position " + (position + 1)  + " in the phonebook.");
        }
    }

    public void removeContact(String name){
        if (queryContact(name) < 0){
            System.out.println("Non existing contact");
        } else contacts.remove(queryContact(name));
        System.out.println("Contact removed");
    }

    public void updateContact (String name, int number){
        if (queryContact(name)<0){
            System.out.println("Non existing contact");
        } else contacts.set(queryContact(name),new Contact(name,number));
        System.out.println("Contact updated");
    }


}