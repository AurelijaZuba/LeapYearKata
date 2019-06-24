package com.codurance;

public class LeapYear {
    public boolean isLeapYear(int year) {
        if(year % 100 == 0 && year % 400 != 0)
            return false;
        if(isDivisibleBy4(year))
            return true;
        return false;
    }

    private boolean isDivisibleBy4(int year) {
        return year % 4 == 0;
    }
}
