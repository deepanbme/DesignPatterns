package main.java.flyweightDesignPattern;

public class BulletType {

    private Byte image; //Intrinsic
    private double radius; //Intrinsic
    private int maxDamage; //Intrinsic
    private int range; //Intrinsic
    private double length; //Intrinsic
    private int color; //Intrinsic

    public Byte getImage() {
        return image;
    }

    public BulletType setImage(Byte image) {
        this.image = image;
        return this;
    }

    public double getRadius() {
        return radius;
    }

    public BulletType setRadius(double radius) {
        this.radius = radius;
        return this;
    }

    public int getMaxDamage() {
        return maxDamage;
    }

    public BulletType setMaxDamage(int maxDamage) {
        this.maxDamage = maxDamage;
        return this;
    }

    public int getRange() {
        return range;
    }

    public BulletType setRange(int range) {
        this.range = range;
        return this;
    }

    public double getLength() {
        return length;
    }

    public BulletType setLength(double length) {
        this.length = length;
        return this;
    }

    public int getColor() {
        return color;
    }

    public BulletType setColor(int color) {
        this.color = color;
        return this;
    }

    @Override
    public String toString() {
        return "BulletType{" +
                "image=" + image +
                ", radius=" + radius +
                ", maxDamage=" + maxDamage +
                ", range=" + range +
                ", length=" + length +
                ", color=" + color +
                '}';
    }
}
