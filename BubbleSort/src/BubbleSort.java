import java.util.Arrays;

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