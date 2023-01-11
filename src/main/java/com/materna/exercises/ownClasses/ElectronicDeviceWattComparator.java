package com.materna.exercises.ownClasses;

import java.sql.SQLOutput;

public class ElectronicDeviceWattComparator implements java.util.Comparator<ElectronicDevices>{

    @Override
    public int compare(ElectronicDevices o1, ElectronicDevices o2) {
        System.out.println(o1+" "+o2);
        return o1.getWatt() - o2.getWatt();
    }
}
