package com.leapyears;

public class Main {

    private static LeapYearsCalculator leapYearsCalculator;

    public static void main(String[] args) {

        leapYearsCalculator = new LeapYearsCalculator();

        for(int year = 2010; year <= 2030; year++){

            System.out.println(String.valueOf(year) + ": " + leapYearsCalculator.isLeapYear(year));
        }
    }
}