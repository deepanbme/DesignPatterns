package main.java.strategyDesignPattern;

public class BikePathCalculator implements IPathCalculator{
    private static BikePathCalculator instance;

    private BikePathCalculator(){

    }

    public static BikePathCalculator getInstance(){
        if(instance == null){
            return new BikePathCalculator();
        }
        return instance;
    }

    @Override
    public void findPath(String source, String destination) {
        System.out.println("travelling from " + source + " to " + destination + " bike");
    }
}
