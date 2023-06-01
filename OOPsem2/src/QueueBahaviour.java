public interface QueueBahaviour {
    void takeQueue(Human human);

    void takeOrders();

    void giveOrders();

    void releaseFromQueue();
}
