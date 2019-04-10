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
	}
	
	void loadColours()
    {
        Table table = loadTable("colours.csv", "header");
		
		for(TableRow tr:table.rows())
        {
            Colour p = new Colour(tr);
            colours.add(p);
        }        
	}
	
	public void printColours() 
    {
        for (Colour colour : colours) 
        {
            System.out.println(colour);
        }
	}
	
	public Color findColor(int value)
	{
		return colour + "/t" + value;
	}

	public void draw()
	{			
	}
}
