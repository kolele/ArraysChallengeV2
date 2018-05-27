package com.kole;

public class Contact {
    private String name;
    private int number;

    public Contact(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public Contact addContact(String name, int number){
        return new Contact(name,number);
    }
}
