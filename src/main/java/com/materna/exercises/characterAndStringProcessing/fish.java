package com.materna.exercises.characterAndStringProcessing;
import java.util.Scanner;

public class fish {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int repetition = s.nextInt();
        String output = "";

        for(int a=0; a<repetition; a++) {
            for (int i = 0; i < repetition; i++) {
                output += " ><>";
            }
            for (int j = 0; j < repetition; j++) {
                output += " <><";
            }
            output += "\n";
        }

        System.out.println(output);
    }
}
