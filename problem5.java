/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.uecpe.ue20231122784_ncp3106_mp1;
import java.util.Scanner;
import java.text.DecimalFormat;

/**
 *
 * @author timothyjtc
 */
public class problem5 {
    
    // Pre-declare an instance of DecimalFormat used for truncating outputs
    private static final DecimalFormat dec = new DecimalFormat("#.##");
    
    public static void computeProfitData() {
        
        // Declare some variables that are convenient to reference
        char _lf = '\n';
        
        // Declare initial variables
        double profit_rate = 0.4;
        
        // Get inputs from user
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter retail price: $");
        double retail_price = input.nextDouble();
        
        // Compute company profit and product SRP
        double profit = retail_price * profit_rate;
        double srp = retail_price + profit;
        
        // Print output
        System.out.println(_lf + "Proft at " + dec.format(profit_rate * 100) + "%: +$" + dec.format(profit));
        System.out.println("Product must be sold at $" + dec.format(srp) + ".");
        
    }
    
}
