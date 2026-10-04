package org.example.l3_2;

import static org.junit.Assert.*;
import org.example.l2_1.Calculatrice;
import org.junit.Test;

public class CalculatriceTest {

    @Test
    public void testAdditionner() {
        Calculatrice calculatrice = new Calculatrice();
        assertEquals(8, calculatrice.additionner(5, 3));
    }
}
