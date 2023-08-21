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
public class problem9 {
    
    // Pre-declare an instance of DecimalFormat used for truncating outputs
    private static final DecimalFormat dec = new DecimalFormat("#.##");
    
    public static double quarterCeil(double x) {
        
        return Double.parseDouble(dec.format(Math.ceil(x*4)/4d));
        
    }
    
    public static void computeIngredientsNeeded() {
        
        // Declare some variables that are convenient to reference
        char _lf = '\n';
        
        // Declare initial variables
        double sugar_ratio = 0.03125;
        double butter_ratio = (1.0 / 48);
        double flour_ratio = (2.75 / 48);
        
        // Get inputs from user
        Scanner input = new Scanner(System.in);
        
        System.out.print("How many cookies do you want to make? ");
        int n_cookies = input.nextInt();
        
        // Compute the needed ingredients
        double sugar = n_cookies * sugar_ratio;
        double butter = n_cookies * butter_ratio;
        double flour = n_cookies * flour_ratio;
        
        // Print output
        System.out.println(_lf + "You will need the following ingredients:");
        System.out.println(quarterCeil(sugar)  + " cup" + ((sugar == 1) ? "" : "s") + " of sugar");
        System.out.println(quarterCeil(butter) + " cup" + ((butter == 1) ? "" : "s") + " of butter");
        System.out.println(quarterCeil(flour) + " cup" + ((flour == 1) ? "" : "s") + " of flour");
        
    }
}
