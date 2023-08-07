package main.java.factoryDesignPattern;

import main.java.factoryDesignPattern.components.*;

public class IosUiFactory implements UIAbstractFactory{
    @Override
    public Menu createMenu() {
        return new IosMenu();
    }

    @Override
    public DropDown createDropDown() {
        return new IosDropDown();
    }

    @Override
    public Button createButton() {
        return new IosButton();
    }
}
