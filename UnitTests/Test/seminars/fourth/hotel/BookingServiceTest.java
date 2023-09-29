package seminars.fourth.hotel;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.*;
import static org.mockito.internal.verification.VerificationModeFactory.times;

class BookingServiceTest {
    /*
    Вам необходимо написать тест с использованием моков для сервиса бронирования отелей.
    Условие: У вас есть класс HotelService с методом
    public boolean isRoomAvailable(int roomId),
    который обычно проверяет, доступен ли номер в отеле.
    Вам необходимо проверить правильность работы класса BookingService,
    который использует HotelService для бронирования номера, если он доступен.
     */

    @Test
    void bookingServiceTest() {
        HotelService hotelServiceMock = mock(HotelService.class);
        // условие
        //when(hotelServiceMock.isRoomAvailable(anyInt())).thenAnswer(roomId -> roomId.getArgument(0));
        when(hotelServiceMock.isRoomAvailable(anyInt())).thenReturn(anyInt() % 2 == 0);

        BookingService bookingService = new BookingService(hotelServiceMock);
        assertTrue(bookingService.bookRoom(2));

    }
    @Test
    void bookingServiceTestFalse() {
        HotelService hotelServiceMock = mock(HotelService.class);
        // условие четный - true
        //when(hotelServiceMock.isRoomAvailable(anyInt())).thenAnswer(roomId -> roomId.getArgument(0));
        when(hotelServiceMock.isRoomAvailable(anyInt())).thenReturn(anyInt() % 2 != 0);

        BookingService bookingService = new BookingService(hotelServiceMock);
        assertFalse(bookingService.bookRoom(1));

        // добавим метод verify - для проверки количества действий
        verify(hotelServiceMock, times(1));
    }


}