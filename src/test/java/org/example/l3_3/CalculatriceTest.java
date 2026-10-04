package org.example.l3_3;

import static org.junit.Assert.*;

import org.example.l2_1.Calculatrice;
import org.junit.Test;

public class CalculatriceTest {

    @Test
    public void testAdditionner() {
        Calculatrice calculatrice = new Calculatrice();
        int resultatAttendu = 8;
        int resultatObtenu = calculatrice.additionner(5, 3);
        assertEquals(resultatAttendu, resultatObtenu);
    }
}
