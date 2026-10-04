package org.example.l3_3;

public class Utilitaire {
    public String obtenirValeur(String cle) {
        if ("valide".equals(cle)) {
            return "Valeur valide";
        }
        return null;
    }
}