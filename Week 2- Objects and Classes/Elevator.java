/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chinn
 */
public class Elevator {
  // Declaring private integer variable.
  private int currentFloor;
  // Declaring boolean variables.
  private boolean goUp;
  private boolean goDown;
  
  public Elevator()
  // Elevator floor starts at 1.
  { currentFloor = 1;
     if (goUp == true){
      goDown = false;
     }
     else if (goDown == true){
       goUp = false;
     }
  }
  public void goUp()
  // goUp method to go up a floor.
  { 
      if (currentFloor >= 3){
          // Perform error checking. Floor is supposed to stop at level 3.
          System.out.println("Error. You cannot go past the third floor.");
          goUp = false;     
      }
      else {
          currentFloor++; // Increments by 1.
          goUp = true;
      }
  }
  public void goDown()
  // goDown method to go down a floor.
  {
      if (currentFloor <= 1)
      { goDown = false;
      } 
      else 
      { currentFloor--; // Decrements by 1.
        goDown = true;
      }
  } 
 public void displayCurrentFloor()
  // Displaying the current floor by outputting this message.
  { System.out.printf("%s%d%s%n", "You are currently on Floor " ,currentFloor,".");     
  }  
}


 