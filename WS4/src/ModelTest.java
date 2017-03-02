import static org.junit.Assert.*;

import org.junit.Test;
import static org.junit.Assert.*;

import java.awt.List;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

public class ModelTest {

	
	

	static DictionaryModel model;
		
		public ModelTest() throws IOException {
			model = new DictionaryModel();
		}
		
		
		
	@Test
	public void test1() {
			
		model.addCharacter('2');
			
			model.nextMatch();
			ArrayList<String> expected = new ArrayList<String>
			(Arrays.asList("c"));
			ArrayList<String> actual = (ArrayList<String>) model.getMessage();
			assertEquals(expected, actual);
		}
	
	@Test
	public void test2() {
			
		    model.addCharacter('3');
			ArrayList<String> expected = new ArrayList<String>
			(Arrays.asList("d"));
			ArrayList<String> actual = (ArrayList<String>) model.getMessage();
			
			assertEquals(expected, actual);
		}
	
	@Test
	public void test3() {
			
		    model.addCharacter('3');
		    model.removeLastCharacter();
			ArrayList<String> expected = new ArrayList<String>
			(Arrays.asList());
			ArrayList<String> actual = (ArrayList<String>) model.getMessage();
		
			assertEquals(expected, actual);
		}
	
	@Test
	public void test4() {
		
		model.addCharacter('2');
		model.acceptWord();
		ArrayList<String> expected = new ArrayList<String>
		(Arrays.asList("a",""));
		ArrayList<String> actual = (ArrayList<String>) model.getMessage();
		
		assertNotEquals(expected, actual);
	}
	
	/**
	 * a test case to add a character then cycle to the next possible message for that char/ sig input.
	 */
	@Test
	public void test5() {
		
		model.addCharacter('3');
		model.nextMatch();
		ArrayList<String> expected = new ArrayList<String>
		(Arrays.asList("e"));
		ArrayList<String> actual = (ArrayList<String>) model.getMessage();
		
		assertEquals(expected, actual);
	}
	
	
	

}
