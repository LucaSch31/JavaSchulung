package com.materna.exercises.arrays;

import java.util.Arrays;

public class toDo {
    public static void main(String[] args) {
        String[] todo = {"Aufstehen", "Essen", "Zähne putzen", "Fegen", "Arbeiten", "Schlafen"};

        /* String[] numberedTodo = new String[todo.length];
         for(int i=0; i<todo.length;i++) {
            numberedTodo[i] = i+". "+todo[i];
            System.out.println(numberedTodo[i]);
        } */


        Arrays.asList(todo).forEach((p) -> System.out.println((Arrays.asList(todo).indexOf(p)+1) + ". "+p));
    }
}