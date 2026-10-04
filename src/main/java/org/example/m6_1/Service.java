package org.example.m6_1;

public class Service {
    private Repository repository;
    private ApiClient apiClient;

    public Service(Repository repository, ApiClient apiClient) {
        this.repository = repository;
        this.apiClient = apiClient;
    }

    public String obtenirDonnees(int id) {
        try {
            String donneesLocale = repository.recupererDonnees(id);
            if (donneesLocale != null) {
                return donneesLocale;
            }
        } catch (DatabaseException e) {
            System.err.println("Erreur de base de données, tentative d'appel API");
        }

        return apiClient.recupererDonnees(id);
    }
}
