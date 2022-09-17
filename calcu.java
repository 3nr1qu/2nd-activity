package javasimcalcu;

import java.util.Scanner;

/**
 *
 * @author 2ndyrGroupA
 */
public class Subtraction extends Display{
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

