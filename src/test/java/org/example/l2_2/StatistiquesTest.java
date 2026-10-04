package org.example.l2_2;

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.Arrays;
import java.util.List;


public class StatistiquesTest {
    @Test
    public void testCalculerMoyenne() {
        Statistiques statistiques = new Statistiques();
        List<Double> nombres = Arrays.asList(10.0, 20.0, 30.0);
        assertEquals(20.0, statistiques.calculerMoyenne(nombres), 0.001);
    }
}
