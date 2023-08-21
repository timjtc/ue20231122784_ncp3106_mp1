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
public class problem7 {
    
    // Pre-declare an instance of DecimalFormat used for truncating outputs
    private static final DecimalFormat dec = new DecimalFormat("#.##");
    
    public static void calcClassComposition() {
        
        // Declare some variables that are convenient to reference
        char _lf = '\n';
        
        // Get inputs from user
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the number of male students: ");
        int male_students = input.nextInt();
        
        System.out.print("Enter the number of female students: ");
        int female_students = input.nextInt();
        
        // Compute class percentage composition by gender
        double total_students = male_students + female_students;
        double male_percent = male_students / total_students;
        double female_percent = female_students / total_students;
        
        // Print output
        System.out.println(_lf + dec.format(male_percent * 100) + "% of the class is male and " + dec.format(female_percent * 100) + "% is female.");
        
    }
}
