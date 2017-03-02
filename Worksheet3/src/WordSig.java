

import java.io.FileNotFoundException;

/**
 * The ListDictionary class.
 * 
 * @author Daniel Hill
 * @version 1.0
 * @since 2017-02-02
 */

//test
  

public class WordSig implements Comparable<WordSig>{
    private String word;
    private String signature;
    
    
    /**
     *  This is the constructor for the class WordSig it implements Comparable<WordSig>.
     *   It reads a word and a signature and contains a toString method to return the word and the signature formatted. 
     */
    
    public WordSig (String word,String signature) { 
    	this.word = word;
    	this.signature = signature;
    }
    
    
    /* This is the getWord method.
     * @return word
     */
    public String getWord() {
		return word;
	}



    /* This is the getSignature method.
     * @return signature
     */
	public String getSignature() {
		return signature;
	}


	 /* This is the overridden toString method.
     * @return String(getWord and getSignature)
     */
	@Override
	public String toString(){
    	return getWord() + ":" + getSignature();
    }
    
    
    /*
     * This is the method for compareTo.
     * return int
     */
	@Override
    public int compareTo(WordSig ws) {
    	return this.getSignature().compareTo(ws.getSignature());
    }

	
	

	/*This is the main method of the class.
	 */
    public static void main(String args[]) throws FileNotFoundException {
		// System.out.println(wordToSignature("Home"));
		WordSig numero1 = new WordSig("hello", "4663");
		System.out.println(numero1.word);
	}




}