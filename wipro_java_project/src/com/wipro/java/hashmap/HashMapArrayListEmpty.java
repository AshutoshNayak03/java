package com.wipro.java.hashmap;

import java.util.ArrayList;

class HashMapArrayListEmpty {
    public static void main(String[] args) {
        // create an ArrayList
        ArrayList<String> languages = new ArrayList<>();
        System.out.println("Newly Created ArrayList: " + languages);

        // checks if the ArrayList has any element
        boolean result = languages.isEmpty(); // true
        System.out.println("Is the ArrayList empty? " + result);

        // add some elements to the ArrayList
        languages.add("Python");
        languages.add("Java");
        System.out.println("Updated ArrayList: " + languages);

        // checks if the ArrayList is empty
        result = languages.isEmpty();  // false
        System.out.println("Is the ArrayList empty? " + result);
    }
}