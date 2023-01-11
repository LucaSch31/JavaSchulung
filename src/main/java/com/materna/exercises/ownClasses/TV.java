package com.materna.exercises.ownClasses;

public class TV extends ElectronicDevices{

    private MonitorTube monitor;

    public TV() {};
    public TV(MonitorTube mt)   {
        this.monitor = mt;
    }
    public static void main(String[] args) {

    }

    public void on()    {
        System.out.println("TV ON");
        super.on();
        monitor.on();
    }

    public void off()   {
        System.out.println("TV OFF");
        super.off();
        monitor.off();
    }
}
