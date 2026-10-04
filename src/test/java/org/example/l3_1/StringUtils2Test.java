package org.example.l3_1;

import static org.junit.Assert.*;
import org.junit.Test;

public class StringUtils2Test {
    @Test
    public void testConcatener() {
        // Préparer
        StringUtils2 stringUtils = new StringUtils2();
        String str1 = "Hello";
        String str2 = "World";
        String resultatAttendu = "HelloWorld";

        // Agir
        String resultatObtenu = stringUtils.concatener(str1, str2);

        // Vérifier
        assertEquals(resultatAttendu, resultatObtenu);
    }
}
