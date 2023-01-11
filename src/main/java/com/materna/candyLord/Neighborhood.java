package com.materna.candyLord;

import java.awt.*;
import java.util.HashMap;

public class Neighborhood {
    String name;
    HashMap<Candy, Double> candyPriceAdjustment;
    Point coordinates;

    Neighborhood(Point coordinates, String name)    {
        this.coordinates = coordinates;
        this.name = name;
    }

   public Neighborhood changePriceAdjustment(Candy candy, double price)    {
        this.candyPriceAdjustment.replace(candy, price);
        return this;
    }

    public double distanceTo(Neighborhood nextStop)  {
        return this.coordinates.distance(nextStop.coordinates);
    }

    public String getName()     {
        return this.name;
    }
}
