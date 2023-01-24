package com.materna.exercises.streams;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class decade {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(decades(1985, 2022)));
    }

    public static int[] decades(int start, int end)    {
        if(end<start)   {
            return new int[0];
        }
        else if(end==start) {
            int[] output = new int[1];
            output[0] = start;
            }
        else    {
           IntStream stream = IntStream.rangeClosed(start, end);
           return stream.filter(i -> i%10 == 0).toArray();
        }
        return new int[0];
    }
}
