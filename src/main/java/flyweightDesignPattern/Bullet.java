package main.java.flyweightDesignPattern;

import java.util.List;

public class Bullet {
    private double speed; //Extrinsic
    private List<Direction> directions; //Extrinsic
    private List<Coordinate> coordinates; //Extrinsic
    private List<Coordinate> targetCoordinates; //Extrinsic
    BulletType bulletType;

    public double getSpeed() {
        return speed;
    }

    public Bullet setSpeed(double speed) {
        this.speed = speed;
        return this;
    }

    public List<Direction> getDirections() {
        return directions;
    }

    public Bullet setDirections(List<Direction> directions) {
        this.directions = directions;
        return this;
    }

    public List<Coordinate> getCoordinates() {
        return coordinates;
    }

    public Bullet setCoordinates(List<Coordinate> coordinates) {
        this.coordinates = coordinates;
        return this;
    }

    public List<Coordinate> getTargetCoordinates() {
        return targetCoordinates;
    }

    public Bullet setTargetCoordinates(List<Coordinate> targetCoordinates) {
        this.targetCoordinates = targetCoordinates;
        return this;
    }

    public BulletType getBulletType() {
        return bulletType;
    }

    public Bullet setBulletType(BulletType bulletType) {
        this.bulletType = bulletType;
        return this;
    }

    @Override
    public String toString() {
        return "Bullet{" +
                "speed=" + speed +
                ", directions=" + directions +
                ", coordinates=" + coordinates +
                ", targetCoordinates=" + targetCoordinates +
                ", bulletType=" + bulletType +
                '}';
    }
}
