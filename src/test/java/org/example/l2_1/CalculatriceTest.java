package org.example.l2_1;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatriceTest {

    @Test
    public void testAdditionner() {
        // Préparer
        Calculatrice calculatrice = new Calculatrice();
        int a = 5;
        int b = 3;
        int resultatAttendu = 8;

        // Agir
        int resultatObtenu = calculatrice.additionner(a, b);

        // Vérifier
        assertEquals(resultatAttendu, resultatObtenu);
    }
}

