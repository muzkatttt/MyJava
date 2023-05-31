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
        HotDrink blackTea = new HotDrink("Black Tea", 300, 40);
        HotDrink greenTea = new HotDrink("Green Tea", 400, 80);
        HotDrinkTee hotBlackTea = new HotDrinkTee("Black Tea", 100, true, 50);
        System.out.println(blackTea);
        System.out.println(greenTea);
        System.out.println(hotBlackTea);
        }
    }
