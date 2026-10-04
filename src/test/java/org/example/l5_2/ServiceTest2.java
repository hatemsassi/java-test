package org.example.l5_2;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import org.powermock.api.mockito.PowerMockito;

@RunWith(PowerMockRunner.class)
@PrepareForTest(Utilitaire2.class)
public class ServiceTest2 {

    @Test
    public void testUtiliserUtilitaireAvecParametre() {
        // Préparer
        PowerMockito.mockStatic(Utilitaire2.class);
        when(Utilitaire2.obtenirValeurAvecParametre("test")).thenReturn("Valeur simulée avec test");

        Service2 service = new Service2();

        // Agir
        String resultat = service.utiliserUtilitaireAvecParametre("test");

        // Vérifier
        assertEquals("Valeur simulée avec test", resultat);
        PowerMockito.verifyStatic(Utilitaire2.class);
        Utilitaire2.obtenirValeurAvecParametre("test");
    }
}
