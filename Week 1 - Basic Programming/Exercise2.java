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
public class Exercise2 {
        public static void main(String[] args) {  
        Scanner input = new Scanner(System.in);
        // Prompts the user to input a number
        System.out.println("Enter a number."); 
        int number = input.nextInt(); 
        //Determines if a number is even or odd without remainder operator
        int answer = number / 2;
        if (answer*2 == number){ 
            System.out.println("Number is even!");
        }
            else {
            System.out.println("Number is odd.");
        }
    }
}