package main.java;

import java.util.Random;

public class Kotik {
    static int count = 0;
    static final int METHODS = 5;
    private String name;
    private String voice;
    private int satiety;
    private int weight;

    public Kotik() {
        count++;
    }

    public Kotik(String name, String voice, int satiety, int weight) {
        this.name = name;
        this.voice = voice;
        this.satiety = satiety;
        this.weight = weight;
        count++;
    }

    public static int getCount() {
        return count;
    }

    public String getName() {
        return name;
    }

    public String getVoice() {
        return voice;
    }

    public int getSatiety() {
        return satiety;
    }

    public int getWeight() {
        return weight;
    }

    public static void setCount(int count) {
        Kotik.count = count;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVoice(String voice) {
        this.voice = voice;
    }

    public void setSatiety(int satiety) {
        this.satiety = satiety;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    boolean play() {
        if (satiety > 0) {
            System.out.println("I'm playing!");
            satiety--;
            return true;
        } else {
            System.out.println("I want to eat!");
            return false;
        }
    }

    boolean sleep() {
        if (satiety > 0) {
            System.out.println("I'm sleeping...");
            satiety--;
            return true;
        } else {
            System.out.println("I want to eat!");
            return false;
        }
    }

    boolean wash() {
        if (satiety > 0) {
            System.out.println("I'm washing!");
            satiety--;
            return true;
        } else {
            System.out.println("I want to eat!");
            return false;
        }
    }

    boolean walk() {
        if (satiety > 0) {
            System.out.println("I'm walking!");
            satiety--;
            return true;
        } else {
            System.out.println("I want to eat!");
            return false;
        }
    }

    boolean hunt() {
        if (satiety > 0) {
            System.out.println("I'm hunt!");
            satiety--;
            return true;
        } else {
            System.out.println("I want to eat!");
            return false;
        }
    }

    void eat(int satiety) {
        this.satiety += satiety;
    }

    void eat(String food, int satiety) {
        System.out.println("I'm eating " + food);
        this.satiety += satiety;
    }

    void eat() {
        eat("Meat", 5);
    }

    String[] liveAnotherDay() {
        String[] dayOfCat = new String[5];
        for (int i = 0; i < 24; i++) {
            Random rnd = new Random();
            int toDo = rnd.nextInt(METHODS);
            System.out.println("Method " + toDo);
            boolean satiety = true;
            switch (toDo) {
                case 0:
                    if (play())
                        dayOfCat[i] = "играл";
                    else
                        satiety = false;
                    break;
                case 1:
                    if (sleep())
                        dayOfCat[i] = "спал";
                    else
                        satiety = false;
                    break;
                case 2:
                    if (wash())
                        dayOfCat[i] = "умывался";
                    else
                        satiety = false;
                    break;
                case 3:
                    if (walk())
                        dayOfCat[i] = "гулял";
                    else
                        satiety = false;
                    break;
                case 4:
                    if (hunt())
                        dayOfCat[i] = "охотился";
                    else
                        satiety = false;
                    break;
            }
            if (!satiety){
                eat();
                dayOfCat[i]="ел";
            }
        }
        return dayOfCat;
    }
}
