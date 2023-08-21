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
public class problem3 {
    
    // Pre-declare an instance of DecimalFormat used for truncating outputs
    private static final DecimalFormat dec = new DecimalFormat("#");
    
    public static void getCarMpg() {
        
        // Declare some variables that are convenient to reference
        char _lf = '\n';
        
        // Get inputs from user
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the number of miles you have driven: ");
        double miles_driven = input.nextDouble();
        
        System.out.print("Enter the gallons of gas you have consumed: ");
        double gallons_used = input.nextDouble();
        
        // Compute MPG
        double mpg = miles_driven / gallons_used;
        
        // Print output
        System.out.println(_lf + "Miles-per-gallon: " + dec.format(mpg));
        
    }
    
}
