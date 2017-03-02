import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;


public class VehicleTest {

	private Vehicle v1;
	@Before
	public void setUp() {
	v1 = new Vehicle(105,4);	
	}
	

	private static final double DELTA = 1e-15;
	
	
	@Test
	public void test1() {
		v1.setMaxSpeed(50.00);		
		assertEquals(50.0,v1.getMaxSpeed(),DELTA);
	}

}
