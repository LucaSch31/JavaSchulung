package com.materna.candyLord;

import java.lang.Math;

public class Candy {
    private final String name;
    private final int minPrice;
    private final int maxPrice;
    private int amount;
    private int currentPrice;

    public Candy(String name, int minPrice, int maxPrice)  {
        this.name = name;
        this.minPrice = minPrice;
        this.maxPrice = maxPrice;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void calculateCurrentPrice(){
        currentPrice = (int) (Math.random() * maxPrice) + minPrice;
    }

    public void increaseAmountBy(int amount)    {
        this.amount += amount;
    }

    public void reduceAmountBy(int amount)  {
        this.amount -= amount;
    }

    public int getAmount()  {
        return this.amount;
    }

    public int getCurrentPrice()    {
        return this.currentPrice;
    }
}
