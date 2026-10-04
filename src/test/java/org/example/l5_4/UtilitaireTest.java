package org.example.l5_4;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import org.powermock.api.mockito.PowerMockito;

@RunWith(PowerMockRunner.class)
@PrepareForTest(Utilitaire.class)
public class UtilitaireTest {

    @Test
    public void testUtiliserMethodePrivee() throws Exception {
        // Préparer
        Utilitaire utilitaireMock = PowerMockito.spy(new Utilitaire());
        PowerMockito.doReturn("Valeur simulée").when(utilitaireMock, "methodePrivee");

        // Agir
        String resultat = utilitaireMock.utiliserMethodePrivee();

        // Vérifier
        assertEquals("Valeur simulée", resultat);
    }
}
