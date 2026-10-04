package org.example.l3_2;

import static org.junit.Assert.*;
import org.example.l2_1.Calculatrice;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatriceTest4 {

    private static Calculatrice calculatrice;

    @BeforeClass
    public static void setUpClass() {
        calculatrice = new Calculatrice();
    }

    @Test
    public void testAdditionner() {
        assertEquals(8, calculatrice.additionner(5, 3));
    }

    @Test
    public void testSoustraire() {
        assertEquals(2, calculatrice.soustraire(5, 3));
    }
}
