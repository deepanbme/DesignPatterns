package main.java.decoratorDesignPattern;

public class StrawBerryScoop implements IceCream {
    private IceCream iceCream;

    public StrawBerryScoop(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public int getCost() {
        return iceCream.getCost()+100;
    }

    @Override
    public String desc() {
        return iceCream.desc() + "StrawberryScoop Scoop ";
    }
}
