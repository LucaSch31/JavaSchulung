package com.materna.exercises.LambdaExpressions;

import java.awt.*;
import java.awt.event.ActionListener;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class main {
    public static void main(String[] args) {
        /* interface Runnable    { void run(); }
interface ActionListener { void actionPerformed(ActionEvent e); }
interface Supplier<T>    { T get(); }
interface Consumer<T>    { void accept(T t); }
interface Comparator<T>  { int compare(T o1, T o2); } */
        Runnable              runnable   = () -> {};
        ActionListener listener   = (e) -> {};
        Supplier<String> supplier   = () -> {return "";};
        Consumer<Point> consumer   = (t) -> {};
        Comparator<Rectangle> comparator = (o1, o2) -> {return 1;};
    }
}
