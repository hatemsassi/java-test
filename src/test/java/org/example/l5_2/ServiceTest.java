package org.example.l5_2;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import org.powermock.api.mockito.PowerMockito;

@RunWith(PowerMockRunner.class)
@PrepareForTest(Utilitaire.class)
public class ServiceTest {

    @Test
    public void testUtiliserUtilitaire() {
        // Préparer
        PowerMockito.mockStatic(Utilitaire.class);
        when(Utilitaire.obtenirValeur()).thenReturn("Valeur simulée");

        Service service = new Service();

        // Agir
        String resultat = service.utiliserUtilitaire();

        // Vérifier
        assertEquals("Valeur simulée", resultat);
        PowerMockito.verifyStatic(Utilitaire.class);
        Utilitaire.obtenirValeur();
    }
}
