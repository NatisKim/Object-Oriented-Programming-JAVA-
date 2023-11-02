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

public class Exercise3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        // Declaring variables to hold number of miles, gallons of gas, and gas mileage.
        double num_of_miles = 0.0;
        double gallons_of_gas = 0.0;
        double mpg = 0.0;
        // Prompts user to enter the number of miles driven.
        System.out.print("Enter the number of miles driven.");
        num_of_miles = input.nextDouble();
        
        // Prompts user to enter the gallons of gas used.
        System.out.print("Enter the number of gallons of gas used.");
        gallons_of_gas = input.nextDouble();
       
        // Formula to calculate the gas mileage.
        mpg = num_of_miles / gallons_of_gas;
        // Displaying formatted data
        System.out.printf("%s %6.2f %s\n", "You have used", mpg, "miles per gallon.");   
  
    }
    
}
