package org.example.l6_1;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class CalculatriceTest3 {

    private int a;
    private int b;
    private int resultatAttendu;

    public CalculatriceTest3(int a, int b, int resultatAttendu) {
        this.a = a;
        this.b = b;
        this.resultatAttendu = resultatAttendu;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                { 1, 2, 3 },
                { 5, 3, 8 },
                { 10, 20, 30 }
        });
    }

    @Test
    public void testAdditionner() {
        Calculatrice calculatrice = new Calculatrice();
        assertEquals(resultatAttendu, calculatrice.additionner(a, b));
    }
}
