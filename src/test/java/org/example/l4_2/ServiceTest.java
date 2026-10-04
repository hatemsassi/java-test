package org.example.l4_2;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.example.l4_2.l4_2_3.Repository;
import org.example.l4_2.l4_2_3.Service;
import org.junit.Test;

public class ServiceTest {

    @Test
    public void testObtenirDonneesAvecException() throws Exception {
        // Préparer
        Repository repositoryMock = mock(Repository.class);
        when(repositoryMock.recupererDonnees(1)).thenThrow(new Exception("Erreur simulée"));

        Service service = new Service(repositoryMock);

        // Agir
        String resultat = service.obtenirDonnees(1);

        // Vérifier
        assertEquals("Erreur", resultat);
        verify(repositoryMock).recupererDonnees(1);
    }
}
