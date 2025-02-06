package com.wipro.java.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

// AnimalComparatorComparable class contains the variables (name) and implements Comparable for natural ordering
public class AnimalComparatorComparable implements Comparable<AnimalComparatorComparable> {
    private String name;

    // Constructor
    public AnimalComparatorComparable(String name) {
        this.name = name;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Implementing compareTo method for Comparable (natural ordering)
    @Override
    public int compareTo(AnimalComparatorComparable a) {
        // Sorting animals by name in ascending alphabetical order (natural order)
        return this.getName().compareTo(a.getName());
    }

    @Override
    public String toString() {
        return name;
    }

  

    public static void main(String[] args) {
        // Creating a list of AnimalComparatorComparable objects
        ArrayList<AnimalComparatorComparable> animals = new ArrayList<>();
        animals.add(new AnimalComparatorComparable("Zebra"));
        animals.add(new AnimalComparatorComparable("Lion"));
        animals.add(new AnimalComparatorComparable("Elephant"));
        animals.add(new AnimalComparatorComparable("Cat"));

        // Sorting using Comparable (natural ordering)
        Collections.sort(animals);

        // Printing sorted animals using Comparable
        System.out.println("Animals sorted by name using Comparable:");
        for (AnimalComparatorComparable animal : animals) {
            System.out.println(animal);
        }

        // Creating a new list of animals for sorting again
        animals.clear();
        animals.add(new AnimalComparatorComparable("Zebra"));
        animals.add(new AnimalComparatorComparable("Lion"));
        animals.add(new AnimalComparatorComparable("Elephant"));
        animals.add(new AnimalComparatorComparable("Cat"));

        // Sorting using the custom AnimalComparator (Comparator)
        Collections.sort(animals, new AnimalComparator());

        // Printing sorted animals using Comparator
        System.out.println("\nAnimals sorted by name using Comparator:");
        for (AnimalComparatorComparable animal : animals) {
            System.out.println(animal);
        }
    }
}
// AnimalComparator class implements Comparator for custom sorting
class AnimalComparator implements Comparator<AnimalComparatorComparable> {
    @Override
    public int compare(AnimalComparatorComparable a1, AnimalComparatorComparable a2) {
        // Sorting animals by name in ascending alphabetical order
        return a1.getName().compareTo(a2.getName());
    }
}
