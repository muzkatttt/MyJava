public class Main {
    public static void main(String[] args) {
        /*Создать наследника реализованного класса Горячий Напиток с дополнительным
        полем int температура.
        Создать класс Горячих Напитков Автомат, реализующий
        интерфейс ТорговыйАвтомат и реализовать перегруженный
        метод getProduct(int name, int volume, int temperature),
        выдающий продукт соответствующий имени, объёму и температуре
        В main проинициализировать несколько ГорячихНапитков и ГорячихНапитковАвтомат
        и воспроизвести логику, заложенную в программе
        Всё вышеуказанное создать согласно принципам ООП, пройденным на семинаре
        Формат сдачи:
        Ссылка на гитхаб проект
        Подписать фамилию и номер группы
        */

        HotDrink blackTea = new HotDrink("Black tea", 100, 300, 40);
        HotDrink greenTea = new HotDrink("Green tea", 150, 400, 80);
        HotDrink hotBlackTea = new HotDrink("Black tea", 150, 400, 90);
        HotDrink aqua = new HotDrink("Aqua", 80, 100, 10);
        HotDrink coffee = new HotDrink("Coffee", 300, 90);

        System.out.println(blackTea);
        System.out.println(greenTea);
        System.out.println(hotBlackTea);
        System.out.println(aqua);
        System.out.println(coffee);
    }
}
