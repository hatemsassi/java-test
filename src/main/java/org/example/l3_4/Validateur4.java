package org.example.l3_4;

public class Validateur4 {
    public void validerValeur(int valeur) {
        if (valeur < 0) {
            throw new IllegalArgumentException("La valeur ne peut pas être négative");
        }
        if (valeur > 100) {
            throw new IllegalArgumentException("La valeur ne peut pas dépasser 100");
        }
    }
}
