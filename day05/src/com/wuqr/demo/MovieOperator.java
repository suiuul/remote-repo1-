package com.wuqr.demo;

import java.util.Scanner;

public class MovieOperator {
    private Movie[] movies;

    public MovieOperator(){

    }
    public MovieOperator(Movie[] movies){
        this.movies = movies;
    }

    public void ShowAllMovies(){
        System.out.println("====输出所有电影====");
        for (int i = 0; i < movies.length; i++){
            Movie m = movies[i];
            System.out.println( m.getId() + "\t" + m.getName() + '\t' + m.getPrice() + '\t' + m.getActor());
            //输出必须用双引号\t，不然会做相加计算！！！！
        }
    }

    public void SearchMovieById() {
        System.out.println("please input the id you need");
        Scanner sc = new Scanner(System.in);
        int yourID = sc.nextInt();
        for (int i = 0; i < movies.length; i++) {
            Movie m = movies[i];
            if (m.getId() == yourID){
                System.out.println( m.getId() + "\t" + m.getName() + '\t' + m.getPrice() + '\t' + m.getActor());
                return;
            }
        }
        System.out.println("can't find the movie");
    }
}
