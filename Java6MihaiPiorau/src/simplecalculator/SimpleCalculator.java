/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplecalculator;

/**
 *
 * @author Home
 */
import java.util.Scanner;
public class SimpleCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       double a, b, res;
       char ch;
       Scanner scan = new Scanner(System.in);
	   
       System.out.print("Please introduce your first number: ");
       a = scan.nextDouble();
       
       System.out.print("Please introduce operator (+, -, *, /) : ");
       ch = scan.next().charAt(0);
       System.out.print("Please introduce the second number number : ");
       b = scan.nextDouble();
           
	   
       if(ch == '+')
       {
            res = a + b;
            System.out.print("Result = " +res);
       }
       else if(ch == '-')
       {
            res = a - b;
            System.out.print("Result = " +res);
       }
               
       else if(ch == '*')
       {
            res = a * b;
            System.out.print("Result = " +res);
       }
       else if(ch == '/')
       {
            res = a / b;
            System.out.print("Result = " +res);
       }
       else
       {
            System.out.print("Wrong Operator !!!");
       }
            
    }
}
    
    
