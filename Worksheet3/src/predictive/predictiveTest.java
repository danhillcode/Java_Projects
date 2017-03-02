package predictive;

import static org.junit.Assert.*;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

/**
* The PredictiveProtottype tests.
* 
* @author Daniel Hill
* @version 1.0
* @since 2017-02-02
*/


public class predictiveTest {

	
	@Test
	public void test1() throws FileNotFoundException {
		Set<String> set = new HashSet<String>();
		set.add("home");
		assertEquals(PredictivePrototype.wordToSignature("home"), "4663");
	}
	
	
	
	@Test
	public void test2() throws FileNotFoundException {
		Set<String> set = new HashSet<String>();
		set.add("home");
		assertNotEquals(PredictivePrototype.wordToSignature(""), "4663");
	}
	
	@Test
	public void test3() throws FileNotFoundException {
		Set<String> set = new HashSet<String>();
		set.add("home");
		assertEquals(PredictivePrototype.signatureToWords("4663"), set);
	}
	
	@Test
	public void test4() throws FileNotFoundException {
		Set<String> set = new HashSet<String>();
		set.add("");
		assertNotEquals(PredictivePrototype.signatureToWords("4663"), set);
	}
	
	@Test
	public void test5(){
		String word = "Hello";
		assertSame(PredictivePrototype.isValidWord(word), false);
	} 

	@Test
	public void test6(){
		String word = "hello";
		assertSame(PredictivePrototype.isValidWord(word), true);
	} 
	
	@Test
	public void test7() throws FileNotFoundException {
		assertEquals(PredictivePrototype.wordToSignature("eat"), "328");
	}
	
	@Test
	public void test8() throws FileNotFoundException {
		assertNotEquals(PredictivePrototype.signatureToWords("328"), "eat");
	}
	
	
	//tests for ListDictioanry
	
	@Test
	public void test9() throws FileNotFoundException{
		
		ArrayList<WordSig> list1 = new ArrayList<WordSig>();
		ListDictionary firstDict = new ListDictionary("/Users/danielhill/text.txt",list1);
		assertSame(firstDict.signatureToWords("4663").size(), 1);
	}
	
	@Test
	public void test10() throws FileNotFoundException{
		
		ArrayList<WordSig> list1 = new ArrayList<WordSig>();
		ListDictionary firstDict = new ListDictionary("/Users/danielhill/text.txt",list1);
		assertEquals(firstDict.signatureToWords("4663").contains("home"), true);
	}
	
	//test word not within dictionary
	@Test
	public void test11() throws FileNotFoundException{
		
		ArrayList<WordSig> list1 = new ArrayList<WordSig>();
		ListDictionary firstDict = new ListDictionary("/Users/danielhill/text.txt",list1);
		assertEquals(firstDict.signatureToWords("1111").contains("aaaa"), false);
	}
	
	
	

	@Test
	public void test12() throws FileNotFoundException {
		
		ArrayList<WordSig> list1 = new ArrayList<WordSig>();
		ListDictionary test = new ListDictionary("/Users/danielhill/text.txt",list1);
		String expected = "[daw, dax, day, dbw, fax, fay, fcy]";
		String actual = test.signatureToWords("329").toString();
		assertNotEquals(expected, actual);
	}
	
	@Test
	public void test13() throws FileNotFoundException {
		Set<String> set = new HashSet<String>();
		set.add("home");
		assertNotEquals(ListDictionary.wordToSignature(""), "4663");
	}
	
	@Test
	public void test14(){
		String word = "dan";
		assertSame(ListDictionary.isValidWord(word), true);
	}
	
	@Test
	public void test15(){
		String word = "Dan";
		assertSame(ListDictionary.isValidWord(word), false);
	} 
	
	
	
	
}
