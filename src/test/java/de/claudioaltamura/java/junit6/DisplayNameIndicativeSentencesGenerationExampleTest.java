package de.claudioaltamura.java.junit6;

import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class DisplayNameIndicativeSentencesGenerationExampleTest {


    @Test
    void if_it_is_divisible_by_4_but_not_by_100() {
        assertTrue(true, "This test should pass for years divisible by 4 but not by 100");
    }

    @ParameterizedTest(name = "Year {0} is a leap year.")
    @ValueSource(ints = { 2016, 2020, 2048 })
    void if_it_is_one_of_the_following_years(int year) {
        assertTrue(year % 4 == 0 && year % 100 != 0, "This test should pass for leap years");
    }

}
