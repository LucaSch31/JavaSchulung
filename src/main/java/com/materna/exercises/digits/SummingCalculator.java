package com.materna.exercises.digits;
import java.util.Scanner;

public class SummingCalculator {
    public static void main(String[] args) {

        int number;
        Scanner s = new Scanner(System.in);
        int sum = 0;

        do  {
            number = s.nextInt();
            sum += number;
        }

        while(number!=0);

        System.out.println("Sum: "+sum);
    }
}
