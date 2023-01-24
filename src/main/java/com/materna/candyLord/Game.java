package com.materna.candyLord;

import java.io.IOException;

public class Game {
    public static void main(String[] args) throws IOException {
        GUI.createGameSurface();
    }

    private int currentDay;
    private int currentMonth;
    private int currentYear;

    public String getCurrentDay()   {
        return this.currentYear+"/"+this.currentMonth+"/"+this.currentDay+"/";
    }

    public void proceedToNextDay()  {
        if(this.currentDay<30)  {
            this.currentDay++;
        }
        else {
            if(this.currentMonth<12)    {
                this.currentDay = 1;
                this.currentMonth++;
            }
            else {
                this.currentDay = 1;
                this.currentMonth = 1;
                this.currentYear++;
            }
        }
    }
}
