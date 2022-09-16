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

public class Sub extends Display{
    int z;
    Scanner scan = new Scanner (System.in);
    void display(){
        
        System.out.print("Enter First Number: ");
        int a = scan.nextInt();
        
        System.out.print("Enter Second Number: ");
        int b = scan.nextInt();
        z= (int) (a - b);
        
        System.out.println("Subtraction is: "+ z);
       
    }
}
