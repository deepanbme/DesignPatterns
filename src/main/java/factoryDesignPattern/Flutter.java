package main.java.factoryDesignPattern;

public class Flutter {
    private SupportedPlatform supportedPlatform;

    public Flutter(SupportedPlatform supportedPlatform) {
        this.supportedPlatform = supportedPlatform;
    }

    public void setTheme(){
        System.out.println("theme set");
    }

    public UIAbstractFactory getUiFactory(){
        return UIFactory.getUiFactory(supportedPlatform);
    }
}
