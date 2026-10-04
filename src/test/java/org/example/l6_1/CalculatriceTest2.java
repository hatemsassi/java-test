package org.example.l6_1;

import static org.junit.Assert.*;
import org.junit.Test;

public class CalculatriceTest2 {

    @Test
    public void testAdditionnerAvecNegatifs() {
        Calculatrice calculatrice = new Calculatrice();
        assertEquals(-1, calculatrice.additionner(2, -3));
    }

    @Test
    public void testAdditionnerAvecValeursMaximales() {
        Calculatrice calculatrice = new Calculatrice();
        assertEquals(Integer.MAX_VALUE, calculatrice.additionner(Integer.MAX_VALUE, 0));
    }
}
