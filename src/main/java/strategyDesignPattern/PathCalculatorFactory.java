package main.java.strategyDesignPattern;

public class PathCalculatorFactory {

    public static IPathCalculator getTransportModeFactory(TransportModeEnum mode){
        return switch(mode){
            case CAR -> CarPathCalculator.getInstance();
            case WALK -> WalkPathCalculator.getInstance();
            case BIKE -> BikePathCalculator.getInstance();
        };
    }
}
