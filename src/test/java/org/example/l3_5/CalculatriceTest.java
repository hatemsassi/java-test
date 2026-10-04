package org.example.l3_5;

import static org.junit.Assert.*;

import org.example.l2_1.Calculatrice;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class CalculatriceTest {

    private int a;
    private int b;
    private int resultatAttendu;

    public CalculatriceTest(int a, int b, int resultatAttendu) {
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
