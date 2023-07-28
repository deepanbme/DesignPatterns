package main.java.facadeDesignPattern;

public class DeliveryModeFactory {

    public static DeliveryModes getDeliveryMode(int weight){
        if (weight > 100) return new BusDelivery();
        return new BikeDelivery();
    }
}
