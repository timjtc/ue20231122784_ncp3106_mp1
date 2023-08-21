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
public class problem8 {
    
    // Pre-declare an instance of DecimalFormat used for truncating outputs
    private static final DecimalFormat dec = new DecimalFormat("#.##");
    
    public static void calcStockCost() {
        
        // Declare some variables that are convenient to reference
        char _lf = '\n';
        String _cur = "PHP ";
        
        // Declare initial variables
        double stock_price = 21.77;
        double broker_com = 0.02;
        
        // Get inputs from user
        Scanner input = new Scanner(System.in);
        
        System.out.println("Hi, Diana!");
        System.out.print("How many shares did you buy? ");
        int n_share = input.nextInt();
        
        // Compute the cost of the transaction
        double per_share_amount = n_share * stock_price;
        double com_amount = per_share_amount * broker_com;
        double total_cost = per_share_amount + com_amount;
        
        // Print output
        System.out.println(_lf + "Amount paid per stock share: " + _cur + dec.format(per_share_amount));
        System.out.println("Amount paid for broker commission: " + _cur + dec.format(com_amount));
        System.out.println("Total transaction cost: " + _cur + dec.format(total_cost));
        
    }
}
