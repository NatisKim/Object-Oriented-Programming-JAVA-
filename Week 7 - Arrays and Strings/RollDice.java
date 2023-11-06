/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chinn
 */

import java.security.SecureRandom;

public class RollDice {
    public static void main(String[] args){
        // random numbers object will output secure random numbers
        SecureRandom random_num = new SecureRandom();
        // Declaring variables with array
        int [] dice = new int [10];
        // Creating for loop to generate random numbers and store in array
        for(int roll = 0; roll < 1000000; roll++){
            dice[random_num.nextInt(10)]++;
        }
       // Outputting table
       System.out.println("Face   Frequency");
       System.out.println("====   =========");
       for(int i = 0; i < dice.length; i++){
           System.out.printf("%2d     %7d\n", i+1, dice[i]);
       }
    
    }      
}
