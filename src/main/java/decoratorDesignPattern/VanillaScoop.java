package main.java.decoratorDesignPattern;

public class VanillaScoop implements IceCream {
    private IceCream iceCream;

    public VanillaScoop(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public int getCost() {
        return iceCream.getCost()+50;
    }

    @Override
    public String desc() {
        return iceCream.desc() + "Vanilla Scoop ";
    }
}
