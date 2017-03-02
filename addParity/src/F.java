/**
 * @author Daniel Hill
 *
 */

/**
 * This is the class StarRating contains within it a method interpret which aims
 * to classify a movie's rating by assessing it's rating value and then
 * outputting the corresponding rating category.
 */
public class StarRating {

	/**
	 * The method interpret takes in rating which is a double value. The value
	 * is linked to a category of film which indicates the quality (not rated,
	 * CRAP, OK, EXCELLENT and [HAS ONLY ONE REVIEW]) which are returned as
	 * strings.
	 */
	public static String interpret(double rating) {

		/**
		 * The nested for loop within this method takes the rating and will
		 * check to find the corresponding String related to that value. The
		 * method uses an if else statement which checks the first condition
		 * then if it is false moves to the next value.
		 */
		if (rating < 0.0 || rating > 5) {
			return "not rated";
		} else if (rating >= 0.0 && rating < 4.0) {
			return "Crap";
		} else if (rating >= 4.0 && rating < 4.5) {
			return "OK";
		} else if (rating >= 4.5 && rating < 5) {
			return "EXCELLENT";
		} else {
			return "[HAS ONLY ONE REVIEW]";
		}
	}

	/** This is the main method which calls the methods from this StarRating class
	 */
	public static void main(String[] args) {
	System.out.println(interpret(3));
	}
}

/**
 * @author Daniel Hill
 *
 */
import java.util.Arrays;

/**
 * This is the class BubbleSort that contains within it a method which aims
 * to modify arrays so that they sort the elements contained within the array.
 * The array should modify the array so that they return values from the lowest to the greatest value.
 *The method takes an integer array as ts input.
 */

/* The sorting method takes two elements and comapre them against each other then move the values if 
 * they are greater than the other. The method should store the lowest values to the left which increments
 * to the greatest values on the right side of the array.
 */

public class BubbleSort {
public static void main(String args[])
    {
 
int[] anArray = { 
4, 3, 6, 1, 9, 2
};
 
int[] anArray2 = new int[10];
 
        for ( int i = 0 ; i < anArray.length ; i++ ){
        if (anArray[i] >= anArray[i]) { 
        anArray[i] = anArray[i+1];
       
        System.out.println(anArray[i]);}
        else { 
        System.out.println(anArray[i]);
}
 
    }
  }
 
 
}
*/