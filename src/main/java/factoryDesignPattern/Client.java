package main.java.factoryDesignPattern;

import main.java.factoryDesignPattern.components.Button;
import main.java.factoryDesignPattern.components.DropDown;
import main.java.factoryDesignPattern.components.Menu;

public class Client {
    public static void main(String[] args) {
        Flutter flutter = new Flutter(SupportedPlatform.ANDROID);
        UIAbstractFactory factory = flutter.getUiFactory();
        Menu menu = factory.createMenu();
        Button button = factory.createButton();
        DropDown dropDown = factory.createDropDown();
    }
}
