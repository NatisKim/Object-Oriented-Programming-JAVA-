/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chinn
 */
public class Person {
    // Initializing class variables
    private String FirstName;
    private String MiddleInitial;
    private String LastName;
    private String Gender;
    // Class definition
    public Person(String FN, String MI, String LN, String G)
    { 
        FirstName = FN;
        MiddleInitial = MI;
        LastName = LN;
        Gender = G; 
    }
    // Creating a toString method
    public String toString()
    {
        return String.format("%s %s %s, %s", FirstName, MiddleInitial, LastName, Gender);        
    }
}
