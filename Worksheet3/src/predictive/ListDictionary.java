package predictive;

import java.awt.List;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;



/**
 * The ListDictionary class.
 * 
 * @author Daniel Hill
 * @version 1.0
 * @since 2017-02-02
 */

/**
 *  This is the constructor for the class ListDictionary it sets the Dictname which is the name of the Dictionary in the files.
 *   It reads and stores an ArrayList. Each entry of the ArrayList is a pair of the word that has been read in and its signature. 
 */   

//test
//Set<String> set = new HashSet<String>();


public class ListDictionary {

	private String Dictname;
	public ArrayList<WordSig> list = new ArrayList<WordSig>();
	
	public ListDictionary(String Dictname,ArrayList<WordSig> list) throws FileNotFoundException {
		this.Dictname = Dictname;
		this.list = list;
		
		String  thisLine = null;
		FileReader in = new FileReader(Dictname);
		
		
		try{
	         // open input stream test.txt for reading purpose.
	         BufferedReader br = new BufferedReader(in);
	         while ((thisLine = br.readLine()) != null) {
	        	
	           // System.out.println(thisLine);

	            if (isValidWord(thisLine) == true){
	            	 list.add(new WordSig(thisLine,wordToSignature(thisLine)));
	            }
	            
	            Collections.sort(list);  
	           // System.out.println(list);
	        	 }

	      }catch(Exception e){
	         e.printStackTrace();
	      } 
	};
	
	/*
	 * The method takes the given word and returns true if it matches the lower
	 * case a to z and returns false if it does not.
	 * 
	 * @param String word
	 * 
	 * @return boolean
	 */	
	
	public static boolean isValidWord(String word) {
		return word.matches("[a-z]+");
	}
	
	/*
	 * The method takes a word and returns a numeric signature. If the word has
	 * any non-alphabetic characters, it replaces them with a “ ” (space) in the
	 * resulting signature. It then accumulates the result from each character.
	 * It uses the StringBuffer class this will be more efficient: Explanation:
	 * If objects of type String are read only and immutable. The StringBuffer
	 * class can be used for characters that can be modified. StringBuffer is
	 * the best option as StringBuffer is much quicker than the String when
	 * performing simple concatenations.
	 * 
	 * @param word
	 * 
	 * @return String word2
	 */  
	
	
	
	public static String wordToSignature(String word){
		 word = word.toLowerCase();
		 StringBuffer sb = new StringBuffer("");
		 String letter;
	   
	    	 HashMap<Character, Integer> map = new HashMap<Character, Integer>();
	    	 map.put('a', 2);map.put('b', 2);map.put('c', 2);
	    	 map.put('d', 3); map.put('e', 3);map.put('f', 3);
	    	 map.put('g', 4);map.put('h', 4);map.put('i', 4);
	    	 map.put('j', 5);map.put('k', 5);map.put('l', 5);
	    	 map.put('m', 6);map.put('n', 6);map.put('o', 6);
	    	 map.put('p', 7);map.put('q', 7);map.put('r', 7);
	    	 map.put('s', 7);map.put('t', 8);map.put('u', 8);
	    	 map.put('v', 8);map.put('w', 9);map.put('x', 9);
	    	 map.put('y', 9);map.put('z', 9);
	    	    
		        for (int i = 0; i < word.length(); i++){	        	
		        	char letter1 = word.charAt(i);
		        	Integer value = map.get(letter1);	        
				     sb.append(value);				    
		        }	         
				    String word2 = sb.toString();
		return word2;
	}
	
	/*
	 * @param ArrayList<WordSig> list
	 * The signatureToWords method must be re-written as an instance method in the List- Dictionary class to use the stored dictionary.
	 *  The ArrayList<WordSig> must be stored in sorted order and the signatureToWords method must use binary search to perform the look-ups.
	 */
	
	//out of bounds 
	
	
	public Set<String> signatureToWords(String signature) {	
		Set<String> list1 = new HashSet<String>();
		
		int index = Collections.binarySearch(list, new WordSig(null,signature));
		int i = 0;
		try{
		while (list.get(index + i).getSignature().equals(signature)){
			list1.add(list.get(index + i).getWord());
			i++;
		}
		 i = 0;
				while (list.get(index + i).getSignature().equals(signature)){
					list1.add(list.get(index + i).getWord());
					i--;
				}
		} catch (ArrayIndexOutOfBoundsException e){
			System.out.println("The word is not there");
		}
		
		return list1;
	}
	
	/*This is the main method of the class.
	 */
	public static void main(String args[]) throws FileNotFoundException {
		ArrayList<WordSig> list1 = new ArrayList<WordSig>();
		ListDictionary firstDict = new ListDictionary("/Users/danielhill/text.txt",list1);
		
		System.out.println(firstDict.signatureToWords("4663"));
	}
	
}