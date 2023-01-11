package com.materna.exercises.characterAndStringProcessing;
import java.util.Scanner;

public class diamonds {
    public static void main(String[] args) {
        createDiamond();
    }

    static void createDiamond() {
        Scanner s = new Scanner(System.in);
        final String alph = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String output = "";
        int width = s.nextInt();

        for(int i=1; i<=width/2; i++) {
            for(int j=1; j<=i; j++) {
                output += alph.charAt(j-1);

            }
            output += "\n";
        }

        for(int i=1; i<=width/2; i++)     {
            for(int j=width-i; j>0; j--)  {
                output += alph.charAt(j+1);
            }
            output += "\n";
        }


        System.out.print(output);
    }

}
