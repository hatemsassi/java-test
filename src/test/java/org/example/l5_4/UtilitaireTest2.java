package org.example.l5_4;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import org.powermock.api.mockito.PowerMockito;
import static org.mockito.ArgumentMatchers.eq;

@RunWith(PowerMockRunner.class)
@PrepareForTest(Utilitaire2.class)
public class UtilitaireTest2 {

    @Test
    public void testUtiliserMethodePriveeAvecParametre() throws Exception {
        // Préparer
        Utilitaire2 utilitaireMock = PowerMockito.spy(new Utilitaire2());
        PowerMockito
                .doReturn("Valeur simulée avec test")
                .when(utilitaireMock, "methodePriveeAvecParametre", eq("test"));

        // Agir
        String resultat = utilitaireMock.utiliserMethodePriveeAvecParametre("test");

        // Vérifier
        assertEquals("Valeur simulée avec test", resultat);
    }
}
