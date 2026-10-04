package org.example.l4_1;

public class Service {
    private Repository repository;

    public Service(Repository repository) {
        this.repository = repository;
    }

    public String obtenirDonnees() {
        return repository.recupererDonnees();
    }
}