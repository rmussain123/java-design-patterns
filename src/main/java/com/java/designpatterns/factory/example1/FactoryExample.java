package com.java.designpatterns.factory.example1;

public class FactoryExample {
    public Entertainment getMovies(String movieType){
        if (movieType == null) {
            return null;
        }
        switch (movieType){
            case "Ott" :
                return new Ott();
            case "Theatre" :
                return new Theatre();
            case "Television":
                return new Television();


        }
        return null;
    }
}
