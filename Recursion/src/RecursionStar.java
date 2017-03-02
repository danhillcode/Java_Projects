
public class RecursionStar {
	
	
	public static StringBuilder str = new StringBuilder("");
	
	public static void fun(int i){
		
		if (i == 0)
			 System.out.println("");
		else{
			str.append("*");
			System.out.println(str);
			fun(i-1);
			
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fun(5);
	}

}
