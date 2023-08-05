package main.java.decoratorDesignPattern;

public class VanillaCone implements IceCream {
    private IceCream iceCream;

    public VanillaCone() {
    }

    public VanillaCone(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public int getCost() {
        if(iceCream == null) return 20;
        return iceCream.getCost()+20;
    }

    @Override
    public String desc() {
        if(iceCream == null) return "Vanilla Cone ";
        return iceCream.desc() + "Vanilla Cone ";
    }
}
