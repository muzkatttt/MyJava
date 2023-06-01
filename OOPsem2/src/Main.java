public class Main {
    public static void main(String[] args) {
        /*
        Задание 2. Необходимо реализовать строение классов, без конкретной реализации:
        1. Интерфейс QueueBehaviour, который описывает логику очереди – помещение
        в/освобождение из очереди, принятие/отдача заказа
        2. Интерфейс MarketBehaviour, который описывает логику
        магазина – приход/уход покупателей, обновление состояния магазина
        3. Класс Market, который реализовывает два вышеуказанных интерфейса
         и хранит в списке список людей в очереди в различных статусах
         */
        Human h = new Human("Robert");
        Human h2 = new Human("Douny");
        Human h3 = new Human("Junior");
        Human h4 = new Human("Stark");

        Market market = new Market();

        market.acceptToMarket(h);
        market.acceptToMarket(h2);
        market.acceptToMarket(h3);
        market.acceptToMarket(h4);

        market.update();
    }
}
