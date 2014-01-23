package org.dbarrera;

import java.util.Scanner;

public class Main {

    static int option = 99;
    static Person p1 = new Person("David", "M", 28);

    public static void main(String[] args) {

        System.out.println(p1.personalData());
        while (option != 0) {
            printMenu();
        }

    }

    private static void printMenu() {

        System.out.println("***********************");
        System.out.println("*   SIMULATION GAME   *");
        System.out.println("***********************");
        System.out.println("* 1) Status           *");
        System.out.println("***********************");
        System.out.println("* 2) Eat              *");
        System.out.println("* 3) Talk             *");
        System.out.println("* 4) Sleep            *");
        System.out.println("* 5) Go to Bathroom   *");
        System.out.println("* 6) Party            *");
        System.out.println("* 7) Exercise         *");
        System.out.println("***********************");
        System.out.println("* 0) Quit             *");
        System.out.println("***********************");
        Scanner sc = new Scanner(System.in);
        option = sc.nextInt();

        switch (option) {
            case 1:
                System.out.println("Status of Sim:");
                System.out.print("Energy:");
                System.out.println(p1.getStamina());
                System.out.print("Hunger:");
                System.out.println(p1.getHunger());
                System.out.print("Social:");
                System.out.println(p1.getSocial());
                System.out.print("Bathroom:");
                System.out.println(p1.getBladder());
                System.out.print("Fun:");
                System.out.println(p1.getFun());
                break;
            case 2:
                if (!p1.tired()) {
                    System.out.println("Eating...");
                    p1.eat();
                } else {
                    System.out.println(p1.iWantToSleep());
                }
                break;
            case 3:
                if (!p1.tired()) {
                    System.out.println("Talking...");
                    System.out.println(p1.talk());
                    p1.talk();
                } else {
                    System.out.println(p1.iWantToSleep());
                }
                break;
            case 4:
                System.out.println("Sleeping...");
                p1.sleep();
                break;
            case 5:
                if (!p1.tired()) {
                    System.out.println("Taking a leak...");
                    p1.goToBathroom();
                } else {
                    System.out.println(p1.iWantToSleep());
                }
                break;
            case 6:
                if (!p1.tired()) {
                    System.out.println("Partying...");
                    p1.party();
                } else {
                    System.out.println(p1.iWantToSleep());
                }
                break;
            case 7:
                if (!p1.tired()) {
                    System.out.println("Doing exercise...");
                    p1.exercise();
                } else {
                    System.out.println(p1.iWantToSleep());
                }
                break;
            default:
                System.out.println("Sorry, I don't understand the command... Try Again!");
        }
    }
}
