package main.java.decoratorDesignPattern;

public class Client {

    public static void main(String[] args) {
        IceCream iceCream = new StrawBerryScoop(new StrawBerryScoop(new VanillaCone()));

        System.out.println(iceCream.desc());
        System.out.println(iceCream.getCost());
    }
}
