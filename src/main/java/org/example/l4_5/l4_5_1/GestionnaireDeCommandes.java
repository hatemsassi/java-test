package org.example.l4_5.l4_5_1;

public class GestionnaireDeCommandes {
    private StockService stockService;
    private PaiementService paiementService;

    public GestionnaireDeCommandes(StockService stockService, PaiementService paiementService) {
        this.stockService = stockService;
        this.paiementService = paiementService;
    }

    public String passerCommande(int produitId, double montant) {
        if (stockService.verifierDisponibilite(produitId).equals("Disponible")) {
            return paiementService.processerPaiement(montant);
        }
        return "Produit indisponible";
    }
}