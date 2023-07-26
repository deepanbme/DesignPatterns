package main.java.observerDesignPattern;

public class InventoryManagementSubscriber implements Subscriber{


    public InventoryManagementSubscriber() {
        AmazonPublisher a = AmazonPublisher.getInstance();
        a.subscribeEvent(this);
    }
    @Override
    public void updateSubscribers() {
        System.out.println("inventory updated");
    }
}
