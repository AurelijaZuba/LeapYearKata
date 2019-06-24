package com.codurance;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class LeapYearShould {
    @Test
    void return_false_if_not_divisible_by_4() {
        LeapYear leapYear = new LeapYear();
        assertThat(leapYear.isLeapYear(1997)).isEqualTo(false);
    }

    @Test
    void return_true_if_divisible_by_4() {
        LeapYear leapYear = new LeapYear();
        assertThat(leapYear.isLeapYear(1996)).isEqualTo(true);
    }

    @Test
    void return_true_if_divisible_by_400() {
        LeapYear leapYear = new LeapYear();
        assertThat(leapYear.isLeapYear(1600)).isEqualTo(true);
    }
}
