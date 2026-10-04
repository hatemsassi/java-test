package org.example.l4_5.l4_5_2;

public class GestionnaireDeNotifications {
    private NotificationService notificationService;

    public GestionnaireDeNotifications(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void envoyerNotification(String message) {
        notificationService.envoyer(message);
    }
}
