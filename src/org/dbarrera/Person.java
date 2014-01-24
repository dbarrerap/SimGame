package org.dbarrera;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Docentes on 23/01/14.
 */
public class Person {
    private final static int MAX_ATTR = 10;
    private final static int DEF_ATTR = 5;
    private final static int MIN_ATTR = 1;

    private ArrayList<String> phrases = new ArrayList<String>();
    private Random rn = new Random();

    private String name, gender;
    private int age, stamina, hunger, social, bladder, fun;

    public Person() {
        stamina = MAX_ATTR;
        hunger = social = fun = DEF_ATTR;
        bladder = MIN_ATTR;
        setPhrases();
    }

    public Person(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;

        stamina = MAX_ATTR;
        hunger = social = fun = DEF_ATTR;
        bladder = MIN_ATTR;
        setPhrases();
    }

    private void setPhrases() {
        phrases.add("How you doin'?");
        phrases.add("There's a snake in my boot!");
        phrases.add("To infinity and beyond!");
        phrases.add("Hi!");
        phrases.add("...");
        phrases.add("Snake? Snake! SNAAAKEEE!!!");
        phrases.add("Frankly, my dear, I don't give a damn.");
        phrases.add("Toto, I've got a feeling we're not in Kansas anymore.");
        phrases.add("Go ahead, make my day.");
        phrases.add("Fasten your seatbelts. It's going to be a bumpy night.");
        phrases.add("Show me the money!");
    }

    public int getStamina() {
        return stamina;
    }

    public int getHunger() {
        return hunger;
    }

    public int getSocial() {
        return social;
    }

    public int getBladder() {
        return bladder;
    }

    public int getFun() {
        return fun;
    }

    public void setPersonalData(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public void eat() {
        hunger -= 7;
        if (hunger < 0)
            hunger = 0;
        stamina -= 2;
        if (stamina < 0)
            stamina = 0;
        bladder += 3;
        if (bladder > MAX_ATTR)
            bladder = MAX_ATTR;
        social -= 1;
        if (social < 0)
            social = 0;
        fun -= 2;
        if (fun < 0)
            fun = 0;
    }

    public void sleep() {
        stamina = MAX_ATTR;
        hunger += 2;
        if (hunger > MAX_ATTR)
            hunger = MAX_ATTR;
        bladder += 4;
        if (bladder > MAX_ATTR)
            bladder = MAX_ATTR;
        social -= 3;
        if (social < 0)
            social = 0;
        fun -= 3;
        if (fun < 0)
            fun = 0;
    }

    public String talk() {
        social += 3;
        if (social > MAX_ATTR)
            social = MAX_ATTR;
        stamina -= 1;
        if (stamina < 0)
            stamina = 0;
        bladder += 1;
        if (bladder > MAX_ATTR)
            bladder = MAX_ATTR;
        return phrases.get(rn.nextInt(phrases.size()));
    }

    public void goToBathroom() {
        bladder = 0;
        stamina -= 1;
        if (stamina < 0)
            stamina = 0;
        fun -= 1;
        if (fun < 0)
            fun = 0;
        social -= 1;
        if (social < 0)
            social = 0;
    }

    public void party() {
        fun += 6;
        if (fun > MAX_ATTR)
            fun = MAX_ATTR;
        stamina -= 4;
        if (stamina < 0)
            stamina = 0;
        bladder += 3;
        if (bladder > MAX_ATTR)
            bladder = MAX_ATTR;
    }

    public void exercise() {
        stamina -= 6;
        if (stamina < 0)
            stamina = 0;
        fun -= 4;
        if (fun < 0)
            fun = 0;
        social -= 2;
        if (social < 0)
            social = 0;
        hunger += 3;
        if (hunger > MAX_ATTR)
            hunger = MAX_ATTR;
    }

    public boolean tired() {
        return stamina <= 1;
    }

    public boolean hungry() {
        return hunger >= 9;
    }

    public String iWantToSleep() {
        return "I want to sleep!!!";
    }

    public String iWantToEat() {
        return "I want to eat!!!";
    }

    public String getPersonalData() {
        return name + ", " + gender + ", " + age;
    }
}