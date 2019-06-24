package com.codurance;

public class LeapYear {
    public boolean isLeapYear(int year) {
        if(isDivisibleBy100(year) && !isDivisibleBy400(year))
            return false;
        if(isDivisibleBy4(year))
            return true;
        return false;
    }

    private boolean isDivisibleBy400(int year) {
        return year % 400 == 0;
    }

    private boolean isDivisibleBy100(int year) {
        return year % 100 == 0;
    }

    private boolean isDivisibleBy4(int year) {
        return year % 4 == 0;
    }
}
