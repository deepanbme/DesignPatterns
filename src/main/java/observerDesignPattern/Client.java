package main.java.observerDesignPattern;

public class Client {
    public static void main(String[] args) {
        AmazonPublisher a = AmazonPublisher.getInstance();
        InventoryManagementSubscriber inventoryManagementSubscriber = new InventoryManagementSubscriber();
        OrderPlacedSubscriber orderPlacedSubscriber = new OrderPlacedSubscriber();
        CashBackGeneratorSubscriber cashBackGeneratorSubscriber = new CashBackGeneratorSubscriber();
        a.notifySubscriber();
        System.out.println("------");

        a.unsubscribeEvent(orderPlacedSubscriber);
        a.notifySubscriber();
    }
}
