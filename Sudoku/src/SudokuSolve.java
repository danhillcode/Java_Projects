
	import java.util.Arrays;

	public class SudokuSolve extends Sudoku {

		public SudokuSolve(int[][] array){
			super(array);
		}
	    
		
	    private int[][] solve(int[][] array, int idx){
	        int size = array.length;
	        if(idx == size*size){
	            if( 1 == 2){
	                System.out.println("Found a solution via very naive algorithm: ");
	                //printSolution(sudoku);
	                System.out.println();
	            }
	        } else{
	            int row = idx / size;
	            int col = idx % size;
	            if(array[row][col] != 0){ // the square is already filled in, don't do anything 
	                solve(array,idx+1);
	            } else{
	                for(int i = 1; i <= 9; i++){
	                    array[row][col] = i;
	                    solve(array,idx+1); // continue with the next square
	                    array[row][col] = 0; // unmake move
	                }
	            }
	        }
			return array;
	    }
	/*    
	    // Precondition: `sudoku` all contains numbers from 1..9 and is a 9x9 board
	    // Returns true if and only if sudoku is a valid solved sudoku board
	    private boolean isSolution(int[][] sudoku){
	        final int N = 9;
	        final int side = 3;
	        boolean[] mask = new boolean[N+1];
	        
	        // Check rows
	        for(int i = 0; i < N; i++){
	            for(int j = 0; j < N; j++){
	                int num = sudoku[i][j];
	                if(mask[num]) return false;
	                mask[num] = true;
	            }
	            Arrays.fill(mask,false);
	        }
	        
	        // Check columns
	        for(int i = 0; i < N; i++){
	            for(int j = 0; j < N; j++){
	                int num = sudoku[j][i];
	                if(mask[num]) return false;
	                mask[num] = true;
	            }
	            Arrays.fill(mask,false);
	        }
	        
	        // Check subsquares
	        
	        for(int i = 0; i < N; i += side){
	            for(int j = 0; j < N; j+= side){
	                Arrays.fill(mask,false);
	                for(int di = 0; di < side; di++){
	                    for(int dj = 0; dj < side; dj++){
	                        int num = sudoku[i+di][j+dj];
	                        if(mask[num]) return false;
	                    }
	                }
	            }
	        }
	        
	        return true; // Everything validated!
	    }
*/
	    public void runSolver(int[][] sudoku){
	    	int [][] array = {{0, 0, 0, 0, 0 , 0, 0 , 0 ,0 },
		    		{0 , 0 , 6 , 7 , 8 , 9 , 1 , 2 , 3 },
		    		{0 , 0 , 9 , 1 , 2 , 3 , 4 , 5 , 6}, 
		    		{ 0 , 0 , 4 , 5 , 6 , 7 , 8 , 9 , 1 }, 
		    		{ 0 , 0 , 7 , 8 , 9 , 1 , 2 , 3 , 4 }, 
		    		{ 0 , 0 , 1 , 2 , 3 , 4 , 5 , 6 , 7 }, 
		    		{ 0 , 0 , 5 , 6 , 7 , 8 , 9 , 1 , 2 }, 
		    		{ 0 ,  0 , 8 , 9 , 1 , 2 , 3 , 4 , 5}, 
		    		{ 0 , 0 , 2 , 3 , 4 , 5 , 6 , 7 , 9}}; 
	    	//Sudoku s1 = new Sudoku(array);
	    	System.out.println("Yay");
	    	solve(array,0);
	    }

	}