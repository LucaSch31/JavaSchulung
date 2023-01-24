package com.materna.candyLord;

import java.awt.*;

public class City {
    public Neighborhood[] neighborhoods;
    public String name;
    private double travelCostPerDistance;

    City(Double travelCostPerDistance)  {
        this.name = "New York";
        this.travelCostPerDistance = travelCostPerDistance;
        neighborhoods = createNeighborhoods();
    }

    public Neighborhood[] createNeighborhoods()   {
        Neighborhood[] neighborhoods= new Neighborhood[]  {
                new Neighborhood(new Point(5,2), "Bronx"),
                new Neighborhood(new Point(6,5), "Queens"),
                new Neighborhood(new Point(6,10), "Jamaica Bay"),
                new Neighborhood(new Point(4, 8), "Brooklyn"),
                new Neighborhood(new Point(3,3), "Manhattan"),
                new Neighborhood(new Point(1,8),"Jersey City"),
                new Neighborhood(new Point(8,1),"Long Island Coast"),
                new Neighborhood(new Point(6,1),"Mount Vernon")
        };
        return neighborhoods;
    }

public Neighborhood[] getNeighborhoods(){
        return this.neighborhoods;
}

public int calculateTravelCost(Neighborhood currentLocation,Neighborhood nextLocation)   {
        return (int) Math.round(currentLocation.distanceTo(nextLocation)*travelCostPerDistance);
}
}
