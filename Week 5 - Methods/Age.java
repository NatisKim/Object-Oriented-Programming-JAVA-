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
public class Age {
    public static void main(String[] args){
        // Declaring variables
        int birth_Mon, birth_Day, birth_Yr, today_Mon, today_Day, today_Yr;
        // Creating a Scanner for input
        Scanner input = new Scanner(System.in);
        
        // Asking the user to enter their birth date
        System.out.println("Please enter your date of birth.");
        // Inputting the month, day, and year of birth
        System.out.print("Month: ");
        birth_Mon = input.nextInt();
        System.out.print("Day: ");
        birth_Day = input.nextInt();
        System.out.print("Year: ");
        birth_Yr = input.nextInt();
        
        // Asking the user to enter today's date
        System.out.println("Please enter today's date.");
        // Inputting today's month, day, and year
        System.out.print("Month: ");
        today_Mon = input.nextInt();
        System.out.print("Day: ");
        today_Day = input.nextInt();
        System.out.print("Year: ");
        today_Yr = input.nextInt();
        // Adding extra line
        System.out.println(); 
        
        // Displaying the age of the user
        System.out.println("Your age is " +CalculateAge(birth_Mon, birth_Day, birth_Yr, today_Mon, today_Day, today_Yr)+ "!");
    }
    // Calling method CalculateAge() to determine how many years old the person is
    public static int CalculateAge(int birth_Mon, int birth_Day, int birth_Yr, int today_Mon, int today_Day, int today_Yr){
        // Declaring variables
        int birth_date, today_date, result, years;
        // Performing conversion to change birth date to YYYYMMDD format
        birth_date = birth_Yr * 10000 + birth_Mon * 100 + birth_Day;
        // Performing conversion to change today's date to YYYYMMDD format
        today_date = today_Yr * 10000 + today_Mon * 100 + today_Day;
        // Subtracting birth date from today's date
        result = today_date - birth_date;
        // Dividing the result by 10000 to get the number of years
        years = result / 10000;
        // Returning the number of years
        return years;    
    }
}
