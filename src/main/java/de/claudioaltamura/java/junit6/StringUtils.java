package de.claudioaltamura.java.junit6;

import static java.util.Objects.requireNonNull;

public class StringUtils {

    private StringUtils() {
    }

    public static boolean isPalindrome(String candidate) {
        int length = requireNonNull(candidate).length();
        for (int i = 0; i < length / 2; i++) {
            if (candidate.charAt(i) != candidate.charAt(length - (i + 1))) {
                return false;
            }
        }
        return true;
    }

}
