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
public class Operator {
    public static void main(String[] args){
        // Declaring variables
        int operator, number1, number2, answer;
        // Creating a Scanner Object
        Scanner input = new Scanner(System.in);
        // Prompting the user to enter the first number
        System.out.print("Please choose your first number: ");
        number1 = input.nextInt();
        // Prompting the user to enter the second number
        System.out.print("Please choose your second number: ");
        number2 = input.nextInt();
        // Ask the user which operator they would like to choose
        System.out.println("Please choose an operator. Enter 1 for addition, 2 for subtraction, 3 for multiplication, 4 for division, and 5 for modulus.");
        operator = input.nextInt();
        
        // Providing switch statement
        switch (operator) {
            // Addition
            case 1:
                answer = number1 + number2;
                System.out.println("You chose addition!");
                System.out.println(number1+" + "+number2+" = "+answer);
                break;
            // Subtraction
            case 2:
                answer = number1 - number2;
                System.out.println("You chose subtraction!");
                System.out.println(number1+" - "+number2+" = "+answer);
                break;
            // Multiplication
            case 3:
                answer = number1 * number2;
                System.out.println("You chose multiplication!");
                System.out.println(number1+" * "+number2+" = "+answer);
                break;
            // Division
            case 4:
                answer = number1 / number2;
                System.out.println("You chose division!");
                System.out.println(number1+" / "+number2+" = "+answer);
                break;
            // Modulus
            case 5:
                answer = number1 % number2;
                System.out.println("You chose modulus!");
                System.out.println(number1+" % "+number2+" = "+answer);
                break;
            
            default:
                System.out.println("Sorry, that operator is not an option. Enter 1 for addition, 2 for subtraction, 3 for multiplication, 4 for division, and 5 for modulus.");
                break;
        }    
}

}