package org.example.l3_4;

import static org.junit.Assert.*;
import org.junit.Test;

public class ValidateurTest2 {

    @Test
    public void testValiderAgeAvecAgeNegatif() {
        Validateur validateur = new Validateur();
        try {
            validateur.validerAge(-5);
            fail("Une exception aurait dû être levée");
        } catch (IllegalArgumentException e) {
            assertEquals("L'âge ne peut pas être négatif", e.getMessage()); // Vérifie le message d'erreur
        }
    }
}
