package org.example.l5_3.l5_3_3;

public class DatabaseConnectionException {
    private String url;

    public DatabaseConnectionException(String url) throws Exception {
        this.url = url;
        if (url == null) {
            throw new Exception("URL invalide");
        }
        // Initialisation coûteuse (simulée)
        System.out.println("Connexion à la base de données : " + url);
    }

    public String getData() {
        return "Données réelles";
    }
}
