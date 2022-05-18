import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LeapYearTest {
    /*
    business rule's:
    A year is not a leap year if not divisible by 4
    A year is a leap year if divisible by 4
    A year is a leap year if divisible by 400
    A year is not a leap year if divisible by 100 but not by 400
     */
    @Test
    void not_be_leap_year_if_not_divisible_by_4() {
        assertThat(leapYear(1997)).isFalse();
    }

    @Test
    void leap_year_if_divisible_by_4() {
        assertThat(leapYear(1996)).isTrue();
    }

    @Test
    void is_leap_year_if_divisible_by_400() {
        assertThat(leapYear(1600)).isTrue();
    }

    @Test
    void is_not_leap_year_if_divisible_by_100_but_not_divisible_by_400() {
        assertThat(leapYear(1800)).isFalse();
    }

    private boolean leapYear(int year){
        return new Year(year).isLeapYear();
    }
}
