package main.java.strategyDesignPattern;

public class Client {

    public static void main(String[] args) {
        GoogleMap map = new GoogleMap();
        map.getPathForModeOfTransport("Chennai", "Vellore", TransportModeEnum.CAR);
    }
}
