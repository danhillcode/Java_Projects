import java.io.IOException;
import java.util.Arrays;


public class SudokuCheck extends Sudoku {

	public SudokuCheck(int[][] array){
		super(array);
	}
	
	public static boolean  [] check(Sudoku sudoku){
		
		int [][] bigArray = sudoku.getArray();
		 int smallArray[] = new int[9];
		 int checkArray[] = new int[9];
		 boolean booleanArray[] = new boolean[9];
		 int value = 0;	
		 
		for (int i = 0; i < 9; i++){
		
			//System.out.println(bigArray[0][i]);
			
			for(int j = 0; j < 10; j++)
	        {
	         
			//check if sudoku array/big array is j which is 1-9 then adds that value to a new array smallArray
			if (Arrays.asList(bigArray[2][i]).contains(j)){
				//System.out.print(" BA is " + bigArray[1][i] + " ");
				
				smallArray[i] = bigArray[2][i];
				
				
			}
	        }
		}
			
			//loop over the array checking all values(9n) are 1-9
			for(int k = 0; k < 9; k++){
				value = smallArray[k];
				
				//System.out.print(value + " ");
				
				
				 
			     
				
			 if (smallArray[k] > 0 || value == 1 || value == 2 || smallArray[k] == 3 || smallArray[k] == 4
						|| smallArray[k] == 5 || smallArray[k] == 6 || smallArray[k] == 7 || smallArray[k] == 8 || smallArray[k] == 9 || smallArray[k] == 10){
				 
				 checkArray[k] = smallArray[k];
				 
			 //else{
				//   booleanArray[k] = false;   
			 //}
			 }
			
			
			 
			}
			
			//loop to check if the checkarray values are equal to the smallArray if they are duplicates it changes 
			//to false
			
			for(int k = 0; k < 9; k++){
				//System.out.println("hey " + checkArray[k]);
			for(int l = 0; l < 9; l++){
				if (smallArray[k] == checkArray[l]){
					checkArray[l] = 0;
					booleanArray[k] =  true;
					//System.out.println(smallArray[k] + " equals " + checkArray[l]);
					
				}
				
				
			}
			System.out.println(booleanArray[k]);
			}
			
	        
			
			
			
			
	        
			
		
		
			return booleanArray;
		}
	
	
		
		
		
		public static void main(String[] args) {
			int [][] array = {{1, 2, 3, 4, 5 , 6, 7 , 8 ,9 },
		    		{4 , 5 , 6 , 7 , 8 , 9 , 1 , 2 , 2 },
		    		{7 , 8 , 9 , 1 , 2 , 3 , 4 , 5 , 5}, 
		    		{ 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9 , 1 }, 
		    		{ 5 , 6 , 7 , 8 , 9 , 1 , 2 , 3 , 4 }, 
		    		{ 8 , 9 , 1 , 2 , 3 , 4 , 5 , 6 , 7 }, 
		    		{ 3 , 4 , 5 , 6 , 7 , 8 , 9 , 1 , 2 }, 
		    		{ 6 ,  7 , 8 , 9 , 1 , 2 , 3 , 4 , 5}, 
		    		{ 9 , 1 , 2 , 3 , 4 , 5 , 6 , 7 , 8}}; 
			
			 Sudoku s1 = new Sudoku(array);
			 System.out.println(check(s1));
			
		}
	
		
	
	
}
