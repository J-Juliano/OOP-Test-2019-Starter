/*
Lab Test - Resistors
Name: Jerricho Juliano
Student Number: C17331306
Date:10/04/19
*/

package ie.tudublin;

import processing.data.TableRow;

public class Resistors
{
    public int value;
    public int ones;
    public int tens;
    public int hundreds;
}


public resistors(TableRow row)
{
   //Constructor
    value = row.getString("Value");
    ones = row.getInt("Ones");
    tens = row.getInt("Tens");
    hundreds = row.getInt("Hundreds");
     
}
