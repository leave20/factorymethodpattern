package com.craig.factorymethodpattern.factory;

import com.craig.factorymethodpattern.entity.CommercialPlan;
import com.craig.factorymethodpattern.entity.DomecticPlan;
import com.craig.factorymethodpattern.entity.InstitutionalPlan;
import com.craig.factorymethodpattern.entity.Plan;

public class GetPlanFactory {

    public Plan getPlan(String planType){
        if (planType==null){
            return null;
        }
        if (planType.equalsIgnoreCase("DOMESTICPLAN")){
            return new DomecticPlan();
        }else if(planType.equalsIgnoreCase("COMMERCIALPLAN")){
            return new CommercialPlan();
        }else if (planType.equalsIgnoreCase("INSTITUTIONALPLAN")){
            return new InstitutionalPlan();
        }
        return null;

    }
}
