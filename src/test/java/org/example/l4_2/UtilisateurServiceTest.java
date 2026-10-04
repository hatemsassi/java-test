package org.example.l4_2;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.example.l4_2.l4_2_1.Utilisateur;
import org.example.l4_2.l4_2_1.UtilisateurRepository;
import org.example.l4_2.l4_2_1.UtilisateurService;
import org.junit.Test;

public class UtilisateurServiceTest {

    @Test
    public void testObtenirNomUtilisateur() {
        // Préparer
        UtilisateurRepository repositoryMock = mock(UtilisateurRepository.class);
        when(repositoryMock.trouverParId(1)).thenReturn(new Utilisateur("Alice"));
        when(repositoryMock.trouverParId(2)).thenReturn(null);

        UtilisateurService service = new UtilisateurService(repositoryMock);

        // Agir
        String nomUtilisateur1 = service.obtenirNomUtilisateur(1);
        String nomUtilisateur2 = service.obtenirNomUtilisateur(2);

        // Vérifier
        assertEquals("Alice", nomUtilisateur1);
        assertEquals("Inconnu", nomUtilisateur2);
        verify(repositoryMock, times(2)).trouverParId(anyInt()); // Vérifie que la méthode a été appelée deux fois
    }
}
