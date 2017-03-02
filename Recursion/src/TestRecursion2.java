
public class TestRecursion2 {

	static int f (int i) {
		   if (i == 0)
		     return 5;
		   else {
		     int y = f(i-1);
		     System.out.println(y+3);
		     return y+3;
		     
		   }
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(f(3));
	}
	
}
