package org.example.l6_1;

import static org.junit.Assert.*;
import org.junit.Test;

public class CalculatriceTest {

    @Test
    public void testAdditionner() {
        Calculatrice calculatrice = new Calculatrice();
        assertEquals(5, calculatrice.additionner(2, 3));
    }

    @Test
    public void testSoustraire() {
        Calculatrice calculatrice = new Calculatrice();
        assertEquals(1, calculatrice.soustraire(4, 3));
    }

    @Test
    public void testMultiplier() {
        Calculatrice calculatrice = new Calculatrice();
        assertEquals(6, calculatrice.multiplier(2, 3));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDiviserParZero() {
        Calculatrice calculatrice = new Calculatrice();
        calculatrice.diviser(10, 0);
    }
}
