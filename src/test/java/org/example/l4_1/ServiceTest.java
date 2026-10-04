package org.example.l4_1;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import org.junit.Test;

public class ServiceTest {

    @Test
    public void testObtenirDonnees() {
        // Préparer
        Repository repositoryMock = mock(Repository.class);
        when(repositoryMock.recupererDonnees()).thenReturn("Données simulées");

        Service service = new Service(repositoryMock);

        // Agir
        String resultat = service.obtenirDonnees();

        // Vérifier
        assertEquals("Données simulées", resultat);
        verify(repositoryMock).recupererDonnees(); // Vérifie que la méthode a été appelée
    }
}
