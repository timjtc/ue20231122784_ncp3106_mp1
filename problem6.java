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
public class problem6 {
    
    // Pre-declare an instance of DecimalFormat used for truncating outputs
    private static final DecimalFormat dec = new DecimalFormat("#.##");
    
    public static void computeFoodBill() {
        
        // Declare some variables that are convenient to reference
        char _lf = '\n';
        
        // Declare initial variables
        double tax = 0.0675;
        double tip = 0.05;
        
        // Get inputs from user
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the charge for the meal: $");
        double meal_charge = input.nextDouble();
        
        // Compute tax and tip
        double tax_amount = meal_charge * tax;
        double tip_amount = (meal_charge + tax_amount) * tip;
        double total_amount = meal_charge + tax_amount + tip_amount;
        
        // Print output
        System.out.println(_lf + "Meal charge: $" + meal_charge);
        System.out.println("Tax amount: $" + dec.format(tax_amount));
        System.out.println("Tip amount: $" + dec.format(tip_amount));
        System.out.println("Total bill: $" + dec.format(total_amount));
        
    }
    
}
