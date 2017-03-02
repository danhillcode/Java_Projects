
/*
 * @author Daniel Hill
 *
 */

import java.util.Arrays;

/**
 * This is the Parity class the aim of this class is to add parity bits which
 * are used to detect changes when large data sets are transferred. The parity
 * bits are used. For example when we want to transfer data such as in the
 * following 3 × 5-matrix (two-dimensional array) of bits. The following methods
 * within the class addParoty and check to see if the parity bits added are
 * correct.
 */
public class Parity {

	/**
	 * This set the addParity method
	 *
	 * @param int[][]
	 *            a - This is the initial two dimensional array before any
	 *            Parity bits are added
	 * @return int[][] newA - This is the returned array with Parity bits added
	 *         to the length of the array.
	 */
	public static int[][] addParity(int[][] a) {

		/**
		 * Initialize the variable sumOfRow to 0 - This value will count the sum
		 * of the row so that calculations can be performed in order to add
		 * Parity bits. Initialize the variable sumOfColumn to 0 This value will
		 * also count so that calculations can be performed in order to add
		 * Parity bits however for the sum of the column.
		 */
		int sumOfRow = 0;
		int sumOfColumn = 0;

		/**
		 * Create int[][] newA with a greater column and row length which is a
		 * new array which will contain the added parity bits
		 */

		int[][] newA = new int[4][6];

		/**
		 * The for loop here will loop through the values of the initial array
		 * (a) and generate a new array so the first array will have added
		 * parity bits.
		 */
		for (int row1 = 0; row1 < a.length; row1++) {
			for (int column1 = 0; column1 < a[row1].length; column1++) {
				newA[row1][column1] = a[row1][column1];
			}
		}

		/**
		 * This for loop iterates over the new extended array rows so that
		 * enters the loop as newA. Iterating over NewA the sumOfRow calculates
		 * the sum of the rows The method then has an if statement which states
		 * if the sumOfRow % 2 is not equal to 0 (i.e.it is odd) then the array
		 * adds 1 because it is odd else the method will add 1.
		 */
		for (int row = 0; row < newA.length; row++) {
			sumOfRow = 0;
			for (int column = 0; column < newA[row].length; column++) {

				sumOfRow += newA[row][column];

			}

			/**
			 * This if statement adds 1 if the result of sumOfRow % 2 == 1 is 0
			 * and adds 0 if the result is 0.
			 */

			if (sumOfRow % 2 == 0) {
				newA[row][newA[row].length - 1] = 0;
			} else {
				newA[row][newA[row].length - 1] = 1;

			}
		}
		/**
		 * This for loop iterates over the new extended array columns so that
		 * enters the loop as newA. Iterating over NewA the sumOfColumn
		 * calculates the sum of the columns The method has an if statement
		 * which evaluates to if the sumOfColumn % 2 is not equal to 0 (i.e.it
		 * is odd) then the array adds 1 because it is odd else the method will
		 * add 1.
		 */
		for (int column = 0; column < newA.length; column++) {
			sumOfColumn = 0;
			for (int row = 0; row < newA.length - 1; row++) {

				sumOfColumn += newA[row][column];
			}
			/**
			 * This if statement adds 1 if the result of sumOfColumn % 2 == 1 is
			 * 0 and adds 0 if the result is 0.
			 */
			if (sumOfColumn % 2 == 0) {
				newA[newA.length - 1][column] = 0;
			} else {
				newA[newA.length - 1][column] = 1;
			}
		}
		/**
		 * The new array with the added parity bits is returned as newA
		 */
		return newA;
	}

	/**
	 * This set the checkParity method
	 *
	 * @param int[][]
	 *            b - This is the initial two dimensional array.
	 * @return boolean value - This method will return true if the parity bits
	 *         have been applied correctly else it will return false
	 */

	public static boolean checkParity(int[][] b) {
		return checkColumn(b) == -1 && checkRow(b) == -1;
	}

	/**
	 * A method is used to check the rows of the array (b). The index of the
	 * incorrect row or -1 if all the rows are correct
	 *
	 * @param b,
	 *            a integer array that will have its rows checked for parity
	 * @return an integer which is the index of the incorrect row, or -1 if
	 *         correct
	 */
	public static int checkRow(int[][] b) {
		int columnLength = b.length - 1;
		int rowLength = b[0].length - 1;
		int sumOfRow;
		int lastRowItem = 0;
		int status = -1;

		for (int column = 0; column < columnLength + 1; column++) {
			sumOfRow = 0;

			lastRowItem = b[column][rowLength];

			for (int row = 0; row < rowLength; row++) {
				sumOfRow += b[column][row];

			}

			if (sumOfRow % 2 == 0 && lastRowItem % 2 != 0) {
				return column;
			} else if (sumOfRow % 2 != 0 && lastRowItem % 2 == 0) {
				return column;
			}

		}
		return status;
	}

	/**
	 * We use a method to check the columns in the array (b). We return the
	 * index of the column which is incorrect or -1 if all the columns are
	 * correct
	 * 
	 * @param b,
	 *            an integer array that will have its rows checked for parity
	 * @return an integer which is the index of the incorrect column, or -1 if
	 *         it is correct
	 */

	public static int checkColumn(int[][] b) {
		int columnLength = b.length - 1;
		int rowLength = b[0].length - 1;
		int sumOfColumn = 0;
		int status = -1;

		int lastColumnItem = 0;

		for (int row = 0; row < rowLength; row++) {
			sumOfColumn = 0;

			lastColumnItem = b[columnLength][row];

			for (int column = 0; column < columnLength; column++) {
				sumOfColumn += b[column][row];

			}

			if (sumOfColumn % 2 == 0 && lastColumnItem % 2 != 0) {
				return row;
			} else if (sumOfColumn % 2 != 0 && lastColumnItem % 2 == 0) {
				return row;
			}
		}
		return status;
	}

	/*
	 * This is the main method which calls the methods from this Parity class
	 */
	public static void main(String[] args) {
		int[][] test1 = { { 0, 1, 1, 1, 0 }, { 1, 0, 0, 0, 1 }, { 1, 0, 1, 0, 1 } };
		System.out.println(checkParity((addParity(test1))));
		System.out.println((Arrays.deepToString(addParity(test1))));
	}
}
