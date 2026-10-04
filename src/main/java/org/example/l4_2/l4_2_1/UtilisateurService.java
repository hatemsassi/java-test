package org.example.l4_2.l4_2_1;

public class UtilisateurService {
    private UtilisateurRepository utilisateurRepository;


    public UtilisateurService(UtilisateurRepository utilisateurRepository) {
        this.utilisateurRepository = utilisateurRepository;
    }


    public String obtenirNomUtilisateur(int id) {
        Utilisateur utilisateur = utilisateurRepository.trouverParId(id);
        return utilisateur != null ? utilisateur.getNom() : "Inconnu";
    }
}
