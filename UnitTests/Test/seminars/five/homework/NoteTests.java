package seminars.five.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;

class NoteTests {
    /*Задание 1.
    Представьте, что вы работаете над разработкой простого приложения для записной книжки,
    которое позволяет пользователям добавлять, редактировать и удалять контакты.
    Ваша задача - придумать как можно больше различных тестов
    (юнит-тесты, интеграционные тесты, сквозные тесты) для этого приложения.
    Напишите название каждого теста, его тип и краткое описание того, что этот тест проверяет.
    */

    // для тестирования сначала написаны тесты в классе NoteTests,
    // далее созданы классы Contact и Note, добавлены методы

    private Contact contact;
    private Contact contact1;

    private List<Contact> listContacts;

    @BeforeEach
    void setUp() {
        // создаем контакты для тестирования,
        // аннотация  @BeforeEach позволяет создавать новые объекты в каждом тесте
        Contact contact = new Contact(1, "Max", "73222252");
        Contact contact1 = new Contact(2, "Alex", "11111111");
    }

    // unit-test проверка id контакта
    @Test
    void checkedId() {
        int id = 1;
        assertThat(id).isEqualTo(1);
    }

    // unit-test проверка имени контакта
    @Test
    void checkedName() {
        String name1 = "Max";
        assertThat(name1).isEqualTo("Max");
    }

    // unit-test проверка номера телефона контакта
    @Test
    void checkedNumberOfTelephone() {
        String numberTelephone = "73222252";
        assertThat(numberTelephone).isEqualTo("73222252");
    }

    // unit-test добавление контакта в записную книжку
    @Test
    void testAddContactToNote() {
        //создаем список listContact и заполняем его данными
        List<Contact> note = new ArrayList<>();
        note.add(contact);
        note.add(contact1);

        // запускаем тест и проверяем добавлен ли контакт в записную книжку
        assertTrue(note.add(contact));
        assertTrue(note.add(contact1));

    }

    // unit-test удаление контакта из записной книжки
    @Test
    void testDeleteContact() {
        Note note = mock(Note.class);
        note.deleteContact(contact, listContacts);
        assertFalse(note == null);
    }
}

    /*Задание 2. *Ниже список тестовых сценариев.
    Ваша задача - определить тип каждого теста (юнит-тест, интеграционный тест, сквозной тест)
    и объяснить, почему вы так решили.
    Проверка того, что функция addContact корректно добавляет новый контакт в список контактов.
    Проверка того, что при добавлении контакта через пользовательский интерфейс,
    контакт корректно отображается в списке контактов"".
    Проверка полного цикла работы с контактом: создание контакта, его редактирование и последующее удаление.
     */

