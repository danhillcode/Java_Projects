public class Parity {

    public static int [][] addParity(int[][] a){
        
    	
        
    	
    	for (int row = 0; row < a.length; row++){
    		
    		for(int column=0; column<a[row].length; column++){
    			System.out.println(a[row][column]+"\t");
    		}
    		
    		System.out.println();
    		}
    
    		
    	
        
    return a;
        
    }
    
    //public static boolean checkParity([][] a)
    //if(parity bits follows the rule){
    //return true;
    //} else {return false;}
    
    public static void main(String[] args) {
    	

    	int board[][]={{01110},{10001},{10101}};
    	
    	System.out.println("This is the first line");
    	System.out.println(addParity(board));
    	
    	
        
    }
}
