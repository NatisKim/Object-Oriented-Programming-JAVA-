/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chinn
 */
public class ElevatorTest {
    // Main program that shows each floor level of elevator.
    public static void main(String[] args)
    {
        Elevator floor = new Elevator();
        // Displaying the current floor level which should be floor 1.
        floor.displayCurrentFloor();
        //Going up to second floor.
        floor.goUp();
        floor.displayCurrentFloor();
        //Going up to third floor.
        floor.goUp();
        floor.displayCurrentFloor();
        // Attempting to go to fourth floor. Error checking message will appear.
        floor.goUp();
        floor.displayCurrentFloor();
        // Elevator will go down to second floor.
        floor.goDown();
        floor.displayCurrentFloor();
        // Elevator will go down back to first floor.
        floor.goDown();
        floor.displayCurrentFloor();
    }
    
}   

