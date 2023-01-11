package com.materna.exercises.digits;
import java.util.Scanner;

public class TwentyOne {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int Ausgabe;
        String Ausgabe2;

        System.out.println("points of dealer: ");
        int dealer = s.nextInt();

        System.out.println("points of player: ");
        int player = s.nextInt();

        if(dealer>21 && player>21)  {
            Ausgabe = 0;
        } else if (dealer==21 || player==21) {
            Ausgabe = 21;
        } else if (dealer>21 || player>21)  {
            if(dealer>21)   {
                Ausgabe = player;
            }
            else {
                Ausgabe = dealer;
            }
        } else if (dealer == 0 || player == 0) {
            Ausgabe2 = "lead to the end of the program";
        } else {
            if(dealer>player)   {
                Ausgabe = dealer;
            }
            else {
                Ausgabe = player;
            }
            System.out.println(Ausgabe);
        }

    }

}
