package org.example.l5_4;

public class Utilitaire3 {
    private String methodePriveeAvecException() throws Exception {
        throw new Exception("Erreur simulée");
    }


    public String utiliserMethodePriveeAvecException() {
        try {
            return methodePriveeAvecException();
        } catch (Exception e) {
            return "Erreur";
        }
    }
}
