import static org.junit.Assert.*;
import org.junit.Test;

/**
 * @author Daniel Hill 3 tests to test all the methods in Parity class.
 */

public class ParityTest {

	@Test
	public void test() {
		int[][] test = { { 1, 0, 1, 1, 0 }, { 0, 0, 0, 1, 1 }, { 1, 0, 1, 1, 1 } };

		int[][] outputTest = { { 1, 0, 1, 1, 0, 1 }, { 0, 0, 0, 1, 1, 0 }, { 1, 0, 1, 1, 1, 0 }, { 0, 0, 0, 1, 0, 0 } };

		int[][] realValues = Parity.addParity(test);
		assertArrayEquals(outputTest, realValues);
	}

	@Test
	public void test3() {
		int[][] test3 = { { 1, 1, 0, 1, 0 }, { 0, 1, 1, 1, 1 }, { 0, 0, 0, 0, 1 } };

		assertFalse(Parity.checkParity(test3));
	}

	@Test
	public void test4() {

		int[][] test4 = { { 0, 0, 1, 0, 1 }, { 1, 0, 1, 1, 1 }, { 0, 1, 0, 0, 0 } };

		assertFalse(Parity.checkParity(test4));
	}

	@Test
	public void test5() {

		int[][] test5 = { { 1, 1, 0, 1, 0 }, { 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 0 } };

		// expected array after adding parity bits
		int[][] expected = { { 1, 1, 0, 1, 0, 1 }, { 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 0, 0 }, { 1, 1, 1, 1, 0, 0 } };

		int[][] actual = Parity.addParity(test5);
		assertNotSame(expected, actual);
	}

}
