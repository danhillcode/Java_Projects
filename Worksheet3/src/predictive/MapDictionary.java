package predictive;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.Map.Entry;

/**
 * The MapDictionary class.
 * 
 * @author Daniel Hill
 * @version 1.0
 * @since 2017-02-02
 */

public class MapDictionary implements Dictionary {
	
	private static final int String = 0;
	String Dictname;
	//This stores the Hashmap which contains the storage of values with their corresponding words
	HashMap<java.lang.String, Set<java.lang.String>> store; //= new HashMap<String,TreeSet<String>>();
    
	
	
	//TreeSet<String> wordStore =new TreeSet<String>();  
	
	
	//add a Tree and a set within that Tree
	//,HashMap<String,TreeSet<String>> store
	public MapDictionary (String Dictname) throws FileNotFoundException {
			//this.Dictname = Dictname;
			this.store = new HashMap<String,Set<String>>();
			
			String  thisLine = null;
			FileReader in = new FileReader(Dictname);
			
			
			try{
		         // open input stream test.txt for reading purpose.
		         BufferedReader br = new BufferedReader(in);
		         while ((thisLine = br.readLine()) != null) {
		        	
		           // System.out.println(thisLine);

		            if (isValidWord(thisLine) == true){
		            	//helper method call
		            	//sends word
		            	
		            	String word  = thisLine;
		            	addValue(word);
		            }
		            
		            //Collections.sort(set);  
		           // System.out.println(set);
		        	 }

		      }catch(Exception e){
		         e.printStackTrace();
		      } 
		};

		public static boolean isValidWord(String word) {
			return word.matches("[a-z]+");
		}
	
		
		
		//takes in sig 
		//converts to signature to word - future ref
		//if sig is in the dict/store - add the word to that sig to its TreeSet 			
		//else add the sig and the word to the dict/store
		
		//?????can I use this call to the package or have to use method within the interface?????
		
		public void addValue(String sig) throws FileNotFoundException{
			
			Set<String> word = predictive.PredictivePrototype.signatureToWords(sig);
			
			TreeSet<java.lang.String> values = new TreeSet<String>();
			//store.put("4663", values);
			
			if(store.containsKey(sig)){	
				values.add(word.toString());
				
			} else {
				store.put(sig, values);
				values.add(word.toString());
				
			}
			System.out.println(store.get(sig));
		
		}
		
		

		
		
		public static void main(String args[]) throws FileNotFoundException {
			MapDictionary firstDict = new MapDictionary("/Users/danielhill/Desktop/djh639-WS2-3/text.txt");
			firstDict.addValue("4663");
			firstDict.addValue("364");
			
		}

		@Override
		public Set<java.lang.String> signatureToWords(java.lang.String signature) {
			// TODO Auto-generated method stub
			return null;
		}

}

