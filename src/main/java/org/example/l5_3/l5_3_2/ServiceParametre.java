package org.example.l5_3.l5_3_2;

public class ServiceParametre {
    private DatabaseConnectionParametre connection;

    public ServiceParametre(String url) {
        this.connection = new DatabaseConnectionParametre(url);
    }

    public String obtenirDonnees() {
        return connection.getData();
    }
}
