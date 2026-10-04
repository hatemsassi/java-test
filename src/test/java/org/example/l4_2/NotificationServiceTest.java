package org.example.l4_2;

import static org.mockito.Mockito.*;

import org.example.l4_2.l4_2_2.EmailService;
import org.example.l4_2.l4_2_2.NotificationService;
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
