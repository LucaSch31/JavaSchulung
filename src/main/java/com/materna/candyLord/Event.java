package com.materna.candyLord;

public abstract class Event {
     String description;
     int duration;

     Event()    {}

     Event(String description)    {
         this.description = description;
     }
}
