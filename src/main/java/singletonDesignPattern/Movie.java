package main.java.singletonDesignPattern;

public class Movie{

    private static int movieId = 1;
    private int id;
    private String name;

    public Movie() {
        this.id = movieId++;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Movie setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
