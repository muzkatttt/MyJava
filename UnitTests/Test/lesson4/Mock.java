package lesson4;

import java.util.List;

import static org.mockito.Mockito.when;

public class Mock {
    public static List<Integer> mock(Class<List> listClass) {
        // создание мока с помощью статического метода mock
        List mockedList = mock(List.class);
        when(mockedList.get(0)).thenReturn("nullValue");

        // выведет в консоли "nullValue"
        System.out.println(mockedList.get(0));

        // с использованием аннотации @Mock
//        @Mock
//        private Calculator calculator;


        // можно настраивать выбрасываемое исключение
        List mockedList1 = mock(List.class);
        when(mockedList1.get(1)).thenThrow(new RuntimeException());

        // вернет в консоли RuntimeException
        System.out.println(mockedList.get(1));

        // если mockedList.get(0) не будет вызван до этой проверки,то тест провалится
        //verify(mockedList.get(0));

        // вызов реальных методов
        //when(mock.someMethod()).thenCallRealMethod();

        // проверка с тайм-аутом
        //verify(mock, timeout(100)).someMethod();

        // проверка точного количества вызовов
        //verify(mockedList, timeout(2)).add("twice");
        //verify(mockedList, never()).add("never happened");


        // Mockito.BDD - работа в поведенческом стиле given when than
//        Seller seller = mock(Seller.class);
//        Shop shop = new Shop(seller);

        return mockedList;
    }

    public void shouldByDread() throws Exception {
        // given - создаем условие
//        given(seller.askForBread()).willReturn(new Bread());
//
//        // when - выполняем какое-то действие
//        Goods goods = shop.byBread();
//
//        // then - проверяем результат какого-то действия
//
//        assertThat(goods, containBread);

    }
}
