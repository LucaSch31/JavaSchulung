package com.materna.candyLord;

public class Player {
    Neighborhood currentLocation;
    Candy[] candys = new Candy[8];
    int cash;
    int inventorySpace;
    int debt;
    int bank;
    int health;

    public Player() {
        this.bank = 0;
        this.cash = 500;
        this.debt = 0;
        this.health = 100;
        this.inventorySpace = 100;

        for(int i=0; i<8; i++)  {
            this.candys[i].amount=0;
        }
    }

    public void travel(Neighborhood nextLocation)    {
        this.currentLocation = nextLocation;
    }

    public boolean buyCandy(Candy candy, int amount)    {
        this.cash -= candy.currentPrice*amount;
        this.inventorySpace -= amount;

        return true;
    }

    public boolean sellCandy(Candy candy, int amount)   {
        this.cash += candy.currentPrice*amount;
        this.inventorySpace += amount;

        return true;
    }

    public boolean lendFromLoanShark(int amount)    {
        if(this.debt==0)    {
            this.cash += amount;
            this.debt = amount;

            return true;
        }
        else {
            return false;
        }
    }

    public void payOffLoanShark(int amount)   {
        this.debt -= amount;
        this.cash -= amount;
    }

    public void depositMoney(int amount)  {
        this.cash -= amount;
        this.bank += amount;
    }

    public void withdrawMoney(int amount)   {
        this.cash += amount;
        this.bank -= amount;
    }

    public void recalculateCandyPrices()    {}


    public int getCash() {
        return cash;
    }

    public void setCash(int cash) {
        this.cash = cash;
    }

    public int getInventorySpace() {
        return inventorySpace;
    }

    public void setInventorySpace(int inventorySpace) {
        this.inventorySpace = inventorySpace;
    }

    public int getDebt() {
        return debt;
    }

    public void setDebt(int debt) {
        this.debt = debt;
    }

    public int getBank() {
        return bank;
    }

    public void setBank(int bank) {
        this.bank = bank;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}
