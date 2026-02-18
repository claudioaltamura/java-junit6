package de.claudioaltamura.java.junit6;

import org.junit.jupiter.api.RepeatedTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

class RepeatedTestExampleTest {

    private final RepeatedTestExample repeatedTestExample = new RepeatedTestExample();

    @RepeatedTest(value = 10,
            name = "test {currentRepetition} of {totalRepetitions}",
            failureThreshold = 4)
    void repeatedTestWithExecute() {
        var ret = repeatedTestExample.execute();
        System.out.println("isSuccessful() returned: " + ret);
        assertTrue(ret, "execute() should return true");
    }
}
