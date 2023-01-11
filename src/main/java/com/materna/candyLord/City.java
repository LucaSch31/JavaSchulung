package com.materna.candyLord;

public class City {
    Neighborhood[] neighborhoods= new Neighborhood[10];
    String name;
    double travelCostPerDistance;

    City()  {
        this.name = "New York";
        neighborhoods[0].name = "hood1";
        neighborhoods[1].name = "hood2";
        neighborhoods[2].name = "hood3";
        neighborhoods[3].name = "hood4";
        neighborhoods[4].name = "hood5";
        neighborhoods[5].name = "hood6";
        neighborhoods[6].name = "hood7";
        neighborhoods[7].name = "hood8";
        neighborhoods[8].name = "hood9";
        neighborhoods[9].name = "hood10";
    }

public Neighborhood[] getNeighborhoods(){
        return this.neighborhoods;
}

public int calculateTravelCost(Neighborhood nextStop)   {
    return 0;
}
}
