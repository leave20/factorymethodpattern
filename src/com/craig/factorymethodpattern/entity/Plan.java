package com.craig.factorymethodpattern.entity;

public abstract class Plan {
    protected double rate;

    /**
     * this is a method
     */
     public abstract void getRate();

    public void calculateBill(int units) {
        System.out.println(units * rate);
    }

}
