/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chinn
 */
public class Navy_Sailor extends Person
{
    // Initializing class variables
    private String duty_status; // Active Duty or Reserve
    private String ship_type; // Surface Ship or Submarine
    private String rank; // Rank
    // Class definition
    public Navy_Sailor(String FN, String MI, String LN, String G, String D, String ST, String R)
    {
       super(FN, MI, LN, G);
       duty_status = D;
       ship_type = ST;
       rank = R;
    }
    // Creating a toString method
    public String toString()
    {
        return String.format("%s, %s, %s, %s", super.toString(), duty_status, ship_type, rank);
    }
}
