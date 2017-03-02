import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;


public class EmployeeTest {

	private Employee emp1;
	
	@Before
	public void setUp() {
		emp1 = new Employee("John", "Smith", 25);

		@Test
		public void test1() {
		
			emp1.setFirstName("James");
			emp1.setSurname("Smith");
			
			assertEquals("James",emp1.getFirstName());
			
		}
		
	}
}






/** Public tests for Ex4.
 *
 * @author Alexandros Evangelidis
 * 
 

	
	

	
	@Test
	public void test2() {
	
		emp1.setHourlySalary(40.4);
		emp1.setNumberOfHours(29);
		
		assertEquals(1171.6, emp1.monthlySalary(),0.000001);
	}

	@Test
	public void test3() {
	
		emp1.setHourlySalary(30.5);
		emp1.setNumberOfHours(52);
		
		assertEquals(1586, emp1.monthlySalary(),0.000001);
	
		emp1.increaseSalary(5.4);
	
		assertEquals(1671.644, emp1.monthlySalary(),0.000001);
	
	}
	@Test
	public void test4() {
	
		emp1.setHourlySalary(30.5);
		emp1.setNumberOfHours(52);
		
		emp1.increaseSalary(5.4);
		emp1.increaseSalary(10.5);
		assertEquals(1847.166619, emp1.monthlySalary(),0.000001);
	
	}

}
*/