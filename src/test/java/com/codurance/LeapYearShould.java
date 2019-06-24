package com.codurance;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class LeapYearShould {

    private LeapYear leapYear;

    @BeforeEach
    void setUp() {
        leapYear = new LeapYear();
    }

    @ParameterizedTest
    @CsvSource({
            "1997, false",
            "1996, true",
            "1600, true",
            "200, true",
            "1800, false"
    })
    void identify_leap_year(int year, boolean expected) {
        assertThat(leapYear.isLeapYear(year)).isEqualTo(expected);
    }
}
