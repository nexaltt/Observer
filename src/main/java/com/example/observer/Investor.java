package com.example.observer;

class Investor implements Observer {
    private String name;

    public Investor(String name) {
        this.name = name;
    }

    @Override
    public void update(double price) {
        System.out.println(name + " remarqué un changement de prix vers : $" + price);
    }
}