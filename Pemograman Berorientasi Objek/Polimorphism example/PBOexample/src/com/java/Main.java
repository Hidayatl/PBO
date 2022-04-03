package com.java;
    class Animal {
        void eat() {
            System.out.println("eating...");
        }
    }
    class Dog extends Animal {
        void bark() {
            System.out.println("barking...");
        }
    }
    class BabyDog extends Dog {
        void weep() {
            System.out.println("weeping...");
        }
    }
 public class Main {
     public static void main(String args[]) {
         BabyDog d = new BabyDog();
         Dog b = new Dog();
         Animal a = new Animal();
         d.weep();
         b.bark();
         a.eat();
     }
 }