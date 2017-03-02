import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
/**
 * This is a simple class called DictionaryModel which allows a user to produce T9 text messages through the use of a GUI.
 * This class implements an interface called DIctionaryModelInterface and extends Observable.
 * @author Rasveer Bansi
 * @version 2017-02-18
 */
public class DictionaryModel extends Observable implements DictionaryModelInterface{
	public SampleDictionary dictionary;
	public List<String> message;
	public String signature;
	public String[] possibleMatches;
	public String currentWord;
	public int match;
	public int counter;
/**
 * This class has two constructors.
 * This constructor uses a set dictionary file of my choosing. 
 * @param dictionaryFile is the chosen dictionary file.
 * @throws java.io.IOException throws an IO exception, for example if the file cannot be found.
 */
	public DictionaryModel(String dictionaryFile) throws java.io.IOException {
		this.dictionary = new SampleDictionary(dictionaryFile);
		this.match = 0;
		this.signature = "";
		this.currentWord = "";
		this.possibleMatches = null;
		this.counter = 0;
	}
/**
 * This constructor takes the path name of a dictionary file and initializes the internal data structures.
 * @throws java.io.IOException throws an IO exception, for example if the path cannot be found.
 */
		public DictionaryModel() throws java.io.IOException {
			super();
			this.dictionary = new SampleDictionary("/Users/danielhill/Desktop/text.txt");
			this.message = new ArrayList<String>();
			this.signature="";
			this.currentWord = "";
			this.possibleMatches = null;	
			this.counter = 0;
		}
/**	
 * This method returns the message entered by the user via the GUI interface.
 */
	public List<String> getMessage() {
		return this.message;
	} 

	//addCharacter method - gives the keys typed n the keypad
		    //uses dictionary to predict possible words/prefixes and store internally 
 public void addCharacter(char key){
	 StringBuilder sig = new StringBuilder(signature);
	 sig.append(key);
	 this.signature = sig.toString();
	 System.out.println(this.signature);
	 
	 if(dictionary.signatureToWords(signature).isEmpty()){
		 this.signature = signature.substring(0, signature.length()-1);
	 }	 
		 this.possibleMatches = new String[dictionary.signatureToWords(signature).size()];
		 this.possibleMatches = dictionary.signatureToWords(signature).toArray(possibleMatches);
	 
		 if(this.message.size() == 0){
			 this.message.add(possibleMatches[0]);
		 }
		 else{
			 this.message.remove(message.size() - 1);
			 this.message.add(possibleMatches[0]);
		 }
		 
		 setChanged();
		 notifyObservers();
 }
 @Override
 public void removeLastCharacter() {
		if(message.isEmpty()){
			return;
		}
		else{
			if(signature.length() == 0){
				this.signature = PredictivePrototype.wordToSignature(message.get(message.size()-1));
			}
			else if(signature.length() ==1 ){
				this.signature = "";
				this.message.remove(message.size()-1);
			}
			else{
				this.signature = signature.substring(0, signature.length() -1);
				this.possibleMatches = new String[dictionary.signatureToWords(signature).size()];
				this.possibleMatches = dictionary.signatureToWords(signature).toArray(possibleMatches);
				this.message.remove(message.size()-1);
				this.message.add(possibleMatches[0]);
			}
			setChanged();
			notifyObservers();
		}
		
	}		    
//nextMatch cycles through matches to select next matching word/prefix among possible matches
  //also internally stores the message being composed
 @Override
 public void nextMatch() {
		if(signature == ""){
			return;
		}else{
	 //want to remove previous signature not add repeatedly like right now
			
			this.counter = counter+1;
			this.currentWord = possibleMatches[this.counter%possibleMatches.length];
			
			//method here to remove the current word to add the next one
			
			for(int i = 0; i < possibleMatches.length;i++){
			this.message.remove(possibleMatches[i]);
			}
			this.message.add(this.currentWord);
		
		}	
		
		setChanged();
		notifyObservers();
		}
		
		
 		
	
  //allows the current matched word to be accepted and added to the composed message
 @Override
	public void acceptWord() {
	 this.message.add(currentWord);
	 this.match = 0;
		this.signature = "";
		this.currentWord = "";
		this.possibleMatches = null;
		this.counter =0;
	 	
		
	}
 
 public static void main(String[] args) throws IOException{
	 DictionaryModel numero1 = new DictionaryModel("/Users/danielhill/Desktop/text.txt");
	 //numero1.addCharacter('1');
		//numero1.addCharacter('1');
		//numero1.removeLastCharacter('C');
		//numero1.getMessage();
		//numero1.getMessage();
 }

}