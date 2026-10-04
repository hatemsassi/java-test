package org.example.l3_4;

import static org.junit.Assert.*;
import org.junit.Test;

public class ValidateurTest4 {

    @Test(expected = IllegalArgumentException.class)
    public void testValiderValeurNegative() {
        Validateur4 validateur = new Validateur4();
        validateur.validerValeur(-5); // Doit lever une IllegalArgumentException
    }

    @Test
    public void testValiderValeurTropGrande() {
        Validateur4 validateur = new Validateur4();
        try {
            validateur.validerValeur(150);
            fail("Une exception aurait dû être levée");
        } catch (IllegalArgumentException e) {
            assertEquals("La valeur ne peut pas dépasser 100", e.getMessage());
        }
    }
}
