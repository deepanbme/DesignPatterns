package main.java.facadeDesignPattern;

public class PackageDeliveryFacade {

    public void getDeliveryMode(PackageInfo packageInfo){
        DeliveryModes dm = DeliveryModeFactory.getDeliveryMode(packageInfo.getWeight());
        dm.getDeliveryMode();
    }
}
