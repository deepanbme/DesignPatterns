package main.java.factoryDesignPattern;

import main.java.factoryDesignPattern.components.Button;
import main.java.factoryDesignPattern.components.DropDown;
import main.java.factoryDesignPattern.components.Menu;

public interface UIAbstractFactory {
    Menu createMenu();
    DropDown createDropDown();
    Button createButton();
}
