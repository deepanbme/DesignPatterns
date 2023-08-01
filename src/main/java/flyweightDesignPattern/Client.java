package main.java.flyweightDesignPattern;

import java.util.List;

public class Client {
    public static void main(String[] args) {
        BulletType bulletType = new BulletType()
                .setImage(null)
                .setColor(1)
                .setLength(10.0)
                .setMaxDamage(90)
                .setRadius(10)
                .setRange(50);

        Bullet bullet = new Bullet()
                .setBulletType(bulletType)
                .setCoordinates(List.of(new Coordinate(1, 2, 3)))
                .setDirections(List.of(new Direction(1, 2, 3)))
                .setTargetCoordinates(List.of(new Coordinate(1, 2, 3)))
                .setSpeed(100);
    }
}
