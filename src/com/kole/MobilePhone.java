package com.kole;

import java.util.ArrayList;

public class MobilePhone {
    private String name;
    private int number;
    ArrayList<Contact> contacts;

    public MobilePhone(String name, int number) {
        this.name = name;
        this.number = number;
        this.contacts = new ArrayList<>();
    }

    public void addContact(String name, int number) {
        contacts.add(new Contact(name, number));
    }

    private Contact findContact(String name, int number) {
        Contact checkedContact = new Contact(name, number);
        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).getName().contains(name)) {
                System.out.println("Contact already exists wigga");
                return null;
            } else contacts.add(new Contact(name, number));

        }

        return checkedContact;
    }


}