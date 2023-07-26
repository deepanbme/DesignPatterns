package main.java.observerDesignPattern;

public class CashBackGeneratorSubscriber implements Subscriber{


    public CashBackGeneratorSubscriber() {
        AmazonPublisher a = AmazonPublisher.getInstance();
        a.subscribeEvent(this);
    }
    @Override
    public void updateSubscribers() {
        System.out.println("cashback generated");
    }
}
