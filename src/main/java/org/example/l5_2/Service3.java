package org.example.l5_2;

public class Service3 {
    public String utiliserUtilitaireAvecException() {
        try {
            return Utilitaire3.obtenirValeurAvecException();
        } catch (Exception e) {
            return "Erreur";
        }
    }
}
