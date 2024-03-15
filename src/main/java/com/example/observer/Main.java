package com.example.observer;

public class Main {
    public static void main(String[] args) {
        Stock appleStock = new Stock("AAPL", 14.00);
        StockMarket stockMarket = new StockMarket(appleStock);

        Investor investor1 = new Investor("Yanis");
        Investor investor2 = new Investor("Gerard");

        stockMarket.addObserver(investor1);
        stockMarket.addObserver(investor2);

        stockMarket.setStockPrice(170.00);
    }
}