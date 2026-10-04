package org.example.l4_5;

import static org.junit.Assert.*;

import org.example.l4_5.l4_5_3.ValidateurDeDonnees;
import org.junit.Test;

public class ValidateurDeDonneesTest {

    @Test
    public void testEstValide() {
        ValidateurDeDonnees validateur = new ValidateurDeDonnees();
        assertTrue(validateur.estValide("valide"));
        assertFalse(validateur.estValide(""));
        assertFalse(validateur.estValide(null));
    }
}
