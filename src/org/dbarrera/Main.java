package org.dbarrera;

import java.util.Scanner;

public class Main {

    static int option = 99;
    //static Person p1 = new Person("David", "M", 28);
    static Person p1 = new Person();

    public static void main(String[] args) {

        /*System.out.println(p1.personalData());
        while (option != 0) {
            printMenu();
        }*/

        String name, gender;
        int age;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Set personal data:");
        System.out.print("Name: ");
        name = scanner.nextLine();
        System.out.print("Gender: ");
        gender = scanner.nextLine();
        System.out.print("Age: ");
        age = scanner.nextInt();
        p1.setPersonalData(name, gender, age);
        while (option != 0) {
            printMenu();
        }

    }

    private static void printMenu() {

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
        Scanner sc = new Scanner(System.in);
        option = sc.nextInt();

        switch (option) {
            case 0:
                break;
            /*case 1:
                System.out.println(p1.tired());
                System.out.println(!p1.tired());
                System.out.println(p1.hungry());
                System.out.println(!p1.hungry());
                break;*/
            case 2:
                System.out.println("Eating...");
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

    private static void denial(Person person) {
        if (person.tired())
            System.out.println(person.iWantToSleep());
        if (person.hungry())
            System.out.println(person.iWantToEat());
    }
}