package com.materna.exercises.ownClasses;

public class Firebox extends ElectronicDevices {
    public Firebox()    {
        this.on();
    }

    @Override public void off()   {
        System.out.println("ausschalten nicht möglich!");
    }
}
