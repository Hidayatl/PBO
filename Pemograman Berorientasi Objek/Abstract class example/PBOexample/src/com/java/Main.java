package com.java;

public class Main {
    public static void main(String[] args) {
        Animal tiger = new Tiger();
        tiger.animalVoice();

        Animal wolf = new Wolf();
        wolf.animalVoice();

        Animal.sleep();
    }
}
