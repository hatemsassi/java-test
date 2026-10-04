package org.example.l4_4;

import static org.mockito.Mockito.*;

import org.example.l4_4.l4_4_3.GestionnaireDeNotifications;
import org.example.l4_4.l4_4_3.NotificationService;
import org.junit.Test;

public class GestionnaireDeNotificationsTest {

    @Test
    public void testEnvoyerNotificationAvecAction() {
        // Préparer
        NotificationService notificationServiceMock = mock(NotificationService.class);
        doAnswer(invocation -> {
            System.out.println("Notification envoyée : " + invocation.getArgument(0));
            return null;
        }).when(notificationServiceMock).envoyer(anyString());

        GestionnaireDeNotifications gestionnaire = new GestionnaireDeNotifications(notificationServiceMock);

        // Agir
        gestionnaire.envoyerNotification("Bonjour !");

        // Vérifier
        verify(notificationServiceMock).envoyer("Bonjour !");
    }
}
