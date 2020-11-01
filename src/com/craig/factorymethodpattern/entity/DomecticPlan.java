package com.craig.factorymethodpattern.entity;

public class DomecticPlan extends Plan {
    @Override
   public void getRate() {
        rate = 3.50;
    }
}
