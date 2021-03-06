/**
 * @author Ryan Henschel
 * CS 220
 * LAB 3 Vending Machine
 * 3/23/15
 */

public class VendingMachine {
	private final int ROWS = 5;
	private final int COLUMNS = 5;
	private final int DEPTH = 5;
	int[][][] machine;
	
	/**
	 * This constructor method sets the vending machine to empty
	 * @param a is a parameter to differentiate from the other constructor
	 */
	public VendingMachine(int a) {
		machine = new int[ROWS][COLUMNS][DEPTH];
		//sets an empty vending machine
		for (int i=0; i<ROWS; i++)
			for (int j=0; j<COLUMNS; j++)
				for (int k=0; k<DEPTH; k++)
					machine[i][j][k] = 0;
	}
	
	/**
	 * This constructor method fills the vending machine
	 */
	public VendingMachine() {
		machine = new int[ROWS][COLUMNS][DEPTH];
		//fills vending machine
		for (int i=0; i<ROWS; i++)
			for (int j=0; j<COLUMNS; j++)
				for (int k=0; k<DEPTH; k++)
					machine[i][j][k] = 1;
	}
	
	/**
	 * This method takes in the money from the customer
	 * @param quarters is the number of quarters given by the customer
	 * @return returns false if not given 1 quarter, true if given 1 quarter
	 */
	public boolean takeMoney(int quarters) {
		if (quarters != 1)
			return false;
		else
			return true;
	}
	
	/**
	 * This method gives the product to the customer
	 * @param r row of the vending machine
	 * @param c column of the vending machine
	 */
	public void giveProduct(int r, int c) {
		if (r<0 || r>4 || c<0 || c>4)
			System.out.println("Not a valid row or column.");
		else
		{
				if (machine[r-1][c-1][0] == 1)
				{
					System.out.println("Thank you for your purchase!");
					machine[r-1][c-1][0] = 0;
				}
				else if (machine[r-1][c-1][1] == 1)
				{
					System.out.println("Thank you for your purchase!");
					machine[r-1][c-1][1] = 0;
				}
				else if (machine[r-1][c-1][2] == 1)
				{
					System.out.println("Thank you for your purchase!");
					machine[r-1][c-1][2] = 0;
				}
				else if (machine[r-1][c-1][3] == 1)
				{
					System.out.println("Thank you for your purchase!");
					machine[r-1][c-1][3] = 0;
				}
				else if (machine[r-1][c-1][4] == 1)
				{
					System.out.println("Thank you for your purchase!");
					machine[r-1][c-1][4] = 0;
				}
				else
					System.out.println("Out of product.");
		}
	}
	
	/**
	 * @return a string representation of this vending machine object
	 */
	public String toString() {
		return "The number of rows is " + ROWS + "." + "The number of columns is " + COLUMNS + "." + "The depth is " + DEPTH + ".";
	}
}
