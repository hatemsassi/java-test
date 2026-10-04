package org.example.l2_2;

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.Arrays;
import java.util.List;


public class CommandeTest {

    @Test
    public void testCalculerMontantTotal() {
        // Préparer
        Commande commande = new Commande();
        List<Double> prixArticles = Arrays.asList(10.0, 20.0, 30.0);
        double tauxTaxe = 0.10;
        double resultatAttendu = 66.0; // (10 + 20 + 30) * 1.10

        // Agir
        double resultatObtenu = commande.calculerMontantTotal(prixArticles, tauxTaxe);

        // Vérifier
        assertEquals(resultatAttendu, resultatObtenu, 0.001); // La tolérance est pour les comparaisons de nombres flottants
    }
}
