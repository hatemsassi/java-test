package org.example.l4_3;

import static org.mockito.Mockito.*;
import org.junit.Test;

public class NotificationServiceTest {

    @Test
    public void testNotifierUtilisateur() {
        // Préparer
        EmailService emailServiceMock = mock(EmailService.class);
        NotificationService notificationService = new NotificationService(emailServiceMock);

        // Agir
        notificationService.notifierUtilisateur("alice@example.com", "Bonjour Alice !");

        // Vérifier
        verify(emailServiceMock).envoyerEmail("alice@example.com", "Bonjour Alice !");
    }
}
