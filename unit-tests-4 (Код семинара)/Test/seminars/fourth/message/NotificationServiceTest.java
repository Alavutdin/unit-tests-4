package seminars.fourth.message;


import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

class NotificationServiceTest {
    @Test
    void testNotificationService(){
        MessageService messageService=mock(MessageService.class);
        NotificationService notificationService = new NotificationService(messageService);

        notificationService.sendNotification("Hi!","John");

        verify(messageService).sendMessage("Hi!","John");
    }

}