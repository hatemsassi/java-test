package org.example.l3_3;

import static org.junit.Assert.*;
import org.junit.Test;

public class TableauTest {

    @Test
    public void testCreerTableau() {
        Tableau tableau = new Tableau();
        int[] tableauAttendu = { 1, 2, 3 };
        int[] tableauObtenu = tableau.creerTableau(1, 2, 3);
        assertArrayEquals(tableauAttendu, tableauObtenu); // Vérifie que les tableaux sont égaux
    }
}