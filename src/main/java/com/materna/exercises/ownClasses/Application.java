package com.materna.exercises.ownClasses;

import java.util.Comparator;
import java.util.Timer;

public class Application {
    public static void main(String[] args) {/*
        radio grandmasOldRadio = new radio();
        System.out.println( grandmasOldRadio.isOn() );     // false
        grandmasOldRadio.on();
        System.out.println( grandmasOldRadio.isOn() );     // true
        System.out.println( grandmasOldRadio.volume );     // 0
        grandmasOldRadio.volumeUp();
        grandmasOldRadio.volumeUp();
        grandmasOldRadio.volumeDown();
        grandmasOldRadio.volumeUp();
        System.out.println( grandmasOldRadio.volume );     // 2
        System.out.println( grandmasOldRadio.toString() ); // Radio[volume=2, is on]
        System.out.println( grandmasOldRadio );            // Radio[volume=2, is on]
        grandmasOldRadio.off();

        MonitorTube monitor = new MonitorTube();
        TV television = new TV(monitor);

        television.on();
        television.off();

        monitor.tv.on();

        Ship ship1 = new Ship();
        Ship ship2 = new Ship();

        Radio radio1 = new Radio();
        radio1.on();
        radio1.volumeUp();
        Radio radio2 = new Radio();
        radio2.on();
        radio2.volumeUp();
        Radio radio3 = new Radio();

        IceMachine machine = new IceMachine();
        machine.on();

        ship1.load(machine);
        ship1.load(radio1);
        ship1.load(radio2);
        ship1.load(radio3);

        Firebox fb = new Firebox();
        System.out.println( fb.isOn() );  // true
        fb.off();
        System.out.println( fb.isOn() );  // true


        System.out.println(ship1.countDevicesSwitchedOn());
        System.out.println(ship1.toString());

        Radio bedroomRadio = new Radio();
        bedroomRadio.volumeUp();
        Radio cabooseRadio = new Radio();
        cabooseRadio.volumeUp();
        MonitorTube tube = new MonitorTube();
        TV mainTv = new TV();
        Radio crRadio = new Radio();
        Firebox alarm = new Firebox();
        Ship ship = new Ship();
        ship.load( bedroomRadio );
        ship.load( cabooseRadio );
        ship.load( mainTv );
        ship.load( crRadio );
        ship.load( alarm );
        ship.holiday();

        System.out.println(ship.countDevicesSwitchedOn());


        FreeDiscSpaceTimerTask freeSpace = new FreeDiscSpaceTimerTask();

        Timer timer = new Timer();
        timer.schedule(freeSpace, 0, 2000);

        ElectronicDevices ea1 = new Radio(); ea1.setWatt( 200 );
        ElectronicDevices ea2 = new Radio(); ea2.setWatt( 20 );
        Comparator<ElectronicDevices> c = new ElectronicDeviceWattComparator();
        System.out.println( c.compare(ea1, ea2) );
        System.out.println( c.compare(ea2, ea1) ); */
        Radio grannysRadio = new Radio();
        grannysRadio.volumeUp();
        grannysRadio.setWatt( 12_000 );

        TV grandpasTv = new TV();
        grandpasTv.setWatt( 1000 );

        Ship ship = new Ship();
        ship.load( grannysRadio );
        ship.load( grandpasTv );
        System.out.println( ship.findMostPowerConsumingElectronicDevice().getWatt() );
    }
}
