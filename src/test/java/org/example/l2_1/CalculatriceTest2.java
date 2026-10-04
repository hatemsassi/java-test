package org.example.l2_1;

import static org.junit.Assert.*;
import org.junit.Test;

public class CalculatriceTest2 {
    @Test
    public void testMultiplier() {
        Calculatrice calculatrice = new Calculatrice();
        assertEquals(15, calculatrice.multiplier(5, 3));
    }
}
