package main.java.observerDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class AmazonPublisher implements Publisher{
    List<Subscriber> subscriberList;

    private static AmazonPublisher instance;

    private AmazonPublisher() {
        this.subscriberList = new ArrayList<>();
    }

    public static AmazonPublisher getInstance(){
        if(instance == null){
            synchronized (AmazonPublisher.class){
                if(instance == null)
                    instance =  new AmazonPublisher();
            }
        }
        return instance;
    }


    @Override
    public void subscribeEvent(Subscriber subscriber) {
        subscriberList.add(subscriber);
    }

    @Override
    public void unsubscribeEvent(Subscriber subscriber) {
        subscriberList.remove(subscriber);
    }

    public void notifySubscriber(){
        for(Subscriber s : subscriberList){
            s.updateSubscribers();
        }
    }
}
