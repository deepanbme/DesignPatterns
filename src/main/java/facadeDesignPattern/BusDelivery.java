package main.java.facadeDesignPattern;

public class BusDelivery implements DeliveryModes{
    @Override
    public void getDeliveryMode() {
        System.out.println("Package delivered via bus");
    }
}
