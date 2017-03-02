

import java.io.FileNotFoundException;

/**
 * The Sigs2WordsProto class.
 * 
 * @author Daniel Hill
 * @version 1.0
 * @since 2017-02-02
 */

//scanner in 

/**
*This is the Sigs2WordsProto class it is a command-line programs (classes with main methods)  for calling the signatureToWords method. 
*/

public class Sigs2WordsProto  {
	
	public static void main(String[] args) throws FileNotFoundException {
		
			// TODO Auto-generated method stub
			for(int i = 0; i < args.length; i++) {
					System.out.println(PredictivePrototype.signatureToWords(args[i]));
	        }	
			//wordToSignature(String[] args);
		}
	}

