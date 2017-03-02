

/**
 * Daniel Hill
 * 29/11/2016
 * This is the Sudoku for work sheet 5. Exercise 2
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

/**
* This is the SudokuRead class which inherits from the super class Sudoku. The class is instantiated for use within the program and super is used to set the array.
*/
public class SudokuRead extends Sudoku {

	public SudokuRead(int[][] array){
		super(array);
	}
		
	
	
/**
 * This is the readSudoku method which returns a Sudoku type. it throws IllegalArgumentException and IOException.
 * @param String BadSudokuFile
 * @return Sudoku
 */	
	public static Sudoku readSudoku(String BadSudokuFile) throws IllegalArgumentException, IOException {
/**
 * This is the bigArray that is being used within the program. The try/catch method that uses the bufferReader which reads in the file. The for loop then loops over the file are reads in
 * the first 9 lines. The reader then finds the spaces " " and replaces them with 0 which allows for a sudoku to be returned which contains no empty spaces. The values are then passed into 
 * an array which is split. The second for loop then converts the array[j] values which are string and parses them into integers and then inputs them into the bigArray.  
*/
		int [][] bigArray = new int [9][9];
		
		try{ 
			BufferedReader br = new BufferedReader(new FileReader(BadSudokuFile)); 
			for(int i = 0; i < 9; i++){
			String reader = br.readLine();
			reader = reader.replaceAll(" ", "0");
			String [] array;
			array = reader.split("");
			
			if (array.length != 9){
				br.close();
				// new InputMismatchException();   	
			}
			
			
			for (int j = 0; j < 9; j++){
				
				bigArray[i][j] = Integer.parseInt(array[j]);
			}
		    }
			br.close();
		}
/**
 * This is the catch which will return File not found if the input file is not found in the corresponding specified directory. The big array which is int [][] array that is then passed to a 
 * sudoku class which creates a new instance of the Sudoku class and then returns it as a1.
 */
			 catch (IOException e){
			 System.out.println("File not found");
		 }
			
		Sudoku a1 = new Sudoku (bigArray);
			
			
			System.out.print(Arrays.deepToString(bigArray));
			
		return a1;
	}
/**
 * This is the main method which takes args as a param and can be used to call the methods from within the main class body.	
 * @param args
 */
		public static void main(String[] args) {
				try {
					System.out.println(readSudoku("./src/badsudoku.txt"));
				} catch (IllegalArgumentException | IOException e) {
					e.printStackTrace();
				}	
			}
}	
	

