package org.example.l4_3;

import static org.mockito.Mockito.*;
import org.junit.Test;

public class ServiceTest {

    @Test
    public void testTraiterDonnees() {
        // Préparer
        Repository repositoryMock = mock(Repository.class);
        Service service = new Service(repositoryMock);

        // Agir
        service.traiterDonnees(1);

        // Vérifier
        verify(repositoryMock, times(2))
                .recupererDonnees(1); // Vérifie que la méthode a été appelée deux fois
    }
}
