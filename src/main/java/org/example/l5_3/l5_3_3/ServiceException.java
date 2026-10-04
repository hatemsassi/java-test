package org.example.l5_3.l5_3_3;

public class ServiceException {
    private DatabaseConnectionException connection;

    public ServiceException(String url) throws Exception {
        this.connection = new DatabaseConnectionException(url);
    }

    public String obtenirDonnees() {
        return connection.getData();
    }
}