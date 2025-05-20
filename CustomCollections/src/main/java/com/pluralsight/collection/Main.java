package com.pluralsight.collection;

import java.time.LocalDate;
import java.time.Year;

public class Main {
    public static void main(String[] args) {
        FixedList<Integer> numbers = new FixedList<>(3);
        numbers.add(10);
        numbers.add(3);
        numbers.add(92);
        numbers.add(43); // this line should fail
        System.out.println(numbers.getItems().size());
        System.out.println("List of numbers: " + numbers.getItems());
        FixedList<LocalDate> dates = new FixedList<>(2);
        dates.add(LocalDate.now());
        dates.add(LocalDate.now());
        dates.add(null);
        dates.add(LocalDate.of(2020, 12, 27));
        System.out.println("List of dates: " + dates.getItems());
        System.out.println("Date list size: " + dates.getItems().size());

    }
}
