package org.example.l3_5;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class ValidateurTest {

    @ParameterizedTest
    @ValueSource(strings = {"12345", "67890", "00000"})
    public void testEstCodeValide(String code) {
        Validateur validateur = new Validateur();
        assertTrue(validateur.estValide(code));
    }

    @ParameterizedTest
    @ValueSource(strings = {""})
    public void testEstCodeInvalide(String code) {
        Validateur validateur = new Validateur();
        assertFalse(validateur.estValide(code));
    }
}
