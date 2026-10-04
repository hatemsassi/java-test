package org.example.l4_4;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.example.l4_4.l4_4_2.GestionnaireDePaiement;
import org.example.l4_4.l4_4_2.PaiementService;
import org.junit.Test;

public class GestionnaireDePaiementTest {

    @Test
    public void testEffectuerPaiementAvecException() throws Exception {
        // Préparer
        PaiementService paiementServiceMock = mock(PaiementService.class);

        // Simulate an exception being thrown by the mock
        doThrow(new Exception("Erreur simulée")).when(paiementServiceMock).processerPaiement(100.0);

        GestionnaireDePaiement gestionnaire = new GestionnaireDePaiement(paiementServiceMock);

        // Agir
        String resultat = gestionnaire.effectuerPaiement(100.0);

        // Vérifier
        assertEquals("Erreur de paiement", resultat);
        verify(paiementServiceMock).processerPaiement(100.0);
    }
}
