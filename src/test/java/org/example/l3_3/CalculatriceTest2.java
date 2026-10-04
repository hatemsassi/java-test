package org.example.l3_3;

import org.example.l2_1.Calculatrice;
import static org.junit.Assert.*;
import org.junit.Test;

public class CalculatriceTest2 {

    @Test
    public void testAdditionner() {
        Calculatrice calculatrice = new Calculatrice();
        int resultatAttendu = 10;
        int resultatObtenu = calculatrice.additionner(5, 3);
        assertEquals("Le résultat de l'addition est incorrect", resultatAttendu, resultatObtenu);
    }
}
