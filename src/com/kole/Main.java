package com.kole;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        MobilePhone mobilePhone = new MobilePhone("123");


        boolean quit = false;

        while (!quit){
            System.out.println("Please enter your choice");
            int choice = scanner.nextInt();


            switch (choice){
                case 0:
                    printInstructions();
                    break;
                case 1:
                    mobilePhone.addContact(scanner.nextLine(), scanner.nextLine());
                    break;
                case 2:
                    mobilePhone.removeContact(scanner.nextLine());
                    break;
                case 3:
                    mobilePhone.updateExistingContact(scanner.nextLine(),scanner.nextLine());
                    break;
                case 4:
                    quit=true;
                    System.out.println("Quitting app");
                    break;
                case 5:
                    startPhone();
                    break;
                case 6:
                    mobilePhone.printContacts();
                    break;
                }
        }

    }

    private static void printInstructions(){
        System.out.println("EVO INSTRUKCIJA");
    }

    private static void startPhone(){
        System.out.println("Phone starting...");
    }

    private static void addNewContact(){
        System.out.println("Enter name and number to add new contact");

    }
}