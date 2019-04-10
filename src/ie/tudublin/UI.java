/*
Lab Test - Resistors
Name: Jerricho Juliano
Student Number: C17331306
Date:10/04/19
*/

package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;

public class UI extends PApplet
{
	
	ArrayList<colour> colours = new ArrayList<colour>();
	ArrayList<resistor> resistors = new ArrayList<Resistors>();

	public void separate(int value)
	{
		int hundreds = (value / 100);
		int tens = (value - (hundreds * 100)) / 10;
		int ones = value - ((hundreds * 100)  + (tens * 10));
		print(hundreds + ",");
		print(tens + ",");
		println(ones);
	}

	public void settings()
	{
		size(500, 800);
		
		separate(381);
		separate(1);
		separate(92);
	}

	public void setup() 
	{
		loadColours();
		printColours();
		loadResistors();
	}
	//Populate Color Array List
	void loadColours()
    {
        Table table = loadTable("colours.csv", "header");
		
		for(TableRow tr:table.rows())
        {
            Colour p = new Colour(tr);
            colour.add(p);
        }        
	}
	//Print Out to Standard Output
	public void printColours() 
    {
        for (Colour colour : colours) 
        {
            System.out.println(colour);
        }
	}
	//Return colour and value of parameter
	public Color findColor(int value)
	{
		return colour + "/t" + value;
	}

	//Populate the Resisitor Array list
	void loadResistors()
    {
        Table table = loadTable("resistors.csv", "header");
		
		for(TableRow tr:table.rows())
        {
            Resistors p = new Resistors();
            resistor.add(p);
        }        
	}

	public void draw()
	{			
	}
}
