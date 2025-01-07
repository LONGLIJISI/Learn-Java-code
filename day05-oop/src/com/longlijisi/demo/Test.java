package com.longlijisi.demo;

public class Test {
    //目标：完成面向对象的综合小案例
    //1.设计电影类，以便创建电影对象，封装电影数据。
    //2.封装系统中的全部电影数据。（自己造一些数据）
    public static void main(String[] args) {
        Movie[] movies = new Movie[6];
        //movies = [null,null,null,null,null,null,]
        //           0    1    2    3    4     5

        movies[0] = new Movie(1,"星际穿越",9.6,"安妮海瑟薇");
        movies[1] = new Movie(2,"复仇者联盟4",9.2,"小罗伯特唐尼");
        movies[2] = new Movie(3,"阿凡达：水之道",9.2,"山姆沃辛顿");
        movies[3] = new Movie(4,"死神来了",9.2,"基努里维斯");
        movies[4] = new Movie(5,"流浪地球",9.2,"吴京");
        movies[5] = new Movie(6,"超凡蜘蛛侠",9.8,"安德鲁加菲尔德");

        //3.创建电影操作对象出来，专门负责电影数据的业务操作。
        MovieOpreator mo = new MovieOpreator(movies);
        mo.printAllMovie();// ALT + ENTER
        mo.searchMovieById();
    }
}
