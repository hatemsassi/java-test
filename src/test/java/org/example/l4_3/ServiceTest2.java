package org.example.l4_3;

import static org.mockito.Mockito.*;
import org.junit.Test;

public class ServiceTest2 {

    @Test
    public void testTraiterDonnees() {
        // Préparer
        Repository repositoryMock = mock(Repository.class);
        Service service = new Service(repositoryMock);

        // Agir
        service.traiterDonnees(1);

        // Vérifier
        verify(repositoryMock).recupererDonnees(eq(1)); // Vérifie que la méthode a été appelée avec l'argument 1
    }
}
