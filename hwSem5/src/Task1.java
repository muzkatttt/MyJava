import java.util.ArrayList;

public class Task1 {
    public static void main(String[] args) {
       /*
       Реализуйте структуру телефонной книги с помощью HashMap,
       учитывая, что 1 человек может иметь несколько телефонов.
        */

        MyPhoneBook myBook = new MyPhoneBook();
        myBook.methodAdd(81498767, "Понтий Пилат");
        myBook.methodAdd(89111111, "Маленький Принц");
        myBook.methodAdd(89123456, "Красная Шапочка");
        myBook.methodAdd(89127777, "Буратино");
        myBook.methodAdd(89125648, "Маленький Принц");
        System.out.println(myBook.getToList()); // вывод на экран справочника
        ArrayList<Integer> searchName = myBook.searchByName("Красная Шапочка");
        System.out.println(searchName);
        String searchContact = myBook.searchByNumber("89111111");
        System.out.println(searchContact);
        String searchContact2 = myBook.searchByNumber(89111111);
        System.out.println(searchContact2);
        ArrayList<Integer> searchNames = myBook.searchByName("Золушка");
        System.out.println(searchNames);
        String searchContacts = myBook.searchByNumber("99999999");
        System.out.println(searchContacts);
        System.out.println();
        myBook.sorted2();
        System.out.println(myBook.searchContactFromUser());

    }
}
