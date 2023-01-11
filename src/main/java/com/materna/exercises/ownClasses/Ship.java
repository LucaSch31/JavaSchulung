package com.materna.exercises.ownClasses;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Ship {

    private final ArrayList<ElectronicDevices> devices = new ArrayList<ElectronicDevices>();

    public void load(ElectronicDevices device)   {
        if(device instanceof Radio) {
            if(((Radio) device).getVolume() != 0)  {
                System.out.println("Remember to pay license fee!");
                devices.add(device);
            }
        }
        else {
            devices.add(device);
        }
        devices.sort(new ElectronicDeviceWattComparator());
    }

    public int countDevicesSwitchedOn()     {
        int count = 0;
        for(ElectronicDevices device: devices)    {
            if(device.isOn())    {
                count++;
            }
        }
        return count;
    }

    public String toString()    {
        return "Ship["+ devices.toString()+"]";
    }

    public void holiday()   {
        for(ElectronicDevices device : devices) {
                device.off();
        }
    }

    public ElectronicDevices findMostPowerConsumingElectronicDevice()   {
        ElectronicDeviceWattComparator current = new ElectronicDeviceWattComparator();
        return Collections.max(devices, current);
    }

}
