package org.example.l3_2;

import static org.junit.Assert.*;

import org.example.l2_1.Calculatrice;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatriceTest5 {

    private static Calculatrice calculatrice;

    @BeforeClass
    public static void setUpClass() {
        calculatrice = new Calculatrice();
    }

    @Test
    public void testAdditionner() {
        assertEquals(8, calculatrice.additionner(5, 3));
    }

    @AfterClass
    public static void tearDownClass() {
        calculatrice = null;
    }
}
