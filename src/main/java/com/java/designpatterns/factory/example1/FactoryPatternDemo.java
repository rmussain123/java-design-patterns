package com.java.designpatterns.factory.example1;

public class FactoryPatternDemo {
    public static void main(String[] args) {
        FactoryExample factoryExample = new FactoryExample();
        Entertainment entertainment = factoryExample.getMovies("Ott");
        entertainment.movies();

        Entertainment entertainment2 = factoryExample.getMovies("Television");
        entertainment2.movies();

        Entertainment entertainment3 = factoryExample.getMovies("Theatre");
        entertainment3.movies();
    }
}
