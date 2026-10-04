package org.example.l2_2;

import java.util.List;

public class Commande {
    public double calculerMontantTotal(List<Double> prixArticles, double tauxTaxe) {
        double sousTotal = prixArticles.stream().mapToDouble(Double::doubleValue).sum();
        return sousTotal * (1 + tauxTaxe);
    }
}

