package com.pluralsight.streams;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();

        people.add(new Person("Queen", "Golden", 28));
        people.add(new Person("Stephanie", "Bonilla", 34));
        people.add(new Person("Sylvia", "Hartman", 45));
        people.add(new Person("Nikki", "Powell", 22));
        people.add(new Person("Lenny", "Rowe", 31));
        people.add(new Person("Jaime", "Hines", 27));
        people.add(new Person("Luella", "Strong", 40));
        people.add(new Person("Owen", "Moses", 36));
        people.add(new Person("Lane", "Lloyd", 30));
        people.add(new Person("Patrica", "Baxter", 38));

        // Display all names
        for (Person person : people) {
                System.out.println(person);
        }

        String searchName = "lane";

        // Display the name of person lane only
        for (Person person : people) {
            if (person.getFirstName().equalsIgnoreCase(searchName))
                System.out.println("Match found" + person);
        }

    }

}

