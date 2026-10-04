package org.example.l3_5;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class PalindromeTest {

    @ParameterizedTest
    @ValueSource(strings = {"radar", "level", "madam"})
    public void testEstPalindrome(String chaine) {
        assertTrue(Palindrome.estPalindrome(chaine));
    }
}
