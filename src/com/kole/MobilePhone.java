package com.kole;

import java.util.ArrayList;

public class MobilePhone {
    private String phoneNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        this.myContacts = new ArrayList<Contact>();
    }

    public Contact addContact (String name, String number){
        Contact newContact = new Contact(name,number);
        myContacts.add(newContact);
        return newContact;
    }

    public void printContacts(){
        System.out.println("There are " + myContacts.size() + " contact(s) in your phone book.");
        for (int i=0; i<myContacts.size();i++){
            System.out.println(i+1 + " " +myContacts.get(i).getName()+ " " + " with name " + myContacts.get(i).getNumber());
        }
    }

    public boolean isPresent(String name){
        for (int i=0;i<myContacts.size();i++){
            if (myContacts.get(i).getName().equals(name)){
                return true;
            }
        }return false;
    }

    public int getIndex (String name){
        if (isPresent(name)){
            for (int i=0;i<myContacts.size();i++){
                Contact indexTemp = myContacts.get(i);
                if (name.equals(indexTemp.getName())){
                    return i;
                }
            }
        } return -1;
    }

    public void removeContact(String name){
        if (getIndex(name) == -1){
            System.out.println("Contact not found dawg!");
        } else myContacts.remove(getIndex(name));
        System.out.println("Contact with name " + name + " removed!");

    }

    public void updateExistingContact(String name, String newValue){
        Contact tempContact = new Contact(name,newValue);
        int position = getIndex(name);
        for (int i=0; i < myContacts.size();i++){
            myContacts.set(position,tempContact);
            }
        }
    }