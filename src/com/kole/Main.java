package com.kole;

public class Main{
    public static void main(String[] args) {
        MobilePhone mobilePhone = new MobilePhone("Koletov", 123456);
        mobilePhone.addContact("Kole", 15975);
        mobilePhone.addContact("Kole", 15975);
        mobilePhone.printContacts();
    }
}