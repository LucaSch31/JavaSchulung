package com.materna.exercises.imperativeProgramming;

public class LinePrinterDemo {
    public static void main(String[] args) {
        System.out.println(LinePrinter.line());

        System.out.println(LinePrinter.line(4));
        System.out.println(LinePrinter.line(4, 'c'));
        System.out.println(LinePrinter.line("╠", 20, '═', "╣"));
    }
}
