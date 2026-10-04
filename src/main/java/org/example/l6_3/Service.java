package org.example.l6_3;

public class Service {
    public String utiliserUtilitaire() {
        return Utilitaire.obtenirValeur();
    }

    public String utiliserUtilitaireAvecParametre(String parametre) {
        return Utilitaire.obtenirValeurAvecParametre(parametre);
    }

    public String utiliserUtilitaireAvecException() {
        try {
            return Utilitaire.obtenirValeurAvecException();
        } catch (Exception e) {
            return "Erreur";
        }
    }

    public int additionnerValeurs(int a, int b) {
        return Utilitaire.calculerSomme(a, b);
    }

    public boolean verifierDonnee(String input) {
        return Utilitaire.verifierConditionComplexe(input);
    }
}