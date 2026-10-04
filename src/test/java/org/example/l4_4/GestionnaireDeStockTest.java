package org.example.l4_4;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.example.l4_4.l4_4_1.GestionnaireDeStock;
import org.example.l4_4.l4_4_1.StockService;
import org.junit.Test;

public class GestionnaireDeStockTest {

    @Test
    public void testVerifierStockAvecSequences() {
        // Préparer
        StockService stockServiceMock = mock(StockService.class);
        when(stockServiceMock.verifierDisponibilite(1))
                .thenReturn("Disponible")
                .thenReturn("En rupture de stock");

        GestionnaireDeStock gestionnaire = new GestionnaireDeStock(stockServiceMock);

        // Agir
        String premierResultat = gestionnaire.verifierStock(1);
        String deuxiemeResultat = gestionnaire.verifierStock(1);

        // Vérifier
        assertEquals("Disponible", premierResultat);
        assertEquals("En rupture de stock", deuxiemeResultat);
        verify(stockServiceMock, times(2)).verifierDisponibilite(1);
    }
}
