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

public class Grade_Avg{
  public static void main(String[] args) {
    // Declaring variables
    int[] grades = new int[10];
    int num_of_grades = 0;
    int sum = 0;
    int average = 0;
    int above_avg = 0;
    int below_avg = 0;
     // Creating a Scanner object for input
    Scanner input = new Scanner(System.in);
    // Asks the user to enter in a grade
    System.out.println("Please enter a grade: ");
    int grade = input.nextInt();
    /* Grade must be a positive number with maximum count up to ten grades.
    Negative number is sentinel value.
    */
    while (grade != -1 && num_of_grades < 10) { 
      grades[num_of_grades] = grade;
      sum = sum + grade;
      num_of_grades++; 
      grade = input.nextInt();
    }
    // Calculates the average.
    average = sum / num_of_grades;
      // Calculates the number of grades that are above or below average
      for (int i = 0; i < num_of_grades; i++) {
        if (grades[i] >= average) {
          above_avg++;
        } else {
          below_avg++;
        }
      }
      // Outputs all the grades entered
      System.out.println("The grades entered are: ");
      for (int j = 0; j < num_of_grades; j++){
             System.out.println(grades[j]);
      }
    /* Outputs the average, the number of above or equal to average grades,
      and the number of below average grades
      */
      System.out.println("The average grade is: " + average);
      System.out.println("The number of grades above or equal to the average is: " + above_avg);
      System.out.println("The number of grades below the average is: " + below_avg);           
  }
  }



