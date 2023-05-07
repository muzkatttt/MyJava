
public class Task1 {
    public static void main(String[] args) {
       /*
       Реализуйте структуру телефонной книги с помощью HashMap,
       учитывая, что 1 человек может иметь несколько телефонов.
        */

        MyPhoneBook myBook = new MyPhoneBook();
        myBook.methodAdd(98767, "Понтий Пилат");
        myBook.methodAdd(11111, "Маленький Принц");
        myBook.methodAdd(23456, "Красная Шапочка");
        myBook.methodAdd(77777, "Буратино");
        myBook.methodAdd(45648, "Маленький Принц");
        System.out.println(myBook.getToList()); // вывод на экран справочника
        String searchName = myBook.searchName("Красная Шапочка");
        String searchContact = myBook.searchTelephone(77777, "Буратино");
        String searchContact2 = myBook.searchTelephone(33333, "Золушка");
    }
}
