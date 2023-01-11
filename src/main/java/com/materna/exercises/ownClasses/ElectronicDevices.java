package com.materna.exercises.ownClasses;

abstract class ElectronicDevices {
    public boolean isOn;

    private int watt;

    public static int numberOfElectronicDevices(ElectronicDevices... devices)   {
        int output = 0;
        for(ElectronicDevices device: devices)  {
            if(device.isOn())   {
                output++;
            }
        }
        return output;
    }

    public void on()    {
        this.isOn = true;
    }

    public void off()   {
        this.isOn = false;
    }

    public boolean isOn()   {
        return this.isOn;
    }

    @Override
    public String toString() {
        return "ElectronicDevice[" +
                "watt= " + watt +
                ']';
    }

    public int getWatt() {
        return watt;
    }

    public void setWatt(int watt) {
        this.watt = watt;
    }
}
