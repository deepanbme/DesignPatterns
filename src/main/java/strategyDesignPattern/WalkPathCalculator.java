package main.java.strategyDesignPattern;

public class WalkPathCalculator implements IPathCalculator{
    private static WalkPathCalculator instance;

    private WalkPathCalculator(){

    }

    public static WalkPathCalculator getInstance(){
        if(instance == null){
            return new WalkPathCalculator();
        }
        return instance;
    }

    @Override
    public void findPath(String source, String destination) {
        System.out.println("travelling from " + source + " to " + destination + "  by walk" );
    }
}
