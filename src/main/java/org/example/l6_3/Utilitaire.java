package org.example.l6_3;

public class Utilitaire {
    public static String obtenirValeur() {
        return "Valeur réelle";
    }

    public static String obtenirValeurAvecParametre(String parametre) {
        return "Valeur réelle avec " + parametre;
    }

    public static String obtenirValeurAvecException() throws Exception {
        throw new Exception("Erreur simulée");
    }

    public static int calculerSomme(int a, int b) {
        return a + b;
    }

    public static boolean verifierConditionComplexe(String input) {
        return input != null && input.length() > 5 && input.startsWith("Valid");
    }
}