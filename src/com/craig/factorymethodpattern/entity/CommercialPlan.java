package com.craig.factorymethodpattern.entity;

public class CommercialPlan extends Plan {

    @Override
   public void getRate() {
        rate = 7.50;
    }
}
