package com.leapyears;

public class LeapYearsCalculator {


    public boolean isLeapYear(int year) {
        boolean isLeapYear = false;

        if(year % 400 == 0){
            isLeapYear = true;
        }
        if(year % 4 == 0 && year % 100 != 0){
            isLeapYear = true;
        }

        return isLeapYear;
    }
}
