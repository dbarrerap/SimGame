package org.dbarrera;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by dbarrera on 1/21/14.
 */
public class Person {

    static int MAX_ATTR = 100;
    static int DEF_ATTR = 50;

    ArrayList<String> phrases = new ArrayList<String>();
    Random rn = new Random();

    String name, gender;
    int age, stamina, hunger, social, bladder, fun;

    public Person() {
        stamina = hunger = social = bladder = fun = DEF_ATTR;
        setPhrases();
    }

    public Person(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;

        stamina = hunger = social = bladder = fun = DEF_ATTR;
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

    public void eat() {
        this.hunger -= rn.nextInt(75);
        if (this.hunger < 0)
            this.hunger = 0;
        this.stamina -= rn.nextInt(10);
        if (this.stamina < 0)
            this.stamina = 0;
        this.bladder += rn.nextInt(10);
        if (this.bladder > MAX_ATTR)
            this.bladder = MAX_ATTR;
        this.social -= rn.nextInt(25);
        if (this.social < 0)
            this.social = 0;
    }

    public void sleep() {
        this.stamina = MAX_ATTR;
        this.hunger += rn.nextInt(25);
        if (this.hunger > MAX_ATTR)
            this.hunger = MAX_ATTR;
        this.bladder += rn.nextInt(45);
        if (this.bladder > MAX_ATTR)
            this.bladder = MAX_ATTR;
        this.social -= rn.nextInt(35);
        if (this.social < 0)
            this.social = 0;
    }

    public String talk() {
        this.social += rn.nextInt(45);
        if (this.social > MAX_ATTR)
            this.social = MAX_ATTR;
        this.stamina -= rn.nextInt(10);
        if (this.stamina < 0)
            this.stamina = 0;
        this.bladder += rn.nextInt(10);
        if (this.bladder > MAX_ATTR)
            this.bladder = MAX_ATTR;
        return phrases.get(rn.nextInt(phrases.size()));
    }

    public void goToBathroom() {
        this.bladder = 0;
        this.stamina -= rn.nextInt(10);
        if (this.stamina < 0)
            this.stamina = 0;
        this.fun -= rn.nextInt(10);
        if (this.fun < 0)
            this.fun = 0;
        this.social -= rn.nextInt(15);
        if (this.social < 0)
            this.social = 0;
    }

    public void party() {
        this.fun += rn.nextInt(65);
        if (this.fun > MAX_ATTR)
            this.fun = MAX_ATTR;
        this.stamina -= rn.nextInt(25);
        if (this.stamina < 0)
            this.stamina = 0;
        this.bladder += rn.nextInt(25);
        if (this.bladder > MAX_ATTR)
            this.bladder = MAX_ATTR;
    }

    public void exercise() {
        this.stamina -= rn.nextInt(75);
        if (this.stamina < 0)
            this.stamina = 0;
        this.fun -= rn.nextInt(25);
        if (this.fun < 0)
            this.fun = 0;
        this.social -= rn.nextInt(15);
        if (this.social < 0)
            this.social = 0;
    }

    public boolean tired() {
        return this.stamina < 15;
    }

    public String iWantToSleep() {
        return "I want to sleep!!!";
    }

    public String personalData() {
        return this.name + ", " + this.gender + ", " + this.age;
    }
}
