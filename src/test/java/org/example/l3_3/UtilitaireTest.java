package org.example.l3_3;

import static org.junit.Assert.*;
import org.junit.Test;

public class UtilitaireTest {

    @Test
    public void testObtenirValeur() {
        Utilitaire utilitaire = new Utilitaire();
        assertNotNull(utilitaire.obtenirValeur("valide")); // Vérifie que la valeur n'est pas null
        assertNull(utilitaire.obtenirValeur("invalide")); // Vérifie que la valeur est null
    }
}