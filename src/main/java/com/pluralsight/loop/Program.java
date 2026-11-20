package com.pluralsight.loop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Albert", "Zion", 30));
        people.add(new Person("Betty", "Young", 40));
        people.add(new Person("Carson", "Xander", 34));
        people.add(new Person("Daniel", "Wilson", 26));
        people.add(new Person("Eric", "Vince", 38));
        people.add(new Person("Frank", "Tucker", 41));
        people.add(new Person("Gloria", "Stevens", 48));
        people.add(new Person("Helen", "Rogers", 32));
        people.add(new Person("India", "Quinten", 29));
        people.add(new Person("Jordan", "Parker", 42));
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a first or last name to search: ");
        String searchName = scanner.nextLine();
        List<Person> matches = new ArrayList<>();
        for (Person person : people) {
            if (person.getFirstName().equalsIgnoreCase(searchName)
                    || person.getLastName().equalsIgnoreCase(searchName)) {
                matches.add(person);
            }
        }
        System.out.println("\nSearch Results:");
        if (matches.size() == 0) {
            System.out.println("No matches found.");
        } else {
            for (Person person : matches) {
                System.out.println(person);
            }
        }

        int totalAge = 0;
        for (Person person : people) {
            totalAge += person.getAge();
        }
        double averageAge = (double) totalAge / people.size();
        System.out.printf("\nAverage Age: %.2f%n", averageAge);