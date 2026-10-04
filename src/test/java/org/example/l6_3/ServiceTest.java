package org.example.l6_3;

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
        PowerMockito.mockStatic(Utilitaire.class);
        when(Utilitaire.obtenirValeur()).thenReturn("Valeur simulée");

        Service service = new Service();
        String resultat = service.utiliserUtilitaire();

        assertEquals("Valeur simulée", resultat);
        PowerMockito.verifyStatic(Utilitaire.class);
        Utilitaire.obtenirValeur();
    }

    @Test
    public void testUtiliserUtilitaireAvecParametre() {
        PowerMockito.mockStatic(Utilitaire.class);
        when(Utilitaire.obtenirValeurAvecParametre("test"))
                .thenReturn("Valeur simulée avec test");

        Service service = new Service();
        String resultat = service.utiliserUtilitaireAvecParametre("test");

        assertEquals("Valeur simulée avec test", resultat);
        PowerMockito.verifyStatic(Utilitaire.class);
        Utilitaire.obtenirValeurAvecParametre("test");
    }

    @Test
    public void testUtiliserUtilitaireAvecException() throws Exception {
        PowerMockito.mockStatic(Utilitaire.class);
        when(Utilitaire.obtenirValeurAvecException())
                .thenThrow(new Exception("Erreur simulée"));

        Service service = new Service();
        String resultat = service.utiliserUtilitaireAvecException();

        assertEquals("Erreur", resultat);
        PowerMockito.verifyStatic(Utilitaire.class);
        Utilitaire.obtenirValeurAvecException();
    }

    @Test
    public void testAdditionnerValeurs() {
        PowerMockito.mockStatic(Utilitaire.class);
        when(Utilitaire.calculerSomme(5, 10)).thenReturn(20);

        Service service = new Service();
        int resultat = service.additionnerValeurs(5, 10);

        assertEquals(20, resultat);
        PowerMockito.verifyStatic(Utilitaire.class);
        Utilitaire.calculerSomme(5, 10);
    }

    @Test
    public void testVerifierDonnee() {
        PowerMockito.mockStatic(Utilitaire.class);
        when(Utilitaire.verifierConditionComplexe("ValidInput"))
                .thenReturn(true);

        Service service = new Service();
        boolean resultat = service.verifierDonnee("ValidInput");

        assertTrue(resultat);
        PowerMockito.verifyStatic(Utilitaire.class);
        Utilitaire.verifierConditionComplexe("ValidInput");
    }
}
