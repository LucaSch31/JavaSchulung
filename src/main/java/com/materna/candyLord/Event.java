package com.materna.candyLord;

public abstract class Event {
     private final String description;
     private final int duration;

     Event(String description, int duration)    {
          this.description = description;
          this.duration = duration;
     }

     public void process(Player player) {

     }

     public String getDescription()     {
          return this.description;
     }

     public int getDuration()      {
          return this.duration;
     }
}
