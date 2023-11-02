/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chinn
 */
import java.util.Scanner;

public class Week1 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        // Prompts the user to input a number
        System.out.println("Enter a number."); 
        int number = input.nextInt(); 
        //Determines if a number is even or odd with remainder operator
        if (number % 2 == 0){ 
            System.out.println("Number is even!");
        }
            else {
            System.out.println("Number is odd.");
        }
    
    }
}
