package com.company;


// Dem so chan cua cac con vat trong nong trai
// bo 4 chan
// ga 2 chan
// cáo 4 chan
// ocSen 0 chan

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Animal> animalList = new ArrayList<Animal>();
        int sumOfLegs = 0;
        Scanner scanner = new Scanner(System.in);
        int numberOfAnimals = scanner.nextInt();
        for (int i = 0; i < numberOfAnimals; i++) {
            int givenBirth = scanner.nextInt();
            Animal animal;
            switch (givenBirth) {
                case 0: animal = new Cow();
                case 1: animal = new Chicken();
                default: animal = new Chicken();
            }

            animalList.add(animal);
        }
        for (int i = 0; i < animalList.size(); i++) {
            sumOfLegs += animalList.get(i).get_leg();
        }
        System.out.println(sumOfLegs);
    }
}
