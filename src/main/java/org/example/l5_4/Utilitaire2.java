package org.example.l5_4;

public class Utilitaire2 {
    private String methodePriveeAvecParametre(String parametre) {
        return "Valeur privée avec " + parametre;
    }

    public String utiliserMethodePriveeAvecParametre(String parametre) {
        return methodePriveeAvecParametre(parametre);
    }
}
