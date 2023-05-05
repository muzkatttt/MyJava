import java.util.*;

public class Task1 {
    public static void main(String[] args) {
       /*
       Реализуйте структуру телефонной книги с помощью HashMap,
       учитывая, что 1 человек может иметь несколько телефонов.
        */

// моя задача: попробовать организовать свой класс, внутрь него поместить поле стринг,
// добавить несколько методов (добавляет контакт, ищет контакт и показывает все контакты)
        Map<String, ArrayList<String>> phoneBook2 = new HashMap<>();
        MyPhoneBook myBook = new MyPhoneBook();
        myBook.methodAdd(98767, "Понтий Пилат");
        myBook.methodAdd(11111, "Маленький Принц");
        myBook.methodAdd(23456, "Красная Шапочка");
        myBook.methodAdd(77777, "Буратино");
        myBook.methodAdd(45648, "Маленький Принц");
        System.out.println(myBook.getToList()); // вывод на экран справочника
        String searchName = myBook.searchName("Красная Шапочка");
        //System.out.println("Искомое значение " + searchName);
        Integer searchPhone = myBook.searchTelephone(98765);
    }

    }
    /* // если контакт будет вводить пользователь
    public String findContactFromUser(String findName){
        System.out.println("Введите контакт для поиска: \n");
        Scanner scanner = new Scanner(System.in);
        findName = scanner.nextLine();
        if (scanner.equals(findName))
        {
            System.out.println("В справочнике уже есть контакт с именем " + findName);
        } else {
            System.out.println("Контакта нет в справочнике");
        }
        return findName;
    }
    */
