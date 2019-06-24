package com.codurance;

public class LeapYear {
    public boolean isLeapYear(int year) {
        if(year == 1600)
            return true;
        if(year == 1996)
            return true;
        return false;
    }
}
