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
    private String colour; 
    public int r;
    public int g;
    public int b;
    public int value;


    //accessor methods
    public void setDisplayName(String colour)
    {
        this.colour = colour;
    }

    public String getDisplayName()
    {
        return colour;
    }

    //Converts data to string
    public String toString()
    {
        return colour + "\t" + r + "\t" + g + "\t" + b + "/t" + value; 
    }

    //Constructor - A special Method that gets called when the object is created
    public colour(TableRow row)
    {
        
        colour = row.getString("colour");
        r = row.getInt("r");
        g = row.getInt("g");
        b = row.getInt("b");
        value = row.getInt("value");
        
    }

    /**
     * @return the colour
     */
    public String getColour() {
        return colour;
    }

    /**
     * @param colour the colour to set
     */
    public void setColour(String colour) {
        this.colour = colour;
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

    