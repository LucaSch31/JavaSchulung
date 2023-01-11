package org.example;

public abstract class Event {
     String description;
     int duration;

     Event()    {}

     Event(String description)    {
         this.description = description;
     }
}
