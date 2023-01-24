package com.materna.exercises.dateTime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.Year;
import java.time.temporal.*;

public class friday13th {
    public static void main(String[] args) {
        System.out.print(friday13thCounter(2023));
    }

    public static int friday13thCounter(int year)   {
        int counter=0;

        for(int month=1; month<=12; month++) {
            DayOfWeek dotw = LocalDate.of(year, month, 13).getDayOfWeek();
            if(dotw == DayOfWeek.FRIDAY) {
                counter++;
            }
        }
        return counter;
    }
}
