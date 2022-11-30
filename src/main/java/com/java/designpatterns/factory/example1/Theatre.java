package com.java.designpatterns.factory.example1;

public class Theatre implements Entertainment{
    @Override
    public void movies() {
        System.out.println("Inside theatre movies!");
    }
}
