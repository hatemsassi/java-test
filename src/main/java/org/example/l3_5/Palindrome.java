package org.example.l3_5;

public class Palindrome {
    public static boolean estPalindrome(String chaine) {
        if (chaine == null) {
            return false;
        }
        String chaineInverse = new StringBuilder(chaine).reverse().toString();
        return chaine.equals(chaineInverse);
    }
}