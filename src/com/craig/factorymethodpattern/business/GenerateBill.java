package com.craig.factorymethodpattern.business;

import com.craig.factorymethodpattern.entity.Plan;
import com.craig.factorymethodpattern.factory.GetPlanFactory;

import java.io.*;

public class GenerateBill {
    public static void main(String[] args) throws IOException {
        GetPlanFactory planFactory = new GetPlanFactory();
        System.out.println("Ingrese el nombre del plan para el cual se generará la factura :");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String planName = br.readLine();
        System.out.println("Introduzca el numero de unidades para que sea claculado en la factura");
        int units = Integer.parseInt(br.readLine());

        Plan p = planFactory.getPlan(planName);
        System.out.println("Bill amount for " + planName + " of " + units + " units is:");
        p.getRate();
        p.calculateBill(units);
    }
}
