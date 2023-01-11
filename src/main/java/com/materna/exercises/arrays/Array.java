package com.materna.exercises.arrays;

public class Array {

    public static void main(String[] args) {
        System.out.print(allTrue(true, false, true));
    }
    public static boolean allTrue(boolean first,boolean... args)    {
        boolean output = true;
        for(boolean b : args)   {
            if(!b)  {
                output = false;
            }
        }
        return output;
    }
    public static void checkWeather()   {

        int[] windSpeed = new int[5];
        int[] windDirection = new int[5];

        for (int i=0;i<5;i++) {
            windSpeed[i] = (int) (Math.random() * 200);
            windDirection[i] = (int) (Math.random() * 360);
        }

        for(int i=0;i<5;i++) {
            System.out.printf("Windspeed: %d km/h and winddirection: %d grad\n",
                    windSpeed[i], windDirection[i]);
        }
    }
}

