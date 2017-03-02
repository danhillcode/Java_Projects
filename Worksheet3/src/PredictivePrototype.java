

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Set;
import javax.swing.text.html.HTMLDocument.Iterator;
import com.sun.javafx.collections.MappingChange.Map;

/**
 * The PredictivePrototype class.
 * 
 * @author Daniel Hill
 * @version 1.0
 * @since 2017-02-02
 */



public class PredictivePrototype {

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

	public static String wordToSignature(String word) {

		word = word.toLowerCase();

		StringBuffer sb = new StringBuffer("");

		
		
		
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		map.put('a', 2);map.put('b', 2);map.put('c', 2);
		map.put('d', 3);map.put('e', 3);map.put('f', 3);
		map.put('g', 4);map.put('h', 4);map.put('i', 4);
		map.put('j', 5);map.put('k', 5);map.put('l', 5);
		map.put('m', 6);map.put('n', 6);map.put('o', 6);
		map.put('p', 7);map.put('q', 7);map.put('r', 7);
		map.put('s', 7);
		map.put('t', 8);map.put('u', 8);map.put('v', 8);
		map.put('w', 9);map.put('x', 9);map.put('y', 9);
		map.put('z', 9);

		for (int i = 0; i < word.length(); i++) {
			char letter1 = word.charAt(i);
			Integer value = map.get(letter1);
			sb.append(value);
		}
		String word2 = sb.toString();
		return word2;
	}

	/*
	 * The method takes the given numeric signature and returns a set of
	 * matching words from the dictionary. The returned list does not have
	 * copies and the word should be in lower-case. The method signatureToWords
	 * needs to use the dictionary to find words that match the string signature
	 * 
	 * Note: The File reader needs a specific link to the file for the access dictionary 
	 * 
	 * @param String signature
	 * 
	 * @return Set<String> set2
	 */

	public static Set<String> signatureToWords(String signature) throws FileNotFoundException {

		String thisLine = null;
		FileReader in = new FileReader("/Users/danielhill/Documents/workspace/Worksheet3/src/predictive/text.txt");
		Set<String> set = new HashSet<String>();

		try {
			// open input stream test.txt for reading purpose.
			BufferedReader br = new BufferedReader(in);
			while ((thisLine = br.readLine()) != null) {

				if ((signature.equals(wordToSignature(thisLine))) && (isValidWord(thisLine) == true)) {
					set.add(thisLine);

				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return set;
	}

	/*
	 * The method takes the given word and returns true if it matches the lower
	 * case a to z and returns false if it does not.
	 * 
	 * @param String word
	 * 
	 * @return boolean
	 */

	static boolean isValidWord(String word) {
		return word.matches("[a-z]+");
	}

	/*
	 * This is the main method of the class
	 */

	public static void main(String args[]) throws FileNotFoundException {
		System.out.println(signatureToWords("4663"));

	}

}
	

