package de.claudioaltamura.java.junit6;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;
import org.junit.jupiter.api.function.ThrowingConsumer;

import static de.claudioaltamura.java.junit6.StringUtils.isPalindrome;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Stream;

class DynamicTestDemoTest {
    private final Calculator calculator = new Calculator();

    @TestFactory
    Iterable<DynamicTest> dynamicTestsFromIterable() {
        return Arrays.asList(
            dynamicTest("1st dynamic test", () -> assertEquals(4, calculator.add(2, 2))),
            dynamicTest("2nd dynamic test", () -> assertEquals(8, calculator.add(4, 4)))
        );
    }

    @TestFactory
    Stream<DynamicTest> dynamicTestsFromStreamFactoryMethod() {
        // Stream of palindromes to check
        Stream<String> inputStream = Stream.of("racecar", "radar", "mom", "dad");

        // Generates display names like: racecar is a palindrome
        Function<String, String> displayNameGenerator = text -> text + " is a palindrome";

        // Executes tests based on the current input value.
        ThrowingConsumer<String> testExecutor = text -> assertTrue(isPalindrome(text));

        // Returns a stream of dynamic tests.
        return DynamicTest.stream(inputStream, displayNameGenerator, testExecutor);
    }
}
