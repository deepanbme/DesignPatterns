package main.java.factoryDesignPattern;

import main.java.factoryDesignPattern.components.AndroidButton;

public class UIFactory {

    public static UIAbstractFactory getUiFactory(SupportedPlatform platform){
        return switch (platform){
            case IOS -> new IosUiFactory();
            case ANDROID -> new AndroidUiFactory();
        };
    }
}
