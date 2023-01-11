package org.example;

public class Game {

    int currentDay;
    int currentMonth;
    int currentYear;

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
