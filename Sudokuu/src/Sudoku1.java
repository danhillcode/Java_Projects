
/**
 * Daniel Hill
 * 29/11/2016
 * This is the Sudoku for work sheet 5. Exercise 1 
 */

/**
 * This is the sudoku main class it is a superclass with subclasses that inherit features.
 */
import java.util.Arrays;

public class Sudoku1 {

	/**
	 * This is an array that is being instantiated for use within the program.
	 */
	private int[][] array;

	/**
	 * This is the constructor which takes an array as a parameter and then
	 * instantiates that using the this variable.
	 */
	public Sudoku1(int[][] array) {
		this.array = array;
	}

	/**
	 * This is the getArray Method which gets the array from the current object.
	 * 
	 * @return array
	 */

	public int[][] getArray() {
		return array;
	}

	/**
	 * This is the override toString method. It takes the array and iterates
	 * over it adding elements in between rows and columns which allows the
	 * array to be formatted similar to an actual Sudoku board which the user
	 * can play at a later stage.
	 */
	@Override
	public String toString() {
		System.out.print("\n" + "++===+===+===++===+===+===++===+===+===++" + "\n");
		for (int i = 0; i < 9; i++) {
			System.out.print("|");
			for (int j = 0; j < 9; j++) {
				if (array[i][j] != 0 && j != 2 && j != 5) {
					System.out.print("| " + array[i][j] + " ");
				} else if (array[i][j] == 0) {
					System.out.print("| " + "  ");
				}
				if (j == 2 && array[i][j] != 0 || j == 5 && array[i][j] != 0) {
					System.out.print("| " + array[i][j] + " |");
				}
				if (j == 2 && array[i][j] == 0 || j == 5 && array[i][j] == 0) {
					System.out.print("|");
				}

			}
			if (i == 0 || i == 1 || i == 3 || i == 4 || i == 6 || i == 7) {
				System.out.print("||" + "\n" + "++---+---+---++---+---+---++---+---+---++" + "\n");
			} else if (i == 2 || i == 5) {
				System.out.print("||" + "\n" + "++===+===+===++===+===+===++===+===+===++" + "\n");
			}
		}
		return "||" + "\n" + "++===+===+===++===+===+===++===+===+===++" + "\n";
	}

	/**
	 * This is the setArray method which takes an array [][] as a parameter and
	 * sets the current array to the given array.
	 * 
	 * @param array
	 */
	public void setArray(int[][] array) {
		this.array = array;
	}

	/**
	 * This is the isFilled method which takes an array [][] as a parameter and
	 * uses a for loop with a nested if statement to check whether the array is
	 * filled in all cases. A false value would be return if any row or column
	 * is equal to 0 in value.
	 */
	public static boolean isFilled(int[][] array) {

		for (int row = 0; row < array.length; row++) {
			for (int column = 0; column < array[row].length; column++)
				// System.out.println(array[row][column]);
				if (array[row][column] == 0) {
					return false;
				}
		}
		return true;
	}

	/**
	 * This is an main method for the sudoku class which is a void method so it
	 * can call the methods without the need to create an object..
	 */
	public static void main(String[] args) {
		int[][] array = { { 1, 2, 3, 4, 5, 6, 7, 8, 9 }, { 4, 5, 6, 7, 8, 9, 1, 2, 3 }, { 7, 8, 9, 1, 2, 3, 4, 5, 6 },
				{ 2, 3, 4, 5, 6, 7, 8, 9, 1 }, { 5, 6, 7, 8, 9, 1, 2, 3, 4 }, { 8, 9, 1, 2, 3, 4, 5, 6, 7 },
				{ 3, 4, 5, 6, 7, 8, 9, 1, 2 }, { 6, 7, 8, 9, 1, 2, 3, 4, 5 }, { 9, 1, 2, 3, 4, 5, 6, 7, 8 } };

		// Sudoku.setArray(array);
		Sudoku1 s1 = new Sudoku1(array);
		System.out.println(s1);

	}

}
