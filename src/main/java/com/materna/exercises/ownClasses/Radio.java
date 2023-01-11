package com.materna.exercises.ownClasses;

public class Radio extends ElectronicDevices{

    public Radio()  {}

    public Radio(double frequency) {
        this.frequency = frequency;
    }

    public Radio(String sender)    {
        this(stationNameToFrequency(sender));
    }

    public Radio(Radio radio)   {
        this.setFrequency(radio.frequency);
        this.setModulation(radio.modulation);
        this.volume = radio.volume;
        this.isOn = radio.isOn;
    }

    public enum Modulation {
        FM, AM
    }
    private int volume;
    private double frequency;

    private Modulation modulation = Modulation.AM;

    public static void main(String[] args) {
        Radio radio = new Radio(91.20);
        Radio radio2 = new Radio(radio);
        System.out.print(radio2.toString());
    }

    public void setOn(boolean on) {
        isOn = on;
    }

    public int getVolume() {
        return volume;
    }


    public double getFrequency() {
        return frequency;
    }

    public void setFrequency(double frequency) {
        this.frequency = frequency;
    }

    public void volumeUp()  {
        this.volume++;
    }

    public void volumeDown()  {
        this.volume--;
    }


    @Override
    public String toString() {
        return "Radio{" +
                "volume=" + volume +
                ", frequency=" + frequency +
                ", modulation=" + modulation +
                ", isOn=" + isOn +
                "} " + super.toString();
    }

    public static double stationNameToFrequency(String str) {
        return switch(str)  {
            case "1Live" -> 107.60;
            case "WDR2" -> 86.80;
            case "WDR3" -> 76.30;
            case "Radio 91.2" -> 91.20;
            default -> 0.0;
        };
    }

    public void setModulation(Modulation modulation)    {
        this.modulation = modulation;
    }

    public Modulation getModulation() {
        return modulation;
    }
}
