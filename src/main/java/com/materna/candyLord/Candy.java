package com.materna.candyLord;

import java.lang.Math;

public class Candy {
    final String name;
    final int minPrice;
    final int maxPrice;
    int amount;
    int currentPrice;

    public Candy(String name, int minPrice, int maxPrice)  {
        this.name = name;
        this.minPrice = minPrice;
        this.maxPrice = maxPrice;
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
