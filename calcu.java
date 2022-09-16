/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javasimcalcu;

import java.util.Scanner;

/**
 *
 * @author 2ndyrGroupA
 */

public class Divide extends Display{
    float z;
    Scanner scan = new Scanner (System.in);
    void display(){
        
        System.out.print("Enter First Number: ");
        float a = scan.nextInt();
        
        System.out.print("Enter Second Number: ");
        float b = scan.nextInt();
        z= (float) (a / b);
        
        System.out.println("Division is: "+ z);
       
    }
}
