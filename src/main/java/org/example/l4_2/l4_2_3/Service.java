package org.example.l4_2.l4_2_3;

public class Service {
    private Repository repository;

    public Service(Repository repository) {
        this.repository = repository;
    }

    public String obtenirDonnees(int id) {
        try {
            return repository.recupererDonnees(id);
        } catch (Exception e) {
            return "Erreur";
        }
    }
}
