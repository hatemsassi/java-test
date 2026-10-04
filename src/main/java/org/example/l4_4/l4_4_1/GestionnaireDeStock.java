package org.example.l4_4.l4_4_1;

public class GestionnaireDeStock {
    private StockService stockService;

    public GestionnaireDeStock(StockService stockService) {
        this.stockService = stockService;
    }

    public String verifierStock(int produitId) {
        return stockService.verifierDisponibilite(produitId);
    }
}