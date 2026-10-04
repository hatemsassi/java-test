package org.example.l6_1_1;

// Tests unitaires améliorés avec des cas plus complexes
import static org.junit.Assert.*;
import org.junit.Test;

public class CalculatriceTest {

    private final Calculatrice calculatrice = new Calculatrice();

    @Test
    public void testAdditionner() {
        assertEquals(5, calculatrice.additionner(2, 3));
        assertEquals(-1, calculatrice.additionner(2, -3));
        assertEquals(Integer.MAX_VALUE, calculatrice.additionner(Integer.MAX_VALUE, 0));
    }

    @Test
    public void testSoustraire() {
        assertEquals(1, calculatrice.soustraire(4, 3));
        assertEquals(-7, calculatrice.soustraire(3, 10));
    }

    @Test
    public void testMultiplier() {
        assertEquals(6, calculatrice.multiplier(2, 3));
        assertEquals(0, calculatrice.multiplier(0, 5));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDiviserParZero() {
        calculatrice.diviser(10, 0);
    }

    @Test
    public void testPuissance() {
        assertEquals(8.0, calculatrice.puissance(2, 3), 0.001);
        assertEquals(1.0, calculatrice.puissance(5, 0), 0.001);
    }

    @Test
    public void testPourcentage() {
        assertEquals(20.0, calculatrice.pourcentage(200, 10), 0.001);
        assertEquals(50.0, calculatrice.pourcentage(1000, 5), 0.001);
    }
}