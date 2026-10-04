package org.example.l5_3;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.example.l5_3.l5_3_2.DatabaseConnectionParametre;
import org.example.l5_3.l5_3_2.ServiceParametre;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import org.powermock.api.mockito.PowerMockito;

@RunWith(PowerMockRunner.class)
@PrepareForTest({DatabaseConnectionParametre.class, ServiceParametre.class})
public class ServiceParametreTest {

    @Test
    public void testObtenirDonneesAvecParametre() throws Exception {
        // Préparer
        DatabaseConnectionParametre connectionMock = mock(DatabaseConnectionParametre.class);
        when(connectionMock.getData()).thenReturn("Données simulées");

        PowerMockito.whenNew(DatabaseConnectionParametre.class)
                .withArguments(eq("url_simulée"))
                .thenReturn(connectionMock);

        ServiceParametre service = new ServiceParametre("url_simulée");

        // Agir
        String resultat = service.obtenirDonnees();

        // Vérifier
        assertEquals("Données simulées", resultat);
        verify(connectionMock).getData();
    }
}
