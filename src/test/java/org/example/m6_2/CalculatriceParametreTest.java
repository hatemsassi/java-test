package org.example.m6_2;

// Test paramétré avec plus de scénarios
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class CalculatriceParametreTest {

    private final int a;
    private final int b;
    private final int resultatAttendu;
    private final Calculatrice calculatrice = new Calculatrice();

    public CalculatriceParametreTest(int a, int b, int resultatAttendu) {
        this.a = a;
        this.b = b;
        this.resultatAttendu = resultatAttendu;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                { 1, 2, 3 },
                { 5, 3, 8 },
                { -2, -3, -5 },
                { 100, 200, 300 }
        });
    }

    @Test
    public void testAdditionner() {
        assertEquals(resultatAttendu, calculatrice.additionner(a, b));
    }
}
