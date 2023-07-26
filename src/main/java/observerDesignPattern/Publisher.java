package main.java.observerDesignPattern;

public interface Publisher {

    void subscribeEvent(Subscriber subscriber);
    void unsubscribeEvent(Subscriber subscriber);
}
