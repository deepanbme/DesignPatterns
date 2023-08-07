package main.java.factoryDesignPattern;

import main.java.factoryDesignPattern.components.*;

public class AndroidUiFactory implements UIAbstractFactory{
    @Override
    public Menu createMenu() {
        return new AndroidMenu();
    }

    @Override
    public DropDown createDropDown() {
        return new AndroidDropDown();
    }

    @Override
    public Button createButton() {
        return new AndroidButton();
    }
}
