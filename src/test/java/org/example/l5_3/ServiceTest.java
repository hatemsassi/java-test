package org.example.l5_3;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.example.l5_3.l5_3_1.DatabaseConnection;
import org.example.l5_3.l5_3_1.Service;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import org.powermock.api.mockito.PowerMockito;

@RunWith(PowerMockRunner.class)
@PrepareForTest({Service.class, DatabaseConnection.class})
public class ServiceTest {

    @Test
    public void testObtenirDonnees() throws Exception {
        // Arrange
        DatabaseConnection connectionMock = mock(DatabaseConnection.class);
        when(connectionMock.getData()).thenReturn("Données simulées");

        // Mock the constructor of DatabaseConnection
        PowerMockito.whenNew(DatabaseConnection.class)
                .withArguments(anyString())
                .thenReturn(connectionMock);

        Service service = new Service("url_simulée");

        // Act
        String resultat = service.obtenirDonnees();

        // Assert
        assertEquals("Données simulées", resultat);
        verify(connectionMock).getData();
    }
}