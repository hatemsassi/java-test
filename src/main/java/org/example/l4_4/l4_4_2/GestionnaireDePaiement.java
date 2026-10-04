package org.example.l4_4.l4_4_2;

public class GestionnaireDePaiement {
    private PaiementService paiementService;

    public GestionnaireDePaiement(PaiementService paiementService) {
        this.paiementService = paiementService;
    }

    public String effectuerPaiement(double montant) {
        try {
            return paiementService.processerPaiement(montant);
        } catch (Exception e) {
            return "Erreur de paiement";
        }
    }
}