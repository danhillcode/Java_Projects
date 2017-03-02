

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

/**
 * The TreeDictionary class.
 * 
 * @author Daniel Hill
 * @version 1.0
 * @since 2017-02-02
 */


//general notes
//Notes on recursion search
	//It should support efficient search as well as efficient insertion of new words.
	//In addition, TreeDictionary should support finding words when only some initial part of the signature (a prefix) is known. 
	//This is so that the user can see the part of the word they intend to type as they are typing.
	

public class TreeDictionary implements Dictionary {
	
	//constructor to create a Tree with a single node 
	//have an array within that which forms the Tree
	
	// entry value
	// Node depth
	private final int nodeDepth;
   
    //children is the array for child node
    public int[] children = new int[8];
    
  // List of words
 	Collection<String> words = new HashSet<String>();
 	
 	/**
	 * Constructor to create a new blank tree, only used when creating the main
	 * root node
	 */
	public TreeDictionary(String Dictname) throws FileNotFoundException{
		this.nodeDepth = 0;	
		
		
		String  thisLine = null;
		FileReader in = new FileReader(Dictname);
		try{
	         // open input stream test.txt for reading purpose.
	         BufferedReader br = new BufferedReader(in);
	         while ((thisLine = br.readLine()) != null) {
	           // System.out.println(thisLine);
	            if (MapDictionary.isValidWord(thisLine) == true){
	            	//helper method call
	            	//sends word	
	            	String word  = thisLine;
	            	//addValue(word);
	            }
	            //Collections.sort(set);  
	           // System.out.println(set);
	        	 }

	      }catch(Exception e){
	         e.printStackTrace();
	      } 
	}
	
	//ADD VALUE METHOD NEEDED!!!!!!!

	/**
	 * Constructor when creating children nodes, should never be called by a
	 * user and only be this class 
	 * @param nodeDepth
	 *            The depth of the node you are creating
	 */	
	
	protected TreeDictionary(int nodeDepth) {
		this.nodeDepth = nodeDepth;
	}
	
	
	
	
	/**
	 * Used to insert a word into the tree, automatically creates the new
	 * children nodes
	 * 
	 * @param word
	 *            The word to insert
	 */
	public void insertWord(String word) {

		// If we are not at the root then add the word to the current node
		if (this.nodeDepth != 0)
			words.add(trimWord(word));

		// Only continue if the word length is less than the length of the word
		if (word.length() > nodeDepth) {
			//ValueMaps.getLetterToNumValue
			int charValue = (word.charAt(nodeDepth)) - 96;
			// If the child is null then is need to be created
			//ADDED THIS TO CAST!
			
			Integer value = new Integer(children[charValue]);
			
			if (value == null) {
				//chaneg made here!
				children[charValue] = new TreeDictionary(children[charValue] + 1);
			}
			// Recursive call to this function
			//children[charValue].
			insertWord(word);
		}

	}
	
	/**
	 * Trim a word to the depth of this node
	 * @param word The word to trim
	 * @return The trimmed word
	 */
	private String trimWord(String word) {
		return word.substring(0, nodeDepth);
	}
	
	

	/**
	 * Gets the words from a given signature
	 * 
	 * @param sig
	 *            The signature to get the words for
	 * @return The collection of words that are at that node. Includes all its
	 *         children
	 * @throws WordNotFoundException
	 *             Throws this if the signature os not in the data structure
	 */
	@SuppressWarnings("unused")
	public Collection<String> getWordsFromSig(String sig) throws IllegalStateException {
		// If its empty then we need to stop recursion
		if (sig.isEmpty()) {
			// Trim the words for output
			return words;
		} else {
			int childNumber = Character.getNumericValue(sig.charAt(0)) - 2;
			//Change
			Integer value = new Integer(children[childNumber]);
			if (value != null) {
				// Recall the method but with a string miss the first char
				//children[childNumber] -> Change!!!
				return getWordsFromSig(sig.substring(1));
			} else {
				// This means that the node is null, so there are no words with
				// that signature
				throw new IllegalStateException("Your word was not in the dictionary");
			}

		}

	}
	
	/**
	 * Return the words at this node
	 * 
	 * @return The words at this node
	 */
	public Collection<String> getWords() {
		return words;
	}

	
	/**
	 * Return a child of this node
	 * @param i
	 *            The index of the child to get
	 * @return The child from the given index
	 */
	public int getChild(int i) {
		return children[i];
	}

	
	
	
	
	
	
	
	
	//This is used to populate the Tree which is step Two
		//String Dictname;
		//HashMap<String,TreeSet<String>> store;
		
	
	@Override
	public Set<String> signatureToWords(String signature) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	public static void main(String args[]) throws FileNotFoundException {
		//TreeDictionary t = new TreeDictionary(0);
		//t.insertWord("home");
		// int[] children = new int[8];
		//95
		
		int nodeDepth = 1;
		String word = "home";
		//int charValue = (word.charAt(nodeDepth)) - "2";
		
		
		// If the child is null then is need to be created
		//ADDED THIS TO CAST!
		//Integer value = new Integer(children[charValue]);
		
	}
	
}
