import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class MeasurableTest {

		private Patient p1;
		@Before
		public void setUp() {
		p1 = new Patient("John",25,12.0);	
		}
	
		private Patient p2;
		@Before
		public void setUp1() {
		p2 = new Patient("Dan",27,12.0);	
		}
		
		private static final double DELTA = 1e-15;
		ArrayList<Measurable> list = new ArrayList <Measurable>();
		@Before
		public void setUp2() {
			p1 = new Patient("John",25,12.0);
			p2 = new Patient("Dan",27,12.0);	
		}
		
	@Test
	public void test1() {
		p1.setName("Mr.Shi");		
		assertEquals("Mr.Shi",p1.getName());
	}
	@Test
	public void test2(){
		list.add(p1);
		list.add(p2);
		double m= Statistics.mean(list);
		assertEquals(12.0,m,DELTA);
	}
	
	
	
	//private static final double DELTA2 = 1e-15;
	//ArrayList<Measurable> list = new ArrayList <Measurable>();
	@Before
	public void setUp3() {
		p1 = new Patient("John",25,12.0);
		p2 = new Patient("Dan",27,12.0);	
	}
	
	@Test
	public void test3(){
		list.add(p1);
		list.add(p2);
		double sd= Statistics.standardDeviation(list);
		assertEquals(0.0,sd,DELTA);
	}
	
	
}

