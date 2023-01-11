package com.materna.exercises.digits;
import java.util.Scanner;
public class Aufgabe2 {
    public static void main(String[] args) {
        int bottles;
        int bottlesCap;
        int bottlesCrew;
        int members;
        Scanner s = new Scanner(System.in);

        System.out.println("Number of bottles in total?");
        bottles = s.nextInt();

        if(bottles%2 == 0)   {
             bottlesCap = bottles/2;
             bottlesCrew = bottles/2;
        }
        else    {
             bottlesCap = (bottles-1)/2;
             bottlesCrew = (bottles+1)/2;
        }

        System.out.println("Bottles for the captain: "+bottlesCap);
        System.out.println("Bottles for all crew members: "+bottlesCrew);
        System.out.println("Number of crew members?");
        members = s.nextInt();
        System.out.println("Fair share without remainder?");

        if(bottlesCrew%members==0)  {
            System.out.println("true");
        }

        else  {
            System.out.println("false");
        }
    }
}
