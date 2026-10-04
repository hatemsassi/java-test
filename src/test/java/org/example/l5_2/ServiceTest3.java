package org.example.l5_2;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import org.powermock.api.mockito.PowerMockito;

@RunWith(PowerMockRunner.class)
@PrepareForTest(Utilitaire3.class) // Prepare the class with the static method
public class ServiceTest3 {

    @Test
    public void testUtiliserUtilitaireAvecException() throws Exception {
        // Arrange
        PowerMockito.mockStatic(Utilitaire3.class); // Mock the static method
        when(Utilitaire3.obtenirValeurAvecException())
                .thenThrow(new Exception("Erreur simulée")); // Simulate an exception

        Service3 service = new Service3();

        // Act
        String resultat = service.utiliserUtilitaireAvecException();

        // Assert
        assertEquals("Erreur", resultat); // Verify the result

        // Verify that the static method was called
        PowerMockito.verifyStatic(Utilitaire3.class); // Start verification
        Utilitaire3.obtenirValeurAvecException();
            // Call the static method again within the verification block
    }
}