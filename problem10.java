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
public class problem10 {
    
    // Pre-declare an instance of DecimalFormat used for truncating outputs
    private static final DecimalFormat dec = new DecimalFormat("#.##");
    
    public static void calcStockProfit() {
        
        // Declare some variables that are convenient to reference
        char _lf = '\n';
        char _ht = '\t';
        String _cur = "$";
        
        // Declare initial variables
        double stock_buy_price = 32.87;
        double stock_sell_price = 33.92;
        double broker_com = 0.02;
        
        // Get inputs from user
        Scanner input = new Scanner(System.in);
        
        System.out.println("Hi, Jerrick!");
        
        System.out.print("How many shares did you buy? ");
        int n_buy = input.nextInt();
        
        System.out.print("How many shares did you sell? ");
        int n_sell = input.nextInt();
        
        // Compute the cost of the transaction
        double buy_per_share_amount = n_buy * stock_buy_price;
        double buy_com_amount = buy_per_share_amount * broker_com;
        double buy_total_cost = buy_per_share_amount + buy_com_amount;
        
        // Compute the profit froms selling the stock
        double sell_per_share_amount = n_sell * stock_sell_price;
        double sell_com_amount = sell_per_share_amount * broker_com;
        double sell_total_profit = sell_per_share_amount - sell_com_amount - buy_total_cost;
        
        // Print output
        System.out.println(_lf + "Stock share buy data:");
        System.out.println(_ht + "Price per share: " + _cur + dec.format(stock_buy_price));
        System.out.println(_ht + "Amount for shares: " + '-' + _cur + dec.format(buy_per_share_amount));
        System.out.println(_ht + "Broker commission: " + '-' + _cur + dec.format(buy_com_amount));
        System.out.println(_ht + "Transaction cost: " + '-' + _cur + dec.format(buy_total_cost));
        System.out.println("Stock share sell data:");
        System.out.println(_ht + "Price per share: " + _cur + dec.format(stock_sell_price));
        System.out.println(_ht + "Amount for shares: " + '+' + _cur + dec.format(sell_per_share_amount));
        System.out.println(_ht + "Broker commission: " + '-' + _cur + dec.format(sell_com_amount));
        System.out.println(_ht + "Total profit: " + ((sell_total_profit < 0) ? '-' : '+') + _cur + dec.format(Math.abs(sell_total_profit)));
        
    }
}
