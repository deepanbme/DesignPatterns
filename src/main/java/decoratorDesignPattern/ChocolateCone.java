package main.java.decoratorDesignPattern;

public class ChocolateCone implements IceCream {
    private IceCream iceCream;

    public ChocolateCone() {
    }

    public ChocolateCone(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public int getCost() {
        if(iceCream == null) return 40;
        return iceCream.getCost()+40;
    }

    @Override
    public String desc() {
        if(iceCream == null) return "Chocolate Cone ";
        return iceCream.desc() + "Chocolate Cone ";
    }
}
