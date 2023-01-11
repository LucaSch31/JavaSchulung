package com.materna.exercises.digits;
import java.util.Scanner;

public class SvgCircle1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int x = s.nextInt();
        int y = s.nextInt();
        double r = 10 * (Math.random()) + 10;

        System.out.print("<svg height=\"100\" width=\"500\"> \n <circle cx=\""+x+"\" cy=\""+y+"\" r=\""+r+"\" /> \n </svg>");
    }
}
