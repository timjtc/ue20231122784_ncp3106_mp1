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
public class problem2 {
    
    // Pre-declare an instance of DecimalFormat used for truncating outputs
    private static final DecimalFormat dec = new DecimalFormat("#.###");
    
    public static void getPosTotal() {
        
        // Declare some variables that are convenient to reference
        char _lf = '\n';
        
        // Assign sales tax values
        double state_st = 0.04;
        double county_st = 0.02;
        
        // Get input from user
        System.out.print("Enter purchase amount: ");
        Scanner input = new Scanner(System.in);
        double purchase_amount = input.nextDouble();
        
        // Compute total sales
        double state_st_amount = purchase_amount * state_st;
        double county_st_amount = purchase_amount * county_st;
        double total_st_amount = state_st_amount + county_st_amount;
        double total_sales = purchase_amount + total_st_amount;
        
        // Print output
        System.out.println(_lf + "State sales tax: " + dec.format(state_st_amount) + " (" + (state_st * 100) + "%)");
        System.out.println("County sales tax: " + dec.format(county_st_amount) + " (" + (county_st * 100) + "%)");
        System.out.println("Total sales tax: " + dec.format(total_st_amount));
        System.out.println("Total sales amount: " + dec.format(total_sales));
        
    }
    
}
