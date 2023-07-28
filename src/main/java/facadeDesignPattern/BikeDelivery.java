package main.java.facadeDesignPattern;

public class BikeDelivery implements DeliveryModes{
    @Override
    public void getDeliveryMode() {
        System.out.println("Package delivered via bike");
    }
}
