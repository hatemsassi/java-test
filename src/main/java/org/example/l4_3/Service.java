package org.example.l4_3;

public class Service {
    private Repository repository;

    public Service(Repository repository) {
        this.repository = repository;
    }

    public void traiterDonnees(int id) {
        repository.recupererDonnees(id);
        repository.recupererDonnees(id);
    }

    public void sauvegarderDonnees(String donnees) {
        repository.sauvegarder(donnees);
    }
}
