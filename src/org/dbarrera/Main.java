package org.dbarrera;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Setup basic variables and objects
        int option = 99;
        Person p1 = new Person();
        Scanner sc = new Scanner(System.in);

        // Initialize Person object
        System.out.print("Type in the name: ");
        p1.setName(sc.nextLine());
        System.out.print("Type in the gender: ");
        p1.setGender(sc.nextLine());
        System.out.print("Finally, type in the age: ");
        p1.setAge(sc.nextInt());

        //Show main menu and interaction
        while (option != 0) {
            System.out.println("***********************");
            System.out.println("Status of Sim:");
            System.out.println(p1.getPersonalData());
            System.out.print("Energy: ");
            System.out.println(p1.getStamina());
            System.out.print("Hunger: ");
            System.out.println(p1.getHunger());
            System.out.print("Social: ");
            System.out.println(p1.getSocial());
            System.out.print("Bathroom: ");
            System.out.println(p1.getBladder());
            System.out.print("Fun: ");
            System.out.println(p1.getFun());
            System.out.println("***********************");
            System.out.println("2) Eat");
            System.out.println("3) Talk");
            System.out.println("4) Sleep");
            System.out.println("5) Go to Bathroom");
            System.out.println("6) Party");
            System.out.println("7) Exercise");
            System.out.println("***********************");
            System.out.println("0) Quit");
            System.out.println("***********************");
            option = sc.nextInt();

            switch (option) {
                case 2:
                    p1.eat();
                    break;
                case 3:
                    if (!p1.tired() || !p1.hungry()) {
                        System.out.println("Talking...");
                        System.out.println(p1.talk());
                        p1.talk();
                    } else {
                        denial(p1);
                    }
                    break;
                case 4:
                    System.out.println("Sleeping...");
                    p1.sleep();
                    break;
                case 5:
                    if (!p1.tired() || !p1.hungry()) {
                        System.out.println("Taking a leak...");
                        p1.goToBathroom();
                    } else {
                        denial(p1);
                    }
                    break;
                case 6:
                    if (!p1.tired() || !p1.hungry()) {
                        System.out.println("Partying...");
                        p1.party();
                    } else {
                        denial(p1);
                    }
                    break;
                case 7:
                    if (!p1.tired() || (!p1.hungry())) {
                        System.out.println("Doing exercise...");
                        p1.exercise();
                    } else {
                        denial(p1);
                    }
                    break;
                default:
                    System.out.println("Sorry, I don't understand the command... Try Again!");
            }
        }
    }

    private static void denial(Person person) {
        if (person.tired())
            System.out.println(person.iWantToSleep());
        if (person.hungry())
            System.out.println(person.iWantToEat());
    }
}