package com.wuqr.demo;

public class test_movie {
    public static void main(String[] args) {
        Movie[] movies = new Movie[6];
        movies[0] = new Movie(1, "aaa", 1, "aaa");
        movies[1] = new Movie(2, "bbb", 2, "bbb");
        movies[2] = new Movie(3, "ccc", 3, "ccc");
        movies[3] = new Movie(4, "ddd", 4, "ddd");
        movies[4] = new Movie(5, "eee", 5, "eee");
        movies[5] = new Movie(6, "fff", 6, "fff");

        MovieOperator mo = new MovieOperator(movies);
        mo.ShowAllMovies();
        mo.SearchMovieById();

    }
}
