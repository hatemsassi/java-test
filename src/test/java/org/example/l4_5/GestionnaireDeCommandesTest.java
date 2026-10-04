package org.example.l4_5;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.example.l4_5.l4_5_1.GestionnaireDeCommandes;
import org.example.l4_5.l4_5_1.PaiementService;
import org.example.l4_5.l4_5_1.StockService;
import org.junit.Test;

public class GestionnaireDeCommandesTest {

    @Test
    public void testPasserCommandeProduitDisponible() {
        // Préparer
        StockService stockServiceMock = mock(StockService.class);
        PaiementService paiementServiceMock = mock(PaiementService.class);
        when(stockServiceMock.verifierDisponibilite(1)).thenReturn("Disponible");
        when(paiementServiceMock.processerPaiement(100.0)).thenReturn("Paiement réussi");

        GestionnaireDeCommandes gestionnaire = new GestionnaireDeCommandes(stockServiceMock,
                paiementServiceMock);

        // Agir
        String resultat = gestionnaire.passerCommande(1, 100.0);

        // Vérifier
        assertEquals("Paiement réussi", resultat);
        verify(stockServiceMock).verifierDisponibilite(1);
        verify(paiementServiceMock).processerPaiement(100.0);
    }
}
