


/**
 * The Words2SigProto class.
 * 
 * @author Daniel Hill
 * @version 1.0
 * @since 2017-02-02
 */




/**
*This is the Words2SigProto class it is a command-line programs (classes with main methods)  for calling the wordToSignature method. 
*/

//scanner in here 


public class Words2SigProto {
	public static void main(String[] args)   {
		// TODO Auto-generated method stub		
		for (int i = 0; i < args.length; i++) {
			System.out.println(predictive.PredictivePrototype.wordToSignature(args[i]));
		}
	}
}
