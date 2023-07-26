package main.java.strategyDesignPattern;

public class CarPathCalculator implements IPathCalculator{
    private static CarPathCalculator instance;

    private CarPathCalculator(){

    }

    public static CarPathCalculator getInstance(){
        if(instance == null){
            return new CarPathCalculator();
        }
        return instance;
    }

    @Override
    public void findPath(String source, String destination) {
        System.out.println("travelling from " + source + " to " + destination + " by car");
    }
}
