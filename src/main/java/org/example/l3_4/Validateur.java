package org.example.l3_4;

public class Validateur {
    public void validerAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("L'âge ne peut pas être négatif");
        }
    }
}
