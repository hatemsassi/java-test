package org.example.l5_4;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import org.powermock.api.mockito.PowerMockito;

@RunWith(PowerMockRunner.class)
@PrepareForTest(Utilitaire3.class)
public class UtilitaireTest3 {

    @Test
    public void testUtiliserMethodePriveeAvecException() throws Exception {
        // Préparer
        Utilitaire3 utilitaireMock = PowerMockito.spy(new Utilitaire3());
        PowerMockito.doThrow(new Exception("Erreur simulée"))
                .when(utilitaireMock, "methodePriveeAvecException");

        // Agir
        String resultat = utilitaireMock.utiliserMethodePriveeAvecException();

        // Vérifier
        assertEquals("Erreur", resultat);
    }
}
