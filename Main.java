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
public class Main {
    
    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);
        Display arith = new Display();
        arith.display();
        System.out.print("User Chose an operator: ");
        int choose= scan.nextInt();
        
        
        switch (choose) {
            case 1:
                Addition adds= new Addition();
                adds.display();
                break;
            case 2:
                Multiply mul= new Multiply();
                mul.display();
                break;
            case 3:
                Subtraction sub= new Subtraction();
                sub.display();
                break;
            case 4:
                Division div = new Division();
                div.display();
                break;
            default:
                System.out.print("You're out of range!");
                break;
        }
        
    }
}