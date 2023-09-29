package seminars.fourth.message;


import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;


class NotificationServiceTest {
    /*
    Задание No5
    Вам нужно написать тест с использованием моков для сервиса отправки сообщений.
    Условие: У вас есть класс MessageService с методом public void sendMessage(String message, String recipient),
    который отправляет сообщение получателю.
    Вам необходимо проверить правильность работы класса NotificationService, который использует MessageService
    для отправки уведомлений.
     */
    @Test
    void notificationServiceTest(){
        MessageService messageServiceMock = mock(MessageService.class);
        NotificationService notificationService = new NotificationService(messageServiceMock);

        // можно через переменные


        notificationService.sendNotification("message", "muzkat");

        // исправить после семинара
        //verify(messageServiceMock, times(1)).sendMessage("message", "muzkat");


    }

    /* Ришат решал на семинаре
    @Test
    public void messageDeligateTest() {
        MessageService messageServiceMock = mock(MessageService.class);
        NotificationService notificationService = new NotificationService(messageServiceMock);

        String message = "this not so easy";
        String receiver = "evil_coder";
        notificationService.sendNotification(message, receiver);

        verify(messageServiceMock, times(1)).sendMessage(message, receiver);
    }
     */

}