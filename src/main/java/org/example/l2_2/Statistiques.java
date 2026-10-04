package org.example.l2_2;

import java.util.List;

public class Statistiques {
    public double calculerMoyenne(List<Double> nombres) {
        return nombres.stream().mapToDouble(Double::doubleValue).average().orElse(0.0);
    }
}
