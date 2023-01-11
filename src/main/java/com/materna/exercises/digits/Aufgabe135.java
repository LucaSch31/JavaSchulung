package com.materna.exercises.digits;

public class Aufgabe135 {
    public static void main(String[] args) {
        int noOfBottles = 1;
        String statement;

        if(noOfBottles == 1)  {
            statement = noOfBottles + " bottle of rum";
        }
        else {
            statement = noOfBottles + " bottles of rum";
        }
        System.out.println(statement);
    }
}
