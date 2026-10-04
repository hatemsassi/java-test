package org.example.l3_1;

import static org.junit.Assert.*;
import org.junit.Test;

public class StringUtilsTest {

    @Test
    public void testInverser() {
        // Préparer
        StringUtils stringUtils = new StringUtils();
        String str = "hello";
        String resultatAttendu = "olleh";

        // Agir
        String resultatObtenu = stringUtils.inverser(str);

        // Vérifier
        assertEquals(resultatAttendu, resultatObtenu);
    }
}
