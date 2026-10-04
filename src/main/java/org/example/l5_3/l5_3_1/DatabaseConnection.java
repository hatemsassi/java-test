package org.example.l5_3.l5_3_1;

public class DatabaseConnection {
    private String url;

    public DatabaseConnection(String url) {
        this.url = url;
        // Initialisation coûteuse (simulée)
        System.out.println("Connexion à la base de données : " + url);
    }

    public String getData() {
        return "Données réelles";
    }
}
