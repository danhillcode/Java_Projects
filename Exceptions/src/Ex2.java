
//import java.io.*;
import java.util.*;
//import java.text.*;
//import java.math.*;
//import java.util.regex.*;

public class Ex2 {

	public void method(){
		try{
		Scanner scanner = new Scanner(System.in);
        int myNum = scanner.nextInt();
        int myInt = scanner.nextInt();
        scanner.close();
        System.out.println("myNum is: " + myNum);
        System.out.println("myInt is: " + myInt);

        }catch (InputMismatchException inputMismatchException){

	        System.out.println(
	           "You must enter integers. Please try again.%n%n");
	        }
	
        
		
		
	}
	
    public static void main(String[] args){
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
       Ex2 m = new Ex2();
       m.method();
    	//method();
    }
}