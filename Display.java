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
class Display {
    Scanner s = new Scanner(System.in);
    void display(){
        System.out.println("Simple Calculator");
        System.out.println("Chose 1-Addition");
        System.out.println("Chose 2-Multiplication");
        System.out.println("Chose 3-Subtraction");
        System.out.println("Chose 4-Division");
    }
    
}