package main.java.singletonDesignPattern;

public class Client {
    public static void main(String[] args) {
        Movie beetle = new Movie()
                .setName("beetle");

        Movie flash = new Movie()
                .setName("flash");

        Theatre theatre1 = Theatre.getInstance();
        theatre1.setMovieList(beetle);

        Theatre theatre2 = Theatre.getInstance();
        theatre2.setMovieList(flash);

        System.out.println(theatre1);
        System.out.println(theatre2);

    }
}
