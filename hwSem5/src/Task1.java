
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
        String searchName = myBook.searchName("Красная Шапочка");
        String searchContact = myBook.searchTelephone(89127777, "Буратино");
        String searchContact2 = myBook.searchTelephone(33333, "Золушка");
        System.out.println();
        myBook.sorted2();

    }
}
