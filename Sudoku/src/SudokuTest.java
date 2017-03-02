import static org.junit.Assert.*;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

import org.junit.Test;

public class SudokuTest {

	/**
	 * The first test is for the isfilled method in the Sudoku class.
	 */
	@Test
	public void test() {

		int[][] array = { { 1, 2, 3, 4, 5, 6, 7, 8, 9 }, { 4, 5, 6, 7, 8, 9, 1, 2, 3 }, { 7, 8, 9, 1, 2, 3, 4, 5, 6 },
				{ 2, 3, 4, 5, 6, 7, 8, 9, 1 }, { 5, 6, 7, 8, 9, 1, 2, 3, 4 }, { 8, 9, 1, 2, 3, 4, 5, 6, 7 },
				{ 3, 4, 5, 6, 7, 8, 9, 1, 2 }, { 6, 7, 8, 9, 1, 2, 3, 4, 5 }, { 9, 1, 2, 3, 4, 5, 6, 7, 8 } };

		boolean expected = true;

		System.out.println(Arrays.deepToString(array));
		boolean actual = Sudoku.isFilled(array);
		assertEquals(expected, actual);

	}

	public void test2() throws FileNotFoundException, IOException {

		boolean expected = true;
		// boolean actual = Sudoku.isFilled(array);
		System.out.println(SudokuRead.readSudoku("./src/BadSudoku.txt"));
		// assertEquals(expected,actual);
	}

}
