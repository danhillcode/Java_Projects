
/**
 * Daniel Hill
 * 29/11/2016
 * This is the Sudoku for work sheet 5. Exercise 3 
 */
import java.awt.List;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * This is the SudokuCheck class it is a subclass which extends from the Sudoku
 * super class.
 */
public class SudokuCheck1 extends Sudoku1 {
	/**
	 * This is the constructor which takes an array as a parameter and then
	 * instantiates the array from the super class..
	 */
	public SudokuCheck1(int[][] array) {
		super(array);
	}

	/**
	 * This is an main method for the SudokuCheck class which is a void method
	 * so it can call the methods without the need to create an object..
	 */

	public static void main(String[] args) {
		int[][] array = { { 1, 2, 3, 4, 5, 6, 7, 8, 9 }, { 4, 5, 6, 7, 8, 9, 1, 2, 3 }, { 7, 8, 9, 1, 2, 3, 4, 5, 6 },
				{ 2, 3, 4, 5, 6, 7, 8, 9, 1 }, { 5, 6, 7, 8, 9, 1, 2, 3, 4 }, { 8, 9, 1, 2, 3, 4, 5, 6, 7 },
				{ 3, 4, 5, 6, 7, 8, 9, 1, 2 }, { 6, 7, 8, 9, 1, 2, 3, 4, 5 }, { 9, 1, 2, 3, 4, 5, 6, 7, 8 } };
		Sudoku1 s1 = new Sudoku1(array);
		System.out.println(check(s1));
	}

	/**
	 * This is the check method for the class which is a method that returns a
	 * two dimensional array containing boolean values.
	 * 
	 * @param Sudoku
	 *            sudoku
	 */
	public static boolean[][] check(Sudoku1 sudoku) {
		/**
		 * The following are a result two dimensional array with boolean values.
		 * The first array in the three returns the checked values of the rows,
		 * the second returns the columns and the final array returns the 3x3
		 * dimensional array.
		 */
		boolean[][] result = new boolean[3][9];
		//boolean[] result1 = new boolean[9];
		/**
		 * The following for loop makes multiple calls to the methods to check
		 * rows and columns for each element which then updates the array with
		 * the output from the methods.
		 */
		for (int i = 0; i < 9; i++) {
			result[0][i] = checkRow(sudoku, i);
			result[1][i] = checkColumn(sudoku, i);
		}
		/**
		 * The following is the calls to update the checkSquare method to check
		 * each individual 3x3 square.
		 */
		result[2][0] = checkSquare(sudoku, 0, 0);
		result[2][1] = checkSquare(sudoku, 0, 3);
		result[2][2] = checkSquare(sudoku, 0, 6);
		result[2][3] = checkSquare(sudoku, 3, 0);
		result[2][4] = checkSquare(sudoku, 3, 3);
		result[2][5] = checkSquare(sudoku, 3, 6);
		result[2][6] = checkSquare(sudoku, 6, 0);
		result[2][7] = checkSquare(sudoku, 6, 3);
		result[2][8] = checkSquare(sudoku, 6, 6);

		/**
		 * This is the print statement which uses deepToString to display the
		 * results.
		 */
		System.out.println(Arrays.deepToString(result));
		return result;
	}

	/**
	 * This is the checkRow method which iterates through the rows of the sudoku
	 * and takes a parameter which is the row number that also enters the
	 * method. The for loop finishes when the loop reaches the length of the the
	 * specified row. The if statement within the for loop checks if the first
	 * element is the same and enters if it is not the equal and the iterating l
	 * value within the nested for loop check each element within the row.
	 * 
	 * @param sudoku
	 * @param row
	 * @return boolean
	 */
	public static boolean checkRow(Sudoku1 sudoku, int row) {
		for (int k = 0; k < sudoku.getArray()[0].length; k++) {

			for (int l = 0; l < sudoku.getArray().length; l++) {

				if ((k != l) && (sudoku.getArray()[row][k] == sudoku.getArray()[row][l])) {

					return false;
				}
			}
		}

		return true;
	}

	/**
	 * This is the checkColumn method which iterates through the columns of the
	 * sudoku and takes a parameter which is the column number that also enters
	 * the method. The for loop finishes when the loop reaches the length of the
	 * the specified column. The if statement within the for loop checks if the
	 * first element is the same and enters if it is not the equal and the
	 * iterating l value within the nested for loop check each element within
	 * each column.
	 * 
	 * @param sudoku
	 * @param column
	 * @return boolean
	 */
	public static boolean checkColumn(Sudoku1 sudoku, int column) {
		for (int k = 0; k < sudoku.getArray().length; k++) {

			for (int l = 0; l < sudoku.getArray().length; l++) {

				if ((k != l) && (sudoku.getArray()[k][column] == sudoku.getArray()[l][column])) {

					return false;
				}
			}
		}
		return true;
	}

	/**
	 * The checkSquare method takes in three parameters. The method sets an
	 * array list 'list' and another names listB. The list contains all the
	 * values for each of the 3x3 squares. The method uses a double for loop
	 * that loops through the elements and add them to the list previously
	 * mentioned. The final step is to sort the list and compare the list to
	 * listB which contains all the values that are required from 1-9 if any
	 * values are different in the two array lists the return value is a boolean
	 * false.
	 * 
	 * @param sudoku
	 * @param checkRow
	 * @param checkCol
	 * @return boolean
	 */

	public static boolean checkSquare(Sudoku1 sudoku, int checkRow, int checkCol) {

		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<Integer> listB = new ArrayList<Integer>();
		listB.add(1);
		listB.add(2);
		listB.add(3);
		listB.add(4);
		listB.add(4);
		listB.add(5);
		listB.add(6);
		listB.add(7);
		listB.add(8);
		listB.add(9);

		int k = checkRow;
		int l = checkCol;

		for (k = checkRow; k < checkRow + 3; k++) {

			for (l = checkCol; l < checkCol + 3; l++) {

				// System.out.print(sudoku.getArray()[k][l]);
				list.add(sudoku.getArray()[k][l]);
			}

		}

		Collections.sort(list);

		return list.containsAll(listB);
	}
}
