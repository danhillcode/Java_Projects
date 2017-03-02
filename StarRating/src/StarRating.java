
public class StarRating {

	
	//Need to change the String input back into a double 
	public static String interpret(double rating){
	
		//double rate = Double.parseDouble(rating);
		
		if (rating < 0.0 || rating > 5){
			return "not rated";}  
		else if (rating >= 0.0 && rating < 4.0 ){
	    	return "Crap";}
		else if (rating >= 4.0 && rating < 4.5 ){
			return "OK";}
		else if (rating >= 4.5 && rating < 5) {
			return "EXCELLENT";}
		else {return "[HAS ONLY ONE REVIEW]";
		}
		}
	    
	 
	
	public static void main(String[] args) {
		System.out.println(interpret(3));
	}
	
	
	
}
	
	



//and other- wise returns "not rated". A "CRAP" rat- ing starts at 0.0 and may extend up to,
//but excluding, 4.0; "OK" should start from 4.0, "EXCELLENT" from 4.5, and "[HAS ONLY ONE
//REVIEW]" from 5.0.