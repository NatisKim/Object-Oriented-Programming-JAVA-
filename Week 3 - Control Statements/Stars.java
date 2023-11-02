/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chinn
 */
public class Stars {
    public static void main(String[] args){
        // Declaring Variables
        int row, col;
        // Creating a nested for loop
        for(row = 0; row < 5 ; row++) 
        {
           for(col = 1; col <= row; col++)
           {
           // Outputs the star
           System.out.print("* ");
           }
         System.out.println();
        }    
    }
}