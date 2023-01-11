package com.materna.exercises.imperativeProgramming;

public class LinePrinter {
    public static void main(String[] args) {

    }
    static String line()  {
        return "♥♥♥♥♥♥♥♥♥♥";
    }

    static String line(int len)   {
        String output = "";
        for(int i=0; i<len;i++) {
            output += "-";
        }
        return output;
    }

    static String line(int len, char c) {
        String output = "";
        for(int i=0; i<len;i++) {
            output += c;
        }
        return output;
    }

    static String line(String prefix, int len, char c, String suffix)   {
        String output = prefix+"";
        output += line(len, c);
        output += suffix;
        return output;
    }

}
