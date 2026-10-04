package org.example.l5_3.l5_3_1;

public class Service {
    private DatabaseConnection connection;

    public Service(String url) {
        this.connection = new DatabaseConnection(url);
    }

    public String obtenirDonnees() {
        return connection.getData();
    }
}
