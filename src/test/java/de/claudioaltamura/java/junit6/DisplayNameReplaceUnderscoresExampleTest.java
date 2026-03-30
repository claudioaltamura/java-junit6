package de.claudioaltamura.java.junit6;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class DisplayNameReplaceUnderscoresExampleTest {

    @Test
    void if_it_is_zero() {
        assertTrue(true, "This test should pass for year 0");
    }

    @DisplayName("A negative value for year is not supported by the leap year computation.")
    @ParameterizedTest(name = "For example, year {0} is not supported.")
    @ValueSource(ints = { -1, -4 })
    void if_it_is_negative(int year) {
        assertTrue(year < 0, "This test should pass for negative years");
    }

}
