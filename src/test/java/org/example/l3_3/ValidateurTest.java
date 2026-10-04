package org.example.l3_3;

import static org.junit.Assert.*;
import org.junit.Test;

public class ValidateurTest {

    @Test
    public void testEstPair() {
        Validateur validateur = new Validateur();
        assertTrue(validateur.estPair(4)); // Vérifie que 4 est pair
        assertFalse(validateur.estPair(5)); // Vérifie que 5 n'est pas pair
    }
}
