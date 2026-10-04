package org.example.l4_3;

import static org.mockito.Mockito.*;
import org.junit.Test;

public class ServiceTest3 {

    @Test
    public void testSauvegarderDonnees() {
        // Préparer
        Repository repositoryMock = mock(Repository.class);
        Service service = new Service(repositoryMock);

        // Agir
        service.sauvegarderDonnees("Données importantes");

        // Vérifier
        verify(repositoryMock)
                .sauvegarder("Données importantes"); // Vérifie que la méthode a été appelée
    }
}
