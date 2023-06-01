import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Market implements QueueBahaviour, MarketBahaviour {

    private List<Human> humansInMarket;
    private Queue<Human> humansQueue;

    public Market() {
        this.humansInMarket = new ArrayList<>();
        this.humansQueue = new LinkedList<>();
    }

    @Override
    public void acceptToMarket(Human human) {
        humansInMarket.add(human);
    }

    @Override
    public void releaseFromMarket(Human human) {
        humansInMarket.remove(human);
    }

    @Override
    public void takeQueue(Human human) {
        humansQueue.offer(human);
    }

    @Override
    public void takeOrders() {
        humansQueue.peek().setMakeOrder();
    }

    @Override
    public void giveOrders() {
        humansQueue.peek().isTakeOrder();
    }

    @Override
    public void releaseFromQueue() {
        System.out.println("Good buy " + humansQueue.peek().name);
        releaseFromMarket(humansQueue.poll());
        System.out.println("Humans in market " + humansInMarket.size());
    }

    void update() {
        for (Human h : humansInMarket) {
            humansQueue.offer(h);
        }
        while (!humansQueue.isEmpty()) {
            takeOrders();
            giveOrders();
            releaseFromQueue();
        }
        System.out.println("Queue is empty");
    }
}
