package org.example.l3_2;

import static org.junit.Assert.*;
import org.example.l2_1.Calculatrice;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatriceTest3 {

    private Calculatrice calculatrice;

    @Before
    public void setUp() {
        calculatrice = new Calculatrice();
    }

    @Test
    public void testAdditionner() {
        assertEquals(8, calculatrice.additionner(5, 3));
    }

    @After
    public void tearDown() {
        calculatrice = null;
    }
}
