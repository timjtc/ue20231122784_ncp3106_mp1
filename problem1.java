/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.uecpe.ue20231122784_ncp3106_mp1;

/**
 *
 * @author timothyjtc
 */
public class problem1 {
    
    public static void printInfo() {
        
        char _lf = '\n';
        char _sp = ' ';
        String _delimiter = ", ";
        
        String name = "Timothy James Concepcion";
        String address_line1 = "Blk 7 Lot 9 Noah St, Brgy Kaypian";
        String address_line2 = "San Jose del Monte, Bulacan";
        String address_zip = "3023";
        String telnum = "+63 976 042 1984";
        String course = "Bachelor of Science in Computer Engineering";
                
        System.out.println(name + _lf + address_line1 + _delimiter + address_line2 + _sp + address_zip + _lf + telnum + _lf + course);
        
    }
    
}
