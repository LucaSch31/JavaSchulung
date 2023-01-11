package com.materna.exercises.ownClasses;

//tag::solution[]
public class Tracer {
    public static void main(String[] args) {

    }

    private static boolean tracingIsOn;

    public static void on() {
        tracingIsOn = true;
    }

    public static void off() {
        tracingIsOn = false;
    }

    public static void trace( String msg ) {
        if ( tracingIsOn )
            System.out.println( msg );
    }

    public static void trace( String format, Object... args ) {
        if ( tracingIsOn )
            System.out.printf( format + "%n", args );
    }
}
//end::solution[]
