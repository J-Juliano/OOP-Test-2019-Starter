/*
Lab Test - Resistors
Name: Jerricho Juliano
Student Number: C17331306
Date:10/04/19
*/

package ie.tudublin;

import processing.data.TableRow;

public class colour 
{
    private String color; 
    public int r;
    public int g;
    public int b;
    public int value;


    //accessor methods
    public void setDisplayName(String color)
    {
        this.color = color;
    }

    public String getDisplayName()
    {
        return color;
    }

    //Converts data to string
    public String toString()
    {
        return color + "\t" + r + "\t" + g + "\t" + b + "/t" + value; 
    }

    //Constructor - A special Method that gets called when the object is created
    public colour(TableRow row)
    {
        //Assigns private fields
        //Header Case Sensitive
        color = row.getString("Colour");
        r = row.getInt("R");
        g = row.getInt("G");
        b = row.getInt("B");
        value = row.getInt("Value");
        
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the r
     */
    public int getR() {
        return r;
    }

    /**
     * @param r the r to set
     */
    public void setR(int r) {
        this.r = r;
    }

    /**
     * @return the g
     */
    public int getG() {
        return g;
    }

    /**
     * @param g the g to set
     */
    public void setG(int g) {
        this.g = g;
    }

    /**
     * @return the b
     */
    public int getB() {
        return b;
    }

    /**
     * @param b the b to set
     */
    public void setB(int b) {
        this.b = b;
    }

    /**
     * @return the value
     */
    public int getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(int value) {
        this.value = value;
    }
}