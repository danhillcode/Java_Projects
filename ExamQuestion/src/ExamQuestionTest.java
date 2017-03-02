import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

/**Public tests for Ex1.
 *
 * @author Daniel Hill
 * 
 */

public class ExamQuestionTest {

	private ExamQuestion q1;
	@Before
	public void setUp() {
	q1 = new ExamQuestion("What is 2 times 3",10);	
	}
	

	@Test
	public void test() {
		//System.out.println(q1);
		assertEquals("Question (maximal mark: 10) What is 2 times 3?.",q1.toString());
		
	}
	
	@Test
	public void test1() {
		ExamQuestionNumeric q2 = new ExamQuestionNumeric("2+3 = ?", 10, 5); 
		assertNotSame(10,q2.mark(6));
	}
	
	@Test
	public void test2() {
		ArrayList<String> a = new ArrayList<String>();
		a.add("4");a.add("5"); a.add("10"); a.add("20");
		ExamQuestionSimpleChoice q2 = new ExamQuestionSimpleChoice("2+3 = ?", 10, a, 2); 
		//System.out.println(q2.mark(1));
		assertSame(10,q2.mark(2));
	}
}
