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
public class problem4 {
    
    // Pre-declare an instance of DecimalFormat used for truncating outputs
    private static final DecimalFormat dec = new DecimalFormat("#.##");
    
    public static void computeScoreAverage() {
        
        // Declare some variables that are convenient to reference
        char _lf = '\n';
        
        // Get inputs from user
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter first test score: ");
        double score1 = input.nextDouble();
        
        System.out.print("Enter second test score: ");
        double score2 = input.nextDouble();
        
        System.out.print("Enter third test score: ");
        double score3 = input.nextDouble();
        
        // Compute average score
        double average = (score1 + score2 + score3) / 3;
        
        // Print output
        System.out.println(_lf + "First test score: " + score1);
        System.out.println("Second test score: " + score2);
        System.out.println("Third test score: " + score3);
        System.out.println("=== === === === === ===");
        System.out.println("Average of all scores: " + dec.format(average));
        
    }
    
}
