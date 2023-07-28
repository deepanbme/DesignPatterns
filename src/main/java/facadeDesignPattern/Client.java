package main.java.facadeDesignPattern;

public class Client {
    public static void main(String[] args) {
        PackageInfo pk = new PackageInfo(20, 110);
        PackageDeliveryFacade packageDeliveryFacade = new PackageDeliveryFacade();
        packageDeliveryFacade.getDeliveryMode(pk);
    }
}
