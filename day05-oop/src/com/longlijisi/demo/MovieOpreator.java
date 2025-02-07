package com.longlijisi.demo;

import java.util.Scanner;

public class MovieOpreator {
    private Movie[] movies;//记住一个电影对象的数组。

    public MovieOpreator(Movie[] movies) {
        this.movies = movies;
    }

    //打印全部电影信息
    public void printAllMovie() {
        System.out.println("===========全部电影如下==============");
        for (int i = 0; i < movies.length; i++) {
            Movie m = movies[i];
            System.out.println(m.getId() + "\t" + m.getName() + "\t" + m.getPrice() + "\t" + m.getActor());
        }
    }

    public void searchMovieById() {
        System.out.println("请输入要查询的电影id：");
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        //遍历每个电影对象
        for (int i = 0; i < movies.length; i++) {
            //拿到当前遍历到的电影对象
            Movie m = movies[i];
            //判断当前电影对象的id是否使我们正在找的电影id，是则打印出该电影信息并立即结束方法。
            if(m.getId() == id){
                System.out.println(m.getId() + "\t" + m.getName() + "\t" + m.getPrice() + "\t" + m.getActor());
                return;
            }
        }
        System.out.println("没有找到该电影");
    }
}
