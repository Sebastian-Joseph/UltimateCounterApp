package com.kean.edu.ultimatecounterapp;

public class UltimateCounter {
    private int number;

    UltimateCounter() {
        number = 0;
    }

    public int getNumber() {
        return number;
    }

    public void reset() {
        number = 0;
    }

    public void add() {
        number++;
    }

    public void subtract() {
        number--;
    }

    public String display() {
        String num = Integer.toString(getNumber());
        return num;
    }

}
