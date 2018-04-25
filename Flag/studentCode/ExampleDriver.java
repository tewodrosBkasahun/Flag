package studentCode;

import java.awt.Color;
import java.util.Scanner;



import cmsc131_GridTools.MyGrid;

public class ExampleDriver {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		/* Get input from user about what flag to draw */
		System.out.println("Type the number corresponding to the name:  ");
		System.out.println("1 Somalia");
		System.out.println("2 Vietnam");
		System.out.println("3 Indonesia");
		System.out.println("4 Poland");
		System.out.println("5 Estonia");
		System.out.println("6 Bolivia");
		System.out.println("7 France");
		System.out.println("8 Senegal");
		System.out.println("9 Bahamas");
		System.out.println("10 Macedonia");
		System.out.print("Your choice here:");
		int choice = scanner.nextInt();
		System.out.print("Choose a size (4 or larger): ");
		int size = scanner.nextInt();
		if (size < 4 || size >30){
			size = 4;
			choice = 99;
		}
		
		/* Create drawing grid of the height requested */
		MyGrid grid = new MyGrid(size);
		
		grid.setColor(3, 3, Color.RED); 
		/* Draw the letter on the grid */
		FlagMaker.drawFlag(grid, choice);
		
		scanner.close();
	}
}
