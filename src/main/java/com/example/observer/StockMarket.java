package com.example.observer;
import java.util.List;
import java.util.ArrayList;

class StockMarket {
    private List<Observer> observers = new ArrayList<>();
    private Stock stock;

    public StockMarket(Stock stock) {
        this.stock = stock;
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(stock.getPrice());
        }
    }

    public void setStockPrice(double price) {
        stock.setPrice(price);
        notifyObservers();
    }
}
