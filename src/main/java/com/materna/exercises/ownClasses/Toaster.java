package com.materna.exercises.ownClasses;

import java.util.Objects;

public class Toaster {
    int capacity;
    boolean stainless;
    boolean extraLarge;

    public boolean equals( Object o ) {
            return  o instanceof Toaster toaster &&
                    capacity == toaster.capacity &&
                    stainless == toaster.stainless &&
                    extraLarge == toaster.extraLarge;
    }

    public int hashCode() {
        return Objects.hash( capacity, stainless, extraLarge );
    }
}