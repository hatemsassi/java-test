package org.example.l6_1_1;

// Classe Calculatrice avec des méthodes plus avancées
public class Calculatrice {
    public int additionner(int a, int b) {
        return a + b;
    }

    public int soustraire(int a, int b) {
        return a - b;
    }

    public int multiplier(int a, int b) {
        return a * b;
    }

    public int diviser(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division par zéro");
        }
        return a / b;
    }

    public double puissance(double base, double exposant) {
        return Math.pow(base, exposant);
    }

    public double pourcentage(double total, double taux) {
        return (total * taux) / 100;
    }
}