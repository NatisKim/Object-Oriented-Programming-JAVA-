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
public class Reverse {
    public static void main(String[] args) {
        // Creating a Scanner for input
        Scanner input = new Scanner(System.in);
        // Declaring variables
        int num; 
        // Prompting the user to enter a number
        System.out.println("Please enter a number to reverse!");
        num = input.nextInt();
        // Displaying the reversed number on the screen
        System.out.println("The reversed version of the number is " +Reverse_Digits(num)+ "."); 
    }
    // Calling Reverse_Digits method
    public static int Reverse_Digits(int num) {
        // Declaring variables
        int reverse = 0; 
        int remain; // Remaining digit
        while (num != 0) { // Using while loop to reverse digits
            remain = num % 10;
            reverse = reverse * 10 + remain;
            num = num / 10;
        }
        return reverse;
    }
    
}
