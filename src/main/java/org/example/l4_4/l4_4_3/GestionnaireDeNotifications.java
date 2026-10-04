package org.example.l4_4.l4_4_3;

public class GestionnaireDeNotifications {
    private NotificationService notificationService;

    public GestionnaireDeNotifications(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void envoyerNotification(String message) {
        notificationService.envoyer(message);
    }
}
