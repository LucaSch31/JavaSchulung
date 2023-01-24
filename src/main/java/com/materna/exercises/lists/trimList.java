package com.materna.exercises.lists;

import com.materna.exercises.arrays.Array;

import java.util.ArrayList;
import java.util.List;

//1.2.3
public class trimList {
    public static void main(String[] args) {
        ArrayList list = new ArrayList<>();
        list.add(1.0);
        list.add(2.0);
        list.add(3.0);
        list.add(7.0);
        list.add(5.0);
        list.add(4.0);
        list.add(4.0);
        System.out.println(trimNonGrowingNumbers(list));
    }
    public static List trimNonGrowingNumbers(List<Double> numbers) {

            for(int i=1; i<=numbers.size(); i++) {
                double previous = numbers.get(i-1);
                double current = numbers.get(i);

                if(current<=previous)   {
                    numbers.subList(i,numbers.size()).clear();
                    break;
                }
            }
            return numbers;
    }
}
