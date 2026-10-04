package org.example.l3_4;

import static org.junit.Assert.*;
import org.junit.Test;

public class ValidateurTest {

    @Test(expected = IllegalArgumentException.class)
    public void testValiderAgeAvecAgeNegatif() {
        Validateur validateur = new Validateur();
        validateur.validerAge(-5); // Doit lever une IllegalArgumentException
    }
}
