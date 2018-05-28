package com.kole;

public class Main{
    public static void main(String[] args) {
        MobilePhone mobilePhone = new MobilePhone("Koletov", 123456);
        mobilePhone.addContact("Kole", 15975);
        mobilePhone.addContact("Sale", 9586);
        mobilePhone.printContacts();
        mobilePhone.updateContact("Kole", 1111);
        mobilePhone.printContacts();
        mobilePhone.updateContact("Sale", 2222);
        mobilePhone.printContacts();
        mobilePhone.removeContact("Kole");
        mobilePhone.printContacts();
    }
}