package org.example.m6_1;

// Tests avec Mockito
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import org.junit.Test;

public class ServiceTest {

    @Test
    public void testObtenirDonneesAvecRepository() throws DatabaseException {
        // Préparer
        Repository repositoryMock = mock(Repository.class);
        ApiClient apiClientMock = mock(ApiClient.class);
        when(repositoryMock.recupererDonnees(1)).thenReturn("Données locales enrichies");

        Service service = new Service(repositoryMock, apiClientMock);

        // Agir
        String resultat = service.obtenirDonnees(1);

        // Vérifier
        assertEquals("Données locales enrichies", resultat);
        verify(repositoryMock).recupererDonnees(1);
        verify(apiClientMock, never()).recupererDonnees(anyInt());
    }

    @Test
    public void testObtenirDonneesAvecApiClient() throws DatabaseException {
        // Préparer
        Repository repositoryMock = mock(Repository.class);
        ApiClient apiClientMock = mock(ApiClient.class);
        when(repositoryMock.recupererDonnees(1)).thenReturn(null);
        when(apiClientMock.recupererDonnees(1)).thenReturn("Données externes optimisées");

        Service service = new Service(repositoryMock, apiClientMock);

        // Agir
        String resultat = service.obtenirDonnees(1);

        // Vérifier
        assertEquals("Données externes optimisées", resultat);
        verify(repositoryMock).recupererDonnees(1);
        verify(apiClientMock).recupererDonnees(1);
    }

    @Test
    public void testObtenirDonneesAvecException() throws DatabaseException {
        // Préparer
        Repository repositoryMock = mock(Repository.class);
        ApiClient apiClientMock = mock(ApiClient.class);
        when(repositoryMock.recupererDonnees(1)).thenThrow(new DatabaseException("Erreur DB"));
        when(apiClientMock.recupererDonnees(1)).thenReturn("Données de secours de l'API");

        Service service = new Service(repositoryMock, apiClientMock);

        // Agir
        String resultat = service.obtenirDonnees(1);

        // Vérifier
        assertEquals("Données de secours de l'API", resultat);
        verify(repositoryMock).recupererDonnees(1);
        verify(apiClientMock).recupererDonnees(1);
    }
}
