package com.kole;

import java.util.Scanner;

public class Main{

    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("Koletov", 123456);

    public static void main(String[] args) {


        boolean quit = false;
        printInstructions();



        while (!quit){

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 0:
                    printInstructions();
                    break;
                case 1:
                    mobilePhone.printContacts();
                    break;
                case 2:
                    addContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    searchContact();
                    break;
                case 6:
                    quit=true;
                    break;
            }

        }
    }

    private static void printInstructions(){
        System.out.println("Enter your choice:");
        System.out.println("0 To print this menu");
        System.out.println("1 to print list of contacts");
        System.out.println("2 to add new contact");
        System.out.println("3 to modify contact");
        System.out.println("4 to remove contact");
        System.out.println("5 to Search contact");
        System.out.println("6 to quit app");
    }

    private static void addContact(){
        System.out.println("Please enter contact name to add");
        String name = scanner.nextLine();
        System.out.println("Please enter contact number to add");
        int number = scanner.nextInt();
        mobilePhone.addContact(name,number);
    }

    private static void updateContact(){
        System.out.println("Please enter contact name");
        String name = scanner.nextLine();
        System.out.println("Please enter contact number");
        int number = scanner.nextInt();
        mobilePhone.updateContact(name,number);
    }

    private static void searchContact(){
        System.out.println("Please enter contact name");
        String name = scanner.nextLine();
        mobilePhone.searchForContact(name);
    }

    private static void removeContact(){
        System.out.println("Please enter contact name");
        String name = scanner.nextLine();
        mobilePhone.removeContact(name);
    }
}