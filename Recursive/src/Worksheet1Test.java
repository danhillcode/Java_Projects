import static org.junit.Assert.*;

import org.junit.Test;

/** @author
 *  Daniel Hill
 * This class contains the test cases for Worksheet1 solutions.
 */

 import static org.junit.Assert.*;

 import org.junit.Test;

 public class Worksheet1Test {



 	//This method test power method
 	@Test
 	public void test1() {

 		int Value1 = 2;
 		int Value2 = 2;

 		assertSame(Worksheet1.power(Value1,Value2),4);
 	}

 	public void test1a() {

 		int Value1 = 3;
 		int Value2 = 3;

 		assertSame(Worksheet1.power(Value1,Value2),9);
 	}
 	//test for fastPower
 	@Test
 	public void testfastPower()
 	{
 	int m = 3;
 	int n = 3;
 	int expected = 27;
 	int actual= Worksheet1.fastPower(m,n);
 	assertEquals(expected, actual);
 	   }

 	@Test
 	public void testfastPowera()
 	{
 	int m = 1;
 	int n = 0;
 	int expected = 1;
 	int actual= Worksheet1.fastPower(m,n);
 	assertEquals(expected, actual);
 	   }
 	//test for negate all
 	@Test
 	public void test2() {
 		List test = List.cons(-2, List.cons(-5, List.cons(-8, List.cons(-1, List.empty()))));
 		List test1 = List.cons(2, List.cons(5, List.cons(8, List.cons(1, List.empty()))));
 		//System.out.println(test);
 		//System.out.println(Worksheet1.negateAll(test));
 		assertEquals(Worksheet1.negateAll(test),test1);
 	}

 	@Test
 	public void test2a() {
 		List test = List.cons(2, List.cons(5, List.cons(-8, List.cons(1, List.empty()))));
 		List test1 = List.cons(-2, List.cons(-5, List.cons(8, List.cons(-1, List.empty()))));
 		//System.out.println(test);
 		//System.out.println(Worksheet1.negateAll(test));
 		assertEquals(Worksheet1.negateAll(test),test1);
 	}


 	//Test for find method
 	@Test
 	public void test3() {

 		int Value1 = 2;
 		List test1 = List.cons(2, List.cons(5, List.cons(8, List.cons(1, List.empty()))));

 		assertSame(Worksheet1.find(Value1,test1),0);
 	}

	@Test
 	public void test3a() {

 		int Value1 = 8;
 		List test1 = List.cons(2, List.cons(5, List.cons(8, List.cons(1, List.empty()))));

 		assertSame(Worksheet1.find(Value1,test1),2);
 	}

	//test for allPositive
 	@Test
 	public void test4() {

 		List test1 = List.cons(2, List.cons(5, List.cons(8, List.cons(1, List.empty()))));

 		assertSame(Worksheet1.allPositive(test1),true);
 	}
 	
 	@Test
 	public void test4a() {

 		List test1 = List.cons(-2, List.cons(5, List.cons(-8, List.cons(1, List.empty()))));

 		assertSame(Worksheet1.allPositive(test1),false);
 	}

 	@Test
 	public void test5() {

 		List test1 = List.cons(-2, List.cons(5, List.cons(8, List.cons(1, List.empty()))));

 		assertSame(Worksheet1.allPositive(test1),false);
 	}

 	
 	@Test
 	public void test6() {

 		List test1 = List.cons(-2, List.cons(5, List.cons(8, List.cons(1, List.empty()))));
 		List test2 = List.cons(5, List.cons(8, List.cons(1, List.empty())));

 		assertEquals(Worksheet1.positives(test1),test2);

 	    
 	}
 	
 	@Test
 	public void test6a() {

 		List test1 = List.cons(-2, List.cons(-5, List.cons(8, List.cons(1, List.empty()))));
 		List test2 = List.cons(8, List.cons(1, List.empty()));

 		assertEquals(Worksheet1.positives(test1),test2);

 	    
 	}

 	//allPositves
 	@Test
 	public void test7() {

 		List test1 = List.cons(-2, List.cons(5, List.cons(8, List.cons(1, List.empty()))));

 		assertSame(Worksheet1.allPositive(test1),false);
 	}
 	
 	@Test
 	public void test7a() {

 		List test1 = List.cons(2, List.cons(5, List.cons(8, List.cons(1, List.empty()))));

 		assertSame(Worksheet1.allPositive(test1),true);
 	}

 	//Test sorted method
 		@Test
 		public void test8() {

 			List test1 = List.cons(-2, List.cons(5, List.cons(8, List.cons(1, List.empty()))));

 			assertSame(Worksheet1.sorted(test1),false);
 		}

 		@Test
 		public void test9() {

 			List test1 = List.cons(1, List.cons(2, List.cons(3, List.cons(4, List.empty()))));

 			assertSame(Worksheet1.sorted(test1),true);
 		}

 		//test merge method
 		@Test
 		public void test10() {

 			List test1 = List.cons(1, List.cons(2, List.cons(3, List.cons(4, List.empty()))));
 			List test2 = List.cons(1, List.cons(2, List.cons(3, List.cons(4, List.empty()))));

 			List test3 = List.cons(1, List.cons(2, List.cons(3, List.cons(4, List.empty()))));

 			assertNotSame(Worksheet1.merge(test1,test2),test3);
 		}


		    @Test
		  public void test11() {
		
		    List a = List.cons(1,List.cons(2, List.cons(3, List.cons(4,List.empty()))));
		    List b = List.cons(4,List.cons(10,List.empty()));
		    List expected = List.cons(1,List.cons(2, List.cons(3,List.cons(4,List.cons(4, List.cons(10,List.empty()))))));
		    List actual = Worksheet1.merge(a, b);
		
		    assertEquals(expected, actual);
		  }
		
		  @Test
		  public void test12() {
		
		    List a = List.cons(1,List.cons(2, List.cons(3, List.cons(4,List.empty()))));
		    List b = List.cons(0,List.cons(15,List.empty()));
		    List expected = List.cons(0, List.cons(1,List.cons(2, List.cons(3,List.cons(4,List.cons(15,List.empty()))))));
		    List actual = Worksheet1.merge(a, b);
		
		    System.out.println(actual);
		    assertEquals(expected, actual);
		
		  }
		  
		//Test removeDuplicates method
	 		@Test
	 		public void test13() {

	 			List test1 = List.cons(1, List.cons(1, List.cons(4, List.cons(4, List.empty()))));

	 			List test2 = List.cons(1, List.cons(4, List.empty()));

	 			assertEquals(Worksheet1.removeDuplicates(test1),test2);
	 		}
	 		
	 		@Test
	 		public void test14() {

	 			List test1 = List.cons(1, List.cons(2, List.cons(4, List.cons(4, List.empty()))));

	 			List test2 = List.cons(1, List.cons(2, List.cons(4, List.empty())));

	 			assertEquals(Worksheet1.removeDuplicates(test1),test2);
	 		}

 }
