package com.materna.exercises.LambdaExpressions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class deleteEntries {
    public static void main(String[] args) {
        record City(String name, int population)    { }

        List<City> cityTour = new ArrayList<>();
        City g = new City( "Gotham (cathedral)", 8_000_000 );
        City m = new City( "Metropolis (pleasure garden)", 1_600_000 );
        City h = new City( "Hogsmeade (shopping street)", 1_124 );
        Collections.addAll( cityTour, g, m, h );

        cityTour.removeIf((c) -> (c.population<10000));
        cityTour.replaceAll((c) -> new City(c.name.substring(0,c.name.indexOf("(")), c.population));
        cityTour.forEach((c) -> System.out.println(c.name + ","+c.population));
    }
}
