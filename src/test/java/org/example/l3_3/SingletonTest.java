package org.example.l3_3;

import static org.junit.Assert.*;
import org.junit.Test;

public class SingletonTest {

    @Test
    public void testSingleton() {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        assertSame(instance1, instance2); // Vérifie que les deux instances sont les mêmes
    }

    @Test
    public void testNonSingleton() {
        Object objet1 = new Object();
        Object objet2 = new Object();
        assertNotSame(objet1, objet2); // Vérifie que les deux instances sont différentes
    }
}