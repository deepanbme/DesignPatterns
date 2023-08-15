package main.java.singletonDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class Theatre {

    private List<Movie> movieList;
    private static Theatre instance;

    private Theatre() {
        this.movieList = new ArrayList<>();
    }

    public static Theatre getInstance(){
        if(instance == null){
            synchronized (Theatre.class){
                if(instance == null){
                    instance = new Theatre();
                }
            }
        }
        return instance;
    }

    public List<Movie> getMovieList() {
        return movieList;
    }

    public void setMovieList(Movie movie) {
        this.movieList.add(movie);
    }


}
