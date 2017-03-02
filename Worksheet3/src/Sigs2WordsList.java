import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;


/**
 * The Sigs2WordsList class.
 * 
 * @author Daniel Hill
 * @version 1.0
 * @since 2017-02-02
 * 
 * 
 */

/**
*This is the Sigs2WordsList class it is a command-line programs (classes with main methods)  for calling the signatureToWords method. 
*/

public class Sigs2WordsList {
	

	public static void main(String[] args) throws FileNotFoundException {
		
		// TODO Auto-generated method stub
		for(int i = 0; i < args.length; i++) {
				System.out.println(PredictivePrototype.signatureToWords(args[i]));
        }	
	
	}
    
}
    
