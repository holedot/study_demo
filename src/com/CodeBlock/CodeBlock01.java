package com.CodeBlock;

public class CodeBlock01 {
    public static void main(String[] args) {
        Movie movie = new Movie("哈哈");
    }
}

class Movie {
    private String name;
    private double price;
    private String director;

    {
        System.out.println("电影屏幕打开");
        System.out.println("广告开始");
    }

    public Movie(String name) {
        this.name = name;
    }

    public Movie(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public Movie(String name, double price, String director) {
        this.name = name;
        this.price = price;
        this.director = director;
    }
}