package org.example.l4_5;

import static org.mockito.Mockito.*;

import org.example.l4_5.l4_5_2.GestionnaireDeNotifications;
import org.example.l4_5.l4_5_2.NotificationService;
import org.junit.Test;

public class GestionnaireDeNotificationsTest {

    @Test
    public void testEnvoyerNotification() {
        // Préparer
        NotificationService notificationServiceMock = mock(NotificationService.class);
        GestionnaireDeNotifications gestionnaire = new GestionnaireDeNotifications(notificationServiceMock);

        // Agir
        gestionnaire.envoyerNotification("Bonjour !");

        // Vérifier
        verify(notificationServiceMock).envoyer("Bonjour !");
    }
}
