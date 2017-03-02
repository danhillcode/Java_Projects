import java.util.Arrays;
import java.util.Set;
import java.util.Collection;
//import java.util.List;
import java.util.Arrays;

public class Worksheet1 extends List {

    /** This is the slow method for power a number it take in two integers a and n
     * 
     */
    //1.
	public static int power(int m, int n){
    	
	    if ( n == 0 ) {
	        return 1;
	    }
	    return ( m * power(m,n-1));
	}
	
    
    
    /** This is the fast method for power a number it take in two integers m and n
     * 
     */
	public static int fastPower(int m, int n) {
		// uses z as a local variable.  
		  int z;
		  // n equals to 0 then the power must be 1. Simple case (base case)
		    if (n == 0){ return 1;}
		    // if n is a even number divide n by two.
		    if (n % 2 == 0) {
		        z = fastPower(m, n / 2);
		        return z * z;
		        // else if an odd number use hardest case. 
		    } else { return (m * fastPower(m, n - 1));
		}
	  }
    	
	
    /** This is the negateAll method it take in a list as its parameter
     * Given a list of integers a, the method returns a new list with all 
     * the elements of a with sign negated, i.e., positive integers become negatives
     *  and negative integers become positives.
     *  [2, -5, 8, 0] ==> [-2, 5, -8, 0]
     */
//2.
	static List negateAll(List a){
    	if (a.isEmpty()){
    		return a;
    	}
    	else{
    	return cons( ( a.getHead() * -1 ), (negateAll ( a.getTail() )));		
    }	
    }
	
	//.3
	 /** This is the find method it takes in an integer x and List a. 
	  * The integer x is assumed to be in the list a, the method returns the position of 
	  * the first occurrence of x in a. If x does not appear in the list, the method throws an IllegalStateException. 
      * it returns the position not number itself.
      */
			
	static int find(int x, List a){
		
		if (a.isEmpty()){
			throw new IllegalStateException("  X does not appear in the list. haha");
		}
		else if(x == a.getHead()){
		return 0;
		}
		else{	
		return find(x, a.getTail()  ) + 1 ;
	}
	}
	
//.4

	 /**Given a list of integers a, the method returns a boolean value indicating whether all its elements are positive,
	  *		if the list is empty it should throw an illegal argument exception.
	  */
	static boolean allPositive(List a){
		
		
		if (a.isEmpty()){
			return true ;
		}
		else if ((a.getHead() >= 0)){
			 return allPositive(a.getTail());}
		 else{ 
				return false;
		 }
		
		}
	
	//.5
	
	/**Given a list of integers a, returns a new list which contains all the positive elements of a.
				The elements appear in the result in the same relative order as in a. 
	  */
	static List positives(List a){
		//List test2 = List.empty();
		if (a.isEmpty())
		{
			return List.empty();
		}
		else if (a.getHead() >= 0){	
			return List.cons(a.getHead(), positives(a.getTail()));
		}
		else 
			return  positives(a.getTail());
		}

	// >= 0
	
	
			//[2, 3, -5, 8, -2] ==> [2, 3, 8] 
	
	
	
	
	//.6 

	/*Given a list of integers a, this method must return a boolean value indicating whether a is sorted in increasing order.
		*	(There can be duplicate copies of elements. But, sortedness would require that all the duplicate copies would 
			appear together.)
			*/		
	public static boolean sorted(List a){
		
		if (a.isEmpty()) {
			return false;
		}	
		
		else if (a.getTail().isEmpty()){
			return true;	
		} 
				
		else if (a.getHead() >= a.getTail().getHead() ) {
			//System.out.println(a.getHead());
			//System.out.println(a.getTail().getHead());
			
			return false;}
		else{
			return sorted(a.getTail());
		}	
	}
	
	 
	//.7 
	/*static List merge(List a, List b){
		
		if(a.isEmpty()){
			return b;
		}else if (b.isEmpty() ){
			return a;
		//}else if()	
		}
		else 
		{
			return List.cons(a.getHead(), merge(a.getTail(),b));
		}
}*/
	
	/*public static List merge(List a, List b) {
		if (a.isEmpty())
			return b;
		else if (b.isEmpty())
			return a;
			
		else if (a.getHead() < b.getHead()){
			return
			List.cons(a.getHead(),merge(a.getTail(),List.cons(b.getHead(), b.getTail())));
			//List.cons(b.getHead()
		}
		else if (b.getHead() < a.getHead()){
			return 
					List.cons(b.getHead(),merge(b.getTail(),List.cons(a.getHead(), a.getTail())));
					//List.cons(a.getHead()
		}
		return merge(a,b);
	}
	*/
		
	public static List merge(List a, List b) {
		if (a.isEmpty()) {
			return b;
		} else if (b.isEmpty()) {
			return a;
		} else if (a.getHead() < b.getHead()){
			a = List.cons(a.getHead(), merge(a.getTail(), b));
			return a; 
			
		} else {
			b = List.cons(b.getHead(), merge(a, b.getTail()));
			return b;
		} 
	
	}
	
	
	//Given two sorted lists a and b, your method must return a new sorted list that contains all the elements of a 
	//		and all the elements of b. Any duplicate copies of elements in a or b or their combination are retained. Examples:
	//a: [2, 5, 5, 8] b:[5, 7, 8, 9] ==> [2, 5, 5, 5, 7, 8, 8, 9] a: [2, 5, 5, 8] b:[9] ==> [2, 5, 5, 8, 9]

	
	//8.
	
	public static List removeDuplicates(List a) {
		if (a.isEmpty()) {
			return List.empty();
		} else if (a.getTail().isEmpty()) {
			return List.cons(a.getHead(), List.empty());
		} else if (a.getHead() != a.getTail().getHead()){
			return List.cons(a.getHead(), removeDuplicates(a.getTail()));
		} else
	return removeDuplicates(a.getTail());
}
	
	/*public static List removeDuplicates(List a){	
		if(a.isEmpty()){
			return List.empty();
		}else if(a.getTail().isEmpty()){
			return a;
		}			
		else if(a.getHead()!=a.getTail().getHead()){
			return List.cons(a.getHead(), (removeDuplicates(a.getTail())));				
		}else {
		return removeDuplicates (a.getTail());
	}
}*/
	
	
//	In the last else remove the cons but
//	Bit
//	Just have a recursive call with the tail
//	And for omthe else if before the last else you should return a new list with head and a recursive tail
//	Are u in labs ? Probs easier to explain it to u
//	And it should be not equals instead of equals
	
	/*
	Given a sorted list a, this method must return a copy of the list a with all duplicate copies removed. 
			Example: [2, 5, 5, 5, 7, 8, 8, 9] ==> [2, 5, 7, 8, 9]
	(Hint: Please feel free to define helper functions!)
	
	The naturally immediate solution for this problem requires O(n2) time for producing its result. 
	But, we are really only interested in using this function for the case of lists sorted in increasing order. 
	For sorted lists, the problem can be solved more efficiently, in O(n) time. To receive full credit, you should
	produce an O(n) program which works for sorted lists. We will only test the function for sorted lists.
	*/
	
	

	
	
    public static void main(String[] args) {
    	//System.out.print(powers(2,4));
    	List test1 = List.empty();
    	List test3 = List.cons(9, List.cons (14, List.empty()));
    	List test = List.cons(14, List.cons(0, List.cons(14, List.cons(14, List.empty()))));
    	
    	List test2 = List.cons(1, List.cons(1, List.cons(4, List.cons(4, List.empty()))));
    	
    	
    	System.out.println(merge(test3,test2));
    	
    	//System.out.println(removeDuplicates(test2));
    	
    	//System.out.println(fastPower(2,1));
        
    	//List TheList = new List(1,nums);
    	//System.out.println(fastPower(3,3));
    
	}
	
	

}
