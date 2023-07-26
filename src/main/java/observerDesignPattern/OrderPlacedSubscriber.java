package main.java.observerDesignPattern;

public class OrderPlacedSubscriber implements Subscriber{

    public OrderPlacedSubscriber() {
        AmazonPublisher a = AmazonPublisher.getInstance();
        a.subscribeEvent(this);
    }

    @Override
    public void updateSubscribers() {
        System.out.println("order placed");
    }
}
