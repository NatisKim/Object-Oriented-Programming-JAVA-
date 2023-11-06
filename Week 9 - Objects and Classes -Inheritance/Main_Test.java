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
public class Main_Test {
    public static void main(String args[]){
        // Creating Scanner Object
        Scanner input = new Scanner(System.in);
        // Person Class
        Person jane = new Person("Jane", "D.", "Doe", "Female");
        System.out.println(jane.toString());
        // Navy_Sailor Class
        Navy_Sailor sailor = new Navy_Sailor("Jane", "D.", "Doe", "Female", "Active Duty", "Submarine", "Officer");
        System.out.println(sailor.toString());
    }
}
