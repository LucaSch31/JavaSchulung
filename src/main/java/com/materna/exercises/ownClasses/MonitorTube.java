package com.materna.exercises.ownClasses;

public class MonitorTube {

    TV tv = new TV(this);
    public void on()    {
        System.out.println("MonitorTube ON");
    }

    public void off()   {
        System.out.println("MonitorTube OFF");
    }
}
