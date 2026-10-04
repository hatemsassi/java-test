package org.example.l3_4;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ValidateurTest3 {

    @Test
    public void testValiderAgeAvecAgeNegatif() {
        Validateur validateur = new Validateur();
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            validateur.validerAge(-5);
        });
        assertEquals("L'âge ne peut pas être négatif", exception.getMessage()); // Vérifie le message d'erreur
    }
}
