
public class ParityCorrection {
	
	    public static int findRow(int[][] b) {	
	    	int columnLength = b.length -1;
	    	int rowLength = b[0].length -1;
	    	int sumOfRow;
	    	
	    	int lastRowItem = 0;
	    	int lastColumnItem;
	    	int status = -1;
	    
	        for (int column = 0; column < columnLength + 1; column++){
	        	sumOfRow = 0;
	        	
	        	lastRowItem = b[column][rowLength];
	        	
	    		for(int row=0; row< rowLength; row++){
	    			//System.out.println(a[row][column] + "\t");
	    			
	    			sumOfRow += b[column][row];	
	    			
	    		}
	    		
	    		//System.out.println(sumOfRow);
	    		System.out.println("y");
	    		System.out.println(lastRowItem);
	    		
	    		//System.out.println("Sum of cloumn " + sumOfRow);
	    		//System.out.println("last in column " + lastRowItem);
	    		
	    		
	    		//This if statement adds 1 if the result is 0 and adds 0 if the result is 1. ***This should be done to the new array
	    		if (sumOfRow % 2 == 0 && lastRowItem % 2 != 0){
					return column;
					} else if (sumOfRow % 2 != 0 && lastRowItem % 2 == 0){
					return column;
				}
	    		
	    	}
	        return status;
	    }
	        
	    public static int findColumn(int[][] b) {	
	    	int columnLength = b.length -1;
	    	int rowLength = b[0].length -1;
	    	int sumOfColumn = 0;
	    	int status = -1;
	    	
	    	int lastColumnItem = 0;
	    	
	    
	        for (int row = 0; row < rowLength; row++){
	        	sumOfColumn = 0;
					
	        	lastColumnItem = b[columnLength][row];
	        	
	    		for(int column=0; column< columnLength; column++){
	    			sumOfColumn += b[column][row];
	    			
	            	
	    		  		
	    		
	    		//System.out.println(sumOfColumn);
	    		System.out.println("x");
	    		System.out.println(lastColumnItem);
	        }
	    		//This if statement adds 1 if the result is 0 and adds 0 if the result is 1. ***This should be done to the new array
	    		if (sumOfColumn % 2 == 0 && lastColumnItem % 2 != 0){
					return row;
					} else if (sumOfColumn % 2 != 0 && lastColumnItem % 2 == 0){
					return row;
				}
	        }
	    	
	      return status; 
	    }
	    
	
	
	   public static int[][] correctMatrix(int[][] a){
		  
		    	findColumn(a);
		    	findRow(a);
		    	}
	    	
	    	//else if (checkColumn(a) == 1 && checkRow(a) == 1);{
	    	//return addParity(a);
	    	//}
	    	
	    }
}
