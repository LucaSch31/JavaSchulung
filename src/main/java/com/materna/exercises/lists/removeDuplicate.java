package com.materna.exercises.lists;

import java.util.*;

// 1.3.2
public class removeDuplicate {
    public static void main(String[] args){
        System.out.println( Arrays.toString( unique() ) ); //                                    []
        System.out.println( Arrays.toString( unique( 1, 2 ) ) ); //                      [1.0, 2.0]
        System.out.println( Arrays.toString( unique( 1, 1 ) ) ); //                           [1.0]
        System.out.println( Arrays.toString( unique( 1, 2, 1 ) ) ); //                   [1.0, 2.0]
        System.out.println( Arrays.toString( unique( 1, 2, 1, Double.NaN ) ) ); //  [1.0, 2.0, NaN]
        System.out.println( Arrays.toString( unique( 1, Double.NaN, Double.NaN ) ) ); // [1.0, NaN]
        System.out.println( Arrays.toString( unique( -0, 0 ) ) ); //                          [0.0]
    }

    public static double[] unique(double... values){

        LinkedHashSet set = new LinkedHashSet();
        Objects.requireNonNull(values);

        for(double value : values)  {
                set.add(value);
        }

        double[] output = new double[set.size()];
        Iterator<Double> iterator = set.iterator();

        for(int i=0; i< set.size(); i++)    {
            output[i] = iterator.next();
        }
        return output;
    }
}
